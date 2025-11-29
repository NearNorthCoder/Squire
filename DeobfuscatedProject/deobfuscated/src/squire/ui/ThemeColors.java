/*
 * Decompiled with CFR 0.152.
 */
package squire.auth;

import java.awt.Color;

class ThemeColors {
    public static final /* synthetic */ Color PRIMARY_COLOR;
    static final /* synthetic */ Color ERROR_COLOR;
    static final /* synthetic */ Color INPUT_BACKGROUND;
    private static /* synthetic */ int[] lllIl;
    static final /* synthetic */ Color BORDER_COLOR;
    static final /* synthetic */ Color BACKGROUND_COLOR;
    public static final /* synthetic */ Color SECONDARY_COLOR;
    static final /* synthetic */ Color HOVER_COLOR;

    private static void lllIIl() {
        lllIl = new int[11];
        k.lllIl[0] = (0xB ^ 0x67) + (99 + 57 - 135 + 111) - (0x84 ^ 0x9E) + (0x6C ^ 0x45);
        k.lllIl[1] = (0x9E ^ 0xBC) + 3 - -(0xC4 ^ 0x96) + (0x4C ^ 0x14);
        k.lllIl[2] = 0x78 ^ 0x38;
        k.lllIl[3] = 85 + 66 - 53 + 148;
        k.lllIl[4] = 91 + 82 - 103 + 74;
        k.lllIl[5] = 0x62 ^ 0x65 ^ (0x59 ^ 0x63);
        k.lllIl[6] = 0x2B ^ 3;
        k.lllIl[7] = 0x42 ^ 0x5C;
        k.lllIl[8] = 0x6D ^ 0x38 ^ (0x8E ^ 0x96);
        k.lllIl[9] = 0xC0 ^ 0xBC ^ (0xE9 ^ 0x8C);
        k.lllIl[10] = (0x99 ^ 0xB3) + (0x3F ^ 0x6B) - -(0xB0 ^ 0x86) + (0x73 ^ 0x41);
    }

    k() {
    }

    static {
        k.lllIIl();
        PRIMARY_COLOR = new Color(lllIl[0], lllIl[1], lllIl[2]);
        SECONDARY_COLOR = new Color(lllIl[3], lllIl[4], lllIl[5]);
        BORDER_COLOR = new Color(lllIl[6], lllIl[6], lllIl[6]);
        BACKGROUND_COLOR = new Color(lllIl[7], lllIl[7], lllIl[7]);
        INPUT_BACKGROUND = new Color(lllIl[8], lllIl[8], lllIl[8]);
        HOVER_COLOR = new Color(lllIl[9], lllIl[9], lllIl[9]);
        ERROR_COLOR = new Color(lllIl[10], lllIl[7], lllIl[7]);
    }
}
