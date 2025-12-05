/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.client.util;

import com.google.common.base.Strings;
import gg.squire.client.Squire;
import gg.squire.client.util.SQArchive;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

public class SPCFile {
    private static final int SPC_HEADER_SIZE = 32;
    private final byte[] data;
    private final Map<String, byte[]> shards = new HashMap<String, byte[]>();

    public SPCFile(InputStream stream) throws IOException {
        this(new InputStreamReader(stream));
    }

    public SPCFile(Reader input) throws IOException {
        this.data = IOUtils.toByteArray(input, StandardCharsets.UTF_8);
        input.close();
    }

    public SPCFile(byte[] data) {
        this.data = data;
    }

    private static int magic(byte[] mover) {
        int i;
        byte[] bridge = (Squire.getIdentifier() + Squire.getKey()).getBytes();
        byte[] contract = new byte[mover.length];
        for (i = 0; i < mover.length; ++i) {
            contract[i] = (byte)(mover[i] ^ bridge[i % bridge.length]);
        }
        for (i = 0; i < contract.length; ++i) {
            mover[mover.length - i - 1] = contract[i];
        }
        for (i = 0; i < mover.length; ++i) {
            bridge[i % bridge.length] = (byte)(mover[i] ^ 0xFF);
        }
        return 0;
    }

    public void read() {
        ByteBuffer buffer = ByteBuffer.wrap(this.data);
        ByteBuffer spc = this.validateHeader(buffer);
        if (spc == null) {
            System.exit(0);
        }
        for (int i = 32; i < this.data.length; ++i) {
            this.data[i] = (byte)(this.data[i] ^ spc.get());
        }
        byte[] body = new byte[this.data.length - 32];
        if (body.length % 2 == 0) {
            Squire.capture("SPC Payload is even? Server is broken");
            System.exit(0);
            return;
        }
        System.arraycopy(this.data, 32, body, 0, body.length);
        for (int i = 0; i < body.length / 2; ++i) {
            body[this.data.length - (i + 1) - 32] = body[i];
        }
        String[] lines = StringUtils.split(new String(body), "\n");
        if (!lines[0].equals("SPC")) {
            Squire.capture("SPC Generator downloaded a non-SPC file");
            System.exit(0);
            return;
        }
        if (!lines[1].equals(Squire.getKey())) {
            Squire.capture("SPC Generator downloaded a SPC file with the wrong key");
            System.exit(0);
            return;
        }
        if (!lines[2].equals(Squire.getIdentifier())) {
            Squire.capture("SPC Generator downloaded a SPC file with the wrong identifier");
            System.exit(0);
            return;
        }
        for (int i = 3; i < lines.length; ++i) {
            if (Strings.isNullOrEmpty(lines[i])) {
                Squire.capture("SPC Generator downloaded a SPC file with an empty line");
                System.exit(0);
                return;
            }
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(lines[i]).build();
            try (Response execute = client.newCall(request).execute();){
                ResponseBody rb = execute.body();
                if (rb == null) {
                    Squire.capture("SPC Generator downloaded a SPC file with a null body");
                    System.exit(0);
                    return;
                }
                ByteString byteString = ByteString.decodeBase64(rb.string());
                if (byteString == null) {
                    Squire.capture("SPC Generator downloaded a SPC file with a null byteString");
                    System.exit(0);
                    return;
                }
                byte[] bytes = byteString.toByteArray();
                this.shard(bytes);
                continue;
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        this.dump();
    }

    private void dump() {
        for (Map.Entry<String, byte[]> entry : this.shards.entrySet()) {
            SQArchive.dump(entry.getKey(), entry.getValue());
        }
    }

    private void shard(byte[] part) {
        String name = new String(part, 0, 32);
        byte[] raw = new byte[part.length - 32];
        System.arraycopy(part, 32, raw, 0, raw.length);
        if (this.shards.containsKey(name)) {
            this.combine(name, raw, this.shards.get(name));
        } else {
            this.shards.put(name, raw);
        }
    }

    private void combine(String name, byte[] first, byte[] second) {
        byte[] combined = new byte[first.length + second.length];
        System.arraycopy(first, 0, combined, 0, first.length);
        System.arraycopy(second, 0, combined, first.length, second.length);
        this.shards.put(name, combined);
    }

    private ByteBuffer validateHeader(ByteBuffer buffer) {
        byte[] header = new byte[32];
        buffer.get(header);
        int magic = Integer.getInteger(new String(header, 0, 4), 16);
        if (magic != SPCFile.magic(header)) {
            Squire.capture("0x1f8b0800 = GZIP magic number");
            return null;
        }
        int flags = Integer.getInteger(new String(header, 4, 4), 16);
        if ((flags & 4) != 0) {
            Squire.capture("0x04 = FEXTRA");
            return null;
        }
        int xor = Integer.getInteger(new String(header, 8, 4), 16);
        if ((xor ^= Integer.getInteger(new String(header, 12, 4), 16).intValue()) - magic != SPCFile.magic(header)) {
            Squire.capture("8 byte mile = GZIP magic number pxOR");
            return null;
        }
        return ByteBuffer.wrap(header);
    }
}

