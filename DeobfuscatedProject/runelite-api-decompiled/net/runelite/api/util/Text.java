/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.text.WordUtils
 *  org.apache.commons.text.similarity.JaroWinklerDistance
 */
package net.runelite.api.util;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.runelite.api.util.JagexPrintableCharMatcher;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;
import org.apache.commons.text.similarity.JaroWinklerDistance;

public class Text {
    public static final JaroWinklerDistance DISTANCE = new JaroWinklerDistance();
    public static final Splitter COMMA_SPLITTER = Splitter.on(",").omitEmptyStrings().trimResults();
    public static final CharMatcher JAGEX_PRINTABLE_CHAR_MATCHER = new JagexPrintableCharMatcher();
    private static final StringBuilder SB = new StringBuilder(64);
    private static final Pattern TAG_REGEXP = Pattern.compile("<[^>]*>");
    private static final Joiner COMMA_JOINER = Joiner.on(",").skipNulls();

    public static List<String> fromCSV(String input) {
        return COMMA_SPLITTER.splitToList(input);
    }

    public static String toCSV(Collection<String> input) {
        return COMMA_JOINER.join(input);
    }

    public static String removeTags(String str, boolean removeLevels) {
        int close;
        int levelIdx;
        if (str == null) {
            return null;
        }
        if (removeLevels && (levelIdx = StringUtils.lastIndexOf((CharSequence)str, "  (level")) >= 0) {
            str = str.substring(0, levelIdx);
        }
        int strLen = str.length();
        int open = StringUtils.indexOf((CharSequence)str, 60);
        if (open == -1 || (close = StringUtils.indexOf((CharSequence)str, 62, open)) == -1) {
            return strLen == str.length() ? str : str.substring(0, strLen - 1);
        }
        if (open == 0) {
            open = close + 1;
            if (open >= strLen) {
                return "";
            }
            if ((open = StringUtils.indexOf((CharSequence)str, 60, open)) == -1 || StringUtils.indexOf((CharSequence)str, 62, open) == -1) {
                return StringUtils.substring(str, close + 1);
            }
            open = 0;
        }
        SB.setLength(0);
        int i = 0;
        while (true) {
            if (open != i) {
                SB.append(str.charAt(i++));
                continue;
            }
            i = close + 1;
            open = StringUtils.indexOf((CharSequence)str, 60, close);
            if (open == -1 || (close = StringUtils.indexOf((CharSequence)str, 62, open)) == -1 || i >= strLen) break;
        }
        while (i < strLen) {
            SB.append(str.charAt(i++));
        }
        return SB.toString();
    }

    public static String removeTags(String str) {
        return Text.removeTags(str, false);
    }

    public static String removeFormattingTags(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        Matcher matcher = TAG_REGEXP.matcher(str);
        while (matcher.find()) {
            String match;
            matcher.appendReplacement(stringBuilder, "");
            switch (match = matcher.group(0)) {
                case "<lt>": 
                case "<gt>": {
                    stringBuilder.append(match);
                }
            }
        }
        matcher.appendTail(stringBuilder);
        return stringBuilder.toString();
    }

    public static String standardize(String str, boolean removeLevel) {
        if (StringUtils.isBlank(str)) {
            return str;
        }
        return Text.removeTags(str, removeLevel).replace('\u00a0', ' ').trim().toLowerCase();
    }

    public static String standardize(String str) {
        return Text.standardize(str, false);
    }

    public static String toJagexName(String str) {
        return CharMatcher.ascii().retainFrom(str.replaceAll("[\u00a0_-]", " ")).trim();
    }

    public static String sanitizeMultilineText(String str) {
        return Text.removeTags(str.replaceAll("-<br>", "-").replaceAll("<br>", " ").replaceAll("[ ]+", " "));
    }

    public static String escapeJagex(String str) {
        StringBuilder out = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (c == '<') {
                out.append("<lt>");
                continue;
            }
            if (c == '>') {
                out.append("<gt>");
                continue;
            }
            if (c == '\n') {
                out.append("<br>");
                continue;
            }
            if (c == '\r') continue;
            out.append(c);
        }
        return out.toString();
    }

    public static String sanitize(String name) {
        String cleaned = name.contains("<img") ? name.substring(name.lastIndexOf(62) + 1) : name;
        return cleaned.replace('\u00a0', ' ');
    }

    public static String titleCase(Enum o) {
        String toString = o.toString();
        if (o.name().equals(toString)) {
            return WordUtils.capitalize((String)toString.toLowerCase(), (char[])new char[]{'_'}).replace('_', ' ');
        }
        return toString;
    }

    public static boolean matchesSearchTerms(Iterable<String> searchTerms, Collection<String> keywords) {
        for (String term : searchTerms) {
            if (!keywords.stream().noneMatch(t -> t.contains(term) || DISTANCE.apply((CharSequence)t, (CharSequence)term) > 0.9)) continue;
            return false;
        }
        return true;
    }
}

