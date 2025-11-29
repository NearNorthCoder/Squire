package net.runelite.launcher.logging;

import okhttp3.*;
import okio.Buffer;
import okio.BufferedSource;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Comprehensive OkHttp interceptor that logs ALL network traffic
 * including full request/response bodies in clear text.
 */
public class NetworkLoggingInterceptor implements Interceptor {

    private static final Charset UTF8 = StandardCharsets.UTF_8;
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static final SimpleDateFormat FILE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private static PrintWriter fileWriter;
    private static final Object writerLock = new Object();
    private static long requestCounter = 0;

    static {
        initializeFileWriter();
    }

    private static void initializeFileWriter() {
        try {
            String userHome = System.getProperty("user.home");
            File logDir = new File(userHome, ".squire/logs");
            if (!logDir.exists()) {
                logDir.mkdirs();
            }
            String filename = "network_" + FILE_DATE_FORMAT.format(new Date()) + ".log";
            File logFile = new File(logDir, filename);
            fileWriter = new PrintWriter(new FileWriter(logFile, true), true);
            System.out.println("[NetworkLogger] Logging to: " + logFile.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("[NetworkLogger] Failed to initialize log file: " + e.getMessage());
        }
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        long requestId;

        synchronized (writerLock) {
            requestId = ++requestCounter;
        }

        String timestamp = DATE_FORMAT.format(new Date());

        // Log the request
        StringBuilder requestLog = new StringBuilder();
        requestLog.append("\n");
        requestLog.append("╔══════════════════════════════════════════════════════════════════════════════\n");
        requestLog.append(String.format("║ REQUEST #%d @ %s\n", requestId, timestamp));
        requestLog.append("╠══════════════════════════════════════════════════════════════════════════════\n");
        requestLog.append(String.format("║ %s %s\n", request.method(), request.url()));
        requestLog.append("║\n");
        requestLog.append("║ HEADERS:\n");

        Headers requestHeaders = request.headers();
        for (int i = 0; i < requestHeaders.size(); i++) {
            String name = requestHeaders.name(i);
            String value = requestHeaders.value(i);
            requestLog.append(String.format("║   %s: %s\n", name, value));
        }

        // Log request body
        RequestBody requestBody = request.body();
        if (requestBody != null) {
            requestLog.append("║\n");
            requestLog.append("║ REQUEST BODY:\n");

            try {
                Buffer buffer = new Buffer();
                requestBody.writeTo(buffer);

                Charset charset = UTF8;
                MediaType contentType = requestBody.contentType();
                if (contentType != null) {
                    Charset ctCharset = contentType.charset(UTF8);
                    if (ctCharset != null) charset = ctCharset;
                    requestLog.append(String.format("║   Content-Type: %s\n", contentType));
                }
                requestLog.append(String.format("║   Content-Length: %d bytes\n", requestBody.contentLength()));
                requestLog.append("║   ─────────────────────────────────────────────────────────────────────────\n");

                String bodyContent = buffer.readString(charset);
                if (bodyContent.trim().startsWith("{") || bodyContent.trim().startsWith("[")) {
                    bodyContent = prettyPrintJson(bodyContent);
                }
                for (String line : bodyContent.split("\n")) {
                    requestLog.append(String.format("║   %s\n", line));
                }
            } catch (Exception e) {
                requestLog.append(String.format("║   [Failed to read body: %s]\n", e.getMessage()));
            }
        } else {
            requestLog.append("║\n");
            requestLog.append("║ REQUEST BODY: (none)\n");
        }

        requestLog.append("╚══════════════════════════════════════════════════════════════════════════════\n");

        String requestLogStr = requestLog.toString();
        System.out.println(requestLogStr);
        writeToFile(requestLogStr);

        // Execute the request
        long startNs = System.nanoTime();
        Response response;
        try {
            response = chain.proceed(request);
        } catch (Exception e) {
            StringBuilder errorLog = new StringBuilder();
            errorLog.append("\n");
            errorLog.append("╔══════════════════════════════════════════════════════════════════════════════\n");
            errorLog.append(String.format("║ RESPONSE #%d @ %s - ERROR\n", requestId, DATE_FORMAT.format(new Date())));
            errorLog.append("╠══════════════════════════════════════════════════════════════════════════════\n");
            errorLog.append(String.format("║ FAILED: %s\n", e.getMessage()));
            errorLog.append(String.format("║ Exception: %s\n", e.getClass().getName()));
            errorLog.append("╚══════════════════════════════════════════════════════════════════════════════\n");

            String errorLogStr = errorLog.toString();
            System.out.println(errorLogStr);
            writeToFile(errorLogStr);
            throw e;
        }

        long tookMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startNs);
        timestamp = DATE_FORMAT.format(new Date());

        // Log the response
        StringBuilder responseLog = new StringBuilder();
        responseLog.append("\n");
        responseLog.append("╔══════════════════════════════════════════════════════════════════════════════\n");
        responseLog.append(String.format("║ RESPONSE #%d @ %s (took %dms)\n", requestId, timestamp, tookMs));
        responseLog.append("╠══════════════════════════════════════════════════════════════════════════════\n");
        responseLog.append(String.format("║ %d %s\n", response.code(), response.message()));
        responseLog.append(String.format("║ URL: %s\n", response.request().url()));
        responseLog.append("║\n");
        responseLog.append("║ HEADERS:\n");

        Headers responseHeaders = response.headers();
        for (int i = 0; i < responseHeaders.size(); i++) {
            responseLog.append(String.format("║   %s: %s\n", responseHeaders.name(i), responseHeaders.value(i)));
        }

        // Log response body
        ResponseBody responseBody = response.body();
        if (responseBody != null) {
            responseLog.append("║\n");
            responseLog.append("║ RESPONSE BODY:\n");

            MediaType contentType = responseBody.contentType();
            if (contentType != null) {
                responseLog.append(String.format("║   Content-Type: %s\n", contentType));
            }

            long contentLength = responseBody.contentLength();
            if (contentLength != -1) {
                responseLog.append(String.format("║   Content-Length: %d bytes\n", contentLength));
            }

            if (isReadableBody(contentType)) {
                responseLog.append("║   ─────────────────────────────────────────────────────────────────────────\n");

                try {
                    BufferedSource source = responseBody.source();
                    source.request(Long.MAX_VALUE);
                    Buffer buffer = source.getBuffer().clone();

                    Charset charset = UTF8;
                    if (contentType != null) {
                        Charset ctCharset = contentType.charset(UTF8);
                        if (ctCharset != null) charset = ctCharset;
                    }

                    if (buffer.size() > 0) {
                        String bodyContent = buffer.readString(charset);
                        if (bodyContent.length() > 50000) {
                            bodyContent = bodyContent.substring(0, 50000) + "\n... [TRUNCATED - " + (bodyContent.length() - 50000) + " more bytes]";
                        }
                        if (bodyContent.trim().startsWith("{") || bodyContent.trim().startsWith("[")) {
                            bodyContent = prettyPrintJson(bodyContent);
                        }
                        for (String line : bodyContent.split("\n")) {
                            responseLog.append(String.format("║   %s\n", line));
                        }
                    } else {
                        responseLog.append("║   (empty body)\n");
                    }
                } catch (Exception e) {
                    responseLog.append(String.format("║   [Failed to read body: %s]\n", e.getMessage()));
                }
            } else {
                responseLog.append(String.format("║   [Binary content - %s]\n", contentType));
            }
        } else {
            responseLog.append("║\n");
            responseLog.append("║ RESPONSE BODY: (none)\n");
        }

        responseLog.append("╚══════════════════════════════════════════════════════════════════════════════\n");

        String responseLogStr = responseLog.toString();
        System.out.println(responseLogStr);
        writeToFile(responseLogStr);

        return response;
    }

    private boolean isReadableBody(MediaType contentType) {
        if (contentType == null) return true;
        String type = contentType.type();
        String subtype = contentType.subtype();

        if ("text".equals(type)) return true;
        if ("application".equals(type)) {
            return subtype.contains("json") ||
                   subtype.contains("xml") ||
                   subtype.contains("javascript") ||
                   subtype.contains("x-www-form-urlencoded") ||
                   subtype.contains("html");
        }
        return false;
    }

    private String prettyPrintJson(String json) {
        try {
            StringBuilder sb = new StringBuilder();
            int indent = 0;
            boolean inString = false;
            char prevChar = 0;

            for (int i = 0; i < json.length(); i++) {
                char c = json.charAt(i);

                if (c == '"' && prevChar != '\\') {
                    inString = !inString;
                    sb.append(c);
                } else if (!inString) {
                    switch (c) {
                        case '{':
                        case '[':
                            sb.append(c);
                            sb.append('\n');
                            indent++;
                            addIndent(sb, indent);
                            break;
                        case '}':
                        case ']':
                            sb.append('\n');
                            indent--;
                            addIndent(sb, indent);
                            sb.append(c);
                            break;
                        case ',':
                            sb.append(c);
                            sb.append('\n');
                            addIndent(sb, indent);
                            break;
                        case ':':
                            sb.append(c);
                            sb.append(' ');
                            break;
                        case ' ':
                        case '\n':
                        case '\t':
                        case '\r':
                            break;
                        default:
                            sb.append(c);
                    }
                } else {
                    sb.append(c);
                }
                prevChar = c;
            }
            return sb.toString();
        } catch (Exception e) {
            return json;
        }
    }

    private void addIndent(StringBuilder sb, int indent) {
        for (int i = 0; i < indent; i++) {
            sb.append("  ");
        }
    }

    private static void writeToFile(String content) {
        synchronized (writerLock) {
            if (fileWriter != null) {
                try {
                    fileWriter.print(content);
                    fileWriter.flush();
                } catch (Exception e) {
                    // Ignore
                }
            }
        }
    }
}
