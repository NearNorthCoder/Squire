/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ChatMessageType
 *  net.runelite.client.chat.ChatColorType
 *  net.runelite.client.chat.ChatMessageBuilder
 *  net.runelite.client.chat.QueuedMessage
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.slf4j.helpers.FormattingTuple
 *  org.slf4j.helpers.MessageFormatter
 */
package gg.squire.client.util;

import java.awt.Color;
import net.runelite.api.ChatMessageType;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.QueuedMessage;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

public class Log {
    private static final Logger log = LoggerFactory.getLogger(Log.class);
    private static final Color DEBUG_COLOR = new Color(139, 154, 139);
    private static final Color INFO_COLOR = new Color(5, 216, 239);
    private static final Color WARN_COLOR = new Color(16750623);
    private static final Color ERROR_COLOR = new Color(255, 0, 0);
    MessageFormatter messageFormatter;

    public static void debug(String msg) {
        Log.log(DEBUG_COLOR, msg);
        log.debug(msg);
    }

    public static void debug(String format, Object ... arguments) {
        FormattingTuple formatted = MessageFormatter.arrayFormat((String)format, (Object[])arguments);
        Log.log(DEBUG_COLOR, formatted.getMessage());
        log.debug(format, arguments);
    }

    public static void debug(String msg, Throwable t) {
        Log.log(DEBUG_COLOR, String.format(msg, t));
        log.debug(msg, t);
    }

    public static void info(String msg) {
        Log.log(INFO_COLOR, msg);
        log.info(msg);
    }

    public static void info(String format, Object ... arguments) {
        FormattingTuple formatted = MessageFormatter.arrayFormat((String)format, (Object[])arguments);
        Log.log(INFO_COLOR, formatted.getMessage());
        log.info(format, arguments);
    }

    public static void info(String msg, Throwable t) {
        Log.log(INFO_COLOR, String.format(msg, t));
        log.info(msg, t);
    }

    public static void warn(String msg) {
        Log.log(WARN_COLOR, msg);
        log.warn(msg);
    }

    public static void warn(String format, Object ... arguments) {
        FormattingTuple formatted = MessageFormatter.arrayFormat((String)format, (Object[])arguments);
        Log.log(WARN_COLOR, formatted.getMessage());
        log.warn(format, arguments);
    }

    public static void warn(String msg, Throwable t) {
        Log.log(WARN_COLOR, String.format(msg, t));
        log.warn(msg, t);
    }

    public static void error(String msg) {
        Log.log(ERROR_COLOR, msg);
        log.error(msg);
    }

    public static void error(String format, Object ... arguments) {
        FormattingTuple formatted = MessageFormatter.arrayFormat((String)format, (Object[])arguments);
        Log.log(ERROR_COLOR, formatted.getMessage());
        log.error(format, arguments);
    }

    public static void error(String msg, Throwable t) {
        Log.log(ERROR_COLOR, String.format(msg, t));
        log.error(msg, t);
    }

    private static void log(Color color, String message) {
        if (Static.getSquireConfig().disableDebugOverlay()) {
            return;
        }
        StackWalker walker = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
        Class callerClass = walker.walk(frames -> frames.map(StackWalker.StackFrame::getDeclaringClass).filter(sf -> sf.getDeclaringClass() != Log.class).skip(2L).findFirst()).orElse(null);
        if (callerClass == null) {
            return;
        }
        String prefix = "[" + callerClass.getSimpleName() + "] ";
        log.info(prefix + message);
        String build = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append(color, prefix).append(ChatColorType.NORMAL).append(color, message).build();
        Static.getChatMessageManager().queue(QueuedMessage.builder().type(ChatMessageType.CONSOLE).runeLiteFormattedMessage(build).build());
    }
}
