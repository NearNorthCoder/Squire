package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import net.runelite.api.GameState;
import net.runelite.api.MenuAction;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/c.class */
/* synthetic */ class C0028c {
    private static /* synthetic */ int[] lIllllIlIIlI;
    static final /* synthetic */ int[] D;
    static final /* synthetic */ int[] C;

    private static void lllIlllIIlllll() {
        lIllllIlIIlI = new int[6];
        lIllllIlIIlI[0] = " ".length();
        lIllllIlIIlI[1] = "  ".length();
        lIllllIlIIlI[2] = "   ".length();
        lIllllIlIIlI[3] = 167 ^ 163;
        lIllllIlIIlI[4] = (75 ^ 118) ^ (16 ^ 40);
        lIllllIlIIlI[5] = 57 ^ 63;
    }

    static {
        lllIlllIIlllll();
        D = new int[GameState.values().length];
        try {
            D[GameState.LOGGED_IN.ordinal()] = lIllllIlIIlI[0];
            "".length();
            if (" ".length() == 0) {
                return;
            }
        } catch (NoSuchFieldError e) {
        }
        try {
            D[GameState.LOADING.ordinal()] = lIllllIlIIlI[1];
            "".length();
            if ("  ".length() < ((120 ^ 94) & ((39 ^ 1) ^ (-1)))) {
                return;
            }
        } catch (NoSuchFieldError e2) {
        }
        C = new int[MenuAction.values().length];
        try {
            C[MenuAction.WIDGET_TARGET_ON_GAME_OBJECT.ordinal()] = lIllllIlIIlI[0];
            "".length();
            if ("   ".length() < "  ".length()) {
                return;
            }
        } catch (NoSuchFieldError e3) {
        }
        try {
            C[MenuAction.GAME_OBJECT_FIRST_OPTION.ordinal()] = lIllllIlIIlI[1];
            "".length();
            if (((77 ^ 125) & ((6 ^ 54) ^ (-1))) > ((97 ^ 61) & ((34 ^ 126) ^ (-1)))) {
                return;
            }
        } catch (NoSuchFieldError e4) {
        }
        try {
            C[MenuAction.GAME_OBJECT_SECOND_OPTION.ordinal()] = lIllllIlIIlI[2];
            "".length();
            if ((-(174 ^ 171)) >= 0) {
                return;
            }
        } catch (NoSuchFieldError e5) {
        }
        try {
            C[MenuAction.GAME_OBJECT_THIRD_OPTION.ordinal()] = lIllllIlIIlI[3];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        } catch (NoSuchFieldError e6) {
        }
        try {
            C[MenuAction.GAME_OBJECT_FOURTH_OPTION.ordinal()] = lIllllIlIIlI[4];
            "".length();
            if (0 != 0) {
                return;
            }
        } catch (NoSuchFieldError e7) {
        }
        try {
            C[MenuAction.GAME_OBJECT_FIFTH_OPTION.ordinal()] = lIllllIlIIlI[5];
            "".length();
            if ("   ".length() <= 0) {
            }
        } catch (NoSuchFieldError e8) {
        }
    }
}
