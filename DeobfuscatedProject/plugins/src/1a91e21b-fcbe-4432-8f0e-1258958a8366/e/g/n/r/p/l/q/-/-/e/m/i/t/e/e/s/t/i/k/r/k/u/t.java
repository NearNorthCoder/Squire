/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  kotlin.collections.ArrayDeque
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.a;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.u;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.x;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArrayDeque;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Handling bog")
public class t
extends x {
    private static /* synthetic */ int[] lIIllIIlllIlI;
    private static /* synthetic */ String[] lIIllIIlllIIl;
    private /* synthetic */ List<TileObject> ad;

    private static String lIllIIIIIIIIIIl(String llllllllllllllIllllIIIIIlIllIIIl, String llllllllllllllIllllIIIIIlIllIIII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIlIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIlIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIIlIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIIlIllIIll.init(lIIllIIlllIlI[3], llllllllllllllIllllIIIIIlIllIlII);
            return new String(llllllllllllllIllllIIIIIlIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIIlIllIIlI) {
            llllllllllllllIllllIIIIIlIllIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIIIIlIl() {
        lIIllIIlllIlI = new int[14];
        t.lIIllIIlllIlI[0] = " ".length();
        t.lIIllIIlllIlI[1] = (0x8D ^ 0xB8) & ~(0x2A ^ 0x1F);
        t.lIIllIIlllIlI[2] = 0x1E ^ 1 ^ (0x6F ^ 0x77);
        t.lIIllIIlllIlI[3] = "  ".length();
        t.lIIllIIlllIlI[4] = 0x9A ^ 0x9F;
        t.lIIllIIlllIlI[5] = "   ".length();
        t.lIIllIIlllIlI[6] = 0xA1 ^ 0xA5;
        t.lIIllIIlllIlI[7] = 98 + 76 - 40 + 1 ^ 101 + 109 - 134 + 105;
        t.lIIllIIlllIlI[8] = 0x82 ^ 0x9F ^ (0x88 ^ 0x9F);
        t.lIIllIIlllIlI[9] = 0xFFFFB75F & 0x7EAE;
        t.lIIllIIlllIlI[10] = 0x72 ^ 0x74;
        t.lIIllIIlllIlI[11] = 0x85 ^ 0x83 ^ (5 ^ 0xA);
        t.lIIllIIlllIlI[12] = 0x76 ^ 0x5E;
        t.lIIllIIlllIlI[13] = 0x43 ^ 0x50 ^ (0x61 ^ 0x7A);
    }

    private static void lIllIIIIIIIIIll() {
        lIIllIIlllIIl = new String[lIIllIIlllIlI[13]];
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[1]] = t.lIlIlllllllllll("qsznc4/Y8weoNKtt+4qHpY1H8Xf9NeJgdHwi7wqkGN5NPImmgQsScnvBdURSxM1A9Apz76At18rx5/pktWr/6w==", "bazPi");
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[0]] = t.lIlIlllllllllll("/4GgymguIcK3i/nvLF7mYS9pRswHLB7RAD9eL93+94T3IVEgn1nP/jB9Wp+bRZU7c6UMu5el6VQAYeXpmWG9h8tFelgSkPOiV2AfGEnH+25mleY0z79YGRVsoxabv5a7a9uOQCgeMT3HBO7IPHJ4vw==", "AilEX");
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[3]] = t.lIlIlllllllllll("8YdXu8hOz7He08zCxv12t9EHvlRYARz/lhqBXhnmkhMHh7Dcw6/DYIeU+RQC0tA9", "pzwQF");
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[5]] = t.lIllIIIIIIIIIIl("QitVgSePBh9EVTA+Kcd+jQ==", "HZuOL");
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[6]] = t.lIllIIIIIIIIIIl("TF2J4Zrn26JxyFsTQhjnnw==", "hRURq");
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[4]] = t.lIlIlllllllllll("ex7IP3CX6xUvhDNbvzSGj9JRBwuUcCOV", "dTNnN");
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[10]] = t.lIlIlllllllllll("zshM7oNlq6c=", "qVvVu");
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[2]] = t.lIllIIIIIIIIIIl("Y1pAmrzG3SL4xOh+SKH/+A==", "PalsD");
    }

    private static boolean lIllIIIIIIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIIlIIII(int n2) {
        return n2 >= 0;
    }

    /*
     * WARNING - void declaration
     */
    public int[][] a(List<TileObject> list) {
        void llllllllllllllIllllIIIIIllIIllll;
        void llllllllllllllIllllIIIIIllIlIIII;
        int[][] nArray = new int[lIIllIIlllIlI[8]][lIIllIIlllIlI[8]];
        int llllllllllllllIllllIIIIIllIIlllI = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIlllI, llllllllllllllIllllIIIIIllIlIIII.size())) {
            TileObject llllllllllllllIllllIIIIIllIIllIl = (TileObject)llllllllllllllIllllIIIIIllIlIIII.get(llllllllllllllIllllIIIIIllIIlllI);
            if (t.lIllIIIIIIIlIll(llllllllllllllIllllIIIIIllIIllIl) && t.lIllIIIIIIIllll(llllllllllllllIllllIIIIIllIIllIl.getId(), lIIllIIlllIlI[9])) {
                llllllllllllllIllllIIIIIllIIllll[llllllllllllllIllllIIIIIllIIlllI / t.lIIllIIlllIlI[8] + t.lIIllIIlllIlI[0]][llllllllllllllIllllIIIIIllIIlllI % t.lIIllIIlllIlI[8]] = lIIllIIlllIlI[0];
            }
            ++llllllllllllllIllllIIIIIllIIlllI;
            "".length();
            if (-"  ".length() <= 0) continue;
            return null;
        }
        llllllllllllllIllllIIIIIllIIlllI = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIlllI, ((void)llllllllllllllIllllIIIIIllIIllll[lIIllIIlllIlI[1]]).length)) {
            llllllllllllllIllllIIIIIllIIllll[t.lIIllIIlllIlI[1]][llllllllllllllIllllIIIIIllIIlllI] = lIIllIIlllIlI[0];
            llllllllllllllIllllIIIIIllIIllll[t.lIIllIIlllIlI[10]][llllllllllllllIllllIIIIIllIIlllI] = lIIllIIlllIlI[0];
            ++llllllllllllllIllllIIIIIllIIlllI;
            "".length();
            if ("   ".length() >= 0) continue;
            return null;
        }
        llllllllllllllIllllIIIIIllIIlllI = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIlllI, lIIllIIlllIlI[5])) {
            llllllllllllllIllllIIIIIllIIllll[t.lIIllIIlllIlI[2] + llllllllllllllIllllIIIIIllIIlllI][t.lIIllIIlllIlI[11]] = lIIllIIlllIlI[0];
            ++llllllllllllllIllllIIIIIllIIlllI;
            "".length();
            if ("  ".length() > 0) continue;
            return null;
        }
        return nArray;
    }

    private static boolean lIllIIIIIIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public TileObject b(List<TileObject> list) {
        void llllllllllllllIllllIIIIIlIllllIl;
        int llllllllllllllIllllIIIIIlIlllIll = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIlIlllIll, llllllllllllllIllllIIIIIlIllllIl.size())) {
            TileObject llllllllllllllIllllIIIIIlIllllII = (TileObject)llllllllllllllIllllIIIIIlIllllIl.get(llllllllllllllIllllIIIIIlIlllIll);
            if (t.lIllIIIIIIIlIll(llllllllllllllIllllIIIIIlIllllII) && t.lIllIIIIIIIIllI(llllllllllllllIllllIIIIIlIllllII.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0) && t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIlIlllIll + lIIllIIlllIlI[0], llllllllllllllIllllIIIIIlIllllIl.size())) {
                return (TileObject)llllllllllllllIllllIIIIIlIllllIl.get(llllllllllllllIllllIIIIIlIlllIll + lIIllIIlllIlI[0]);
            }
            ++llllllllllllllIllllIIIIIlIlllIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return list.get(lIIllIIlllIlI[1]);
    }

    private static boolean lIllIIIIIIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIIIIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean z() {
        Object llllllllllllllIllllIIIIIllIlIlll;
        t llllllllllllllIllllIIIIIllIllIlI;
        String string;
        if (t.lIllIIIIIIIIllI(Dialog.isOpen() ? 1 : 0) && t.lIllIIIIIIIIlll((string = Dialog.getText()).length()) && (!t.lIllIIIIIIIlIII(string.contains(lIIllIIlllIIl[lIIllIIlllIlI[1]]) ? 1 : 0) || !t.lIllIIIIIIIlIII(string.contains(lIIllIIlllIIl[lIIllIIlllIlI[0]]) ? 1 : 0) || t.lIllIIIIIIIIllI(string.contains(lIIllIIlllIIl[lIIllIIlllIlI[3]]) ? 1 : 0))) {
            return lIIllIIlllIlI[1];
        }
        Player llllllllllllllIllllIIIIIllIllIIl = Players.getLocal();
        if (t.lIllIIIIIIIlIIl(llllllllllllllIllllIIIIIllIllIIl)) {
            return lIIllIIlllIlI[1];
        }
        TileObject llllllllllllllIllllIIIIIllIllIII = llllllllllllllIllllIIIIIllIllIlI.A();
        if (t.lIllIIIIIIIlIIl(llllllllllllllIllllIIIIIllIllIII)) {
            return lIIllIIlllIlI[1];
        }
        if (t.lIllIIIIIIIlIlI(llllllllllllllIllllIIIIIllIllIIl.distanceTo((Locatable)llllllllllllllIllllIIIIIllIllIII), lIIllIIlllIlI[4])) {
            llllllllllllllIllllIIIIIllIllIlI.ad.clear();
            llllllllllllllIllllIIIIIllIllIII.interact(lIIllIIlllIIl[lIIllIIlllIlI[5]]);
            return lIIllIIlllIlI[0];
        }
        if (t.lIllIIIIIIIlIII(llllllllllllllIllllIIIIIllIllIlI.ad.isEmpty() ? 1 : 0) && t.lIllIIIIIIIlIll(llllllllllllllIllllIIIIIllIlIlll = llllllllllllllIllllIIIIIllIllIlI.b(llllllllllllllIllllIIIIIllIllIlI.ad))) {
            llllllllllllllIllllIIIIIllIlIlll.interact(lIIllIIlllIIl[lIIllIIlllIlI[6]]);
            return lIIllIIlllIlI[0];
        }
        if (t.lIllIIIIIIIIllI(llllllllllllllIllllIIIIIllIllIlI.ad.isEmpty() ? 1 : 0)) {
            llllllllllllllIllllIIIIIllIlIlll = TileObjects.getAll(tileObject -> {
                int n2;
                if (t.lIllIIIIIIIIllI(tileObject.getName().equals(lIIllIIlllIIl[lIIllIIlllIlI[10]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIIlllIlI[0]];
                    stringArray[t.lIIllIIlllIlI[1]] = lIIllIIlllIIl[lIIllIIlllIlI[2]];
                    if (t.lIllIIIIIIIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIllIIlllIlI[0];
                        "".length();
                        if ((0x53 ^ 0x21 ^ (0xF5 ^ 0x83)) > 0) return n2 != 0;
                        return ((0x2A ^ 0x46 ^ (0x4E ^ 0x12)) & (84 + 7 - 37 + 73 ^ (0x1F ^ 0x50) ^ -" ".length())) != 0;
                    }
                }
                n2 = lIIllIIlllIlI[1];
                return n2 != 0;
            });
            llllllllllllllIllllIIIIIllIlIlll.sort(new u(llllllllllllllIllllIIIIIllIllIlI));
            if (t.lIllIIIIIIIllII(llllllllllllllIllllIIIIIllIlIlll.size(), lIIllIIlllIlI[7])) {
                int[][] llllllllllllllIllllIIIIIllIlIllI = llllllllllllllIllllIIIIIllIllIlI.a((List<TileObject>)llllllllllllllIllllIIIIIllIlIlll);
                int[][] llllllllllllllIllllIIIIIllIlIlIl = a.b(llllllllllllllIllllIIIIIllIlIllI);
                llllllllllllllIllllIIIIIllIllIlI.ad = llllllllllllllIllllIIIIIllIllIlI.a(llllllllllllllIllllIIIIIllIlIlIl, (List<TileObject>)llllllllllllllIllllIIIIIllIlIlll);
                if (t.lIllIIIIIIIllIl(llllllllllllllIllllIIIIIllIllIII.getWorldY(), Players.getLocal().getWorldY())) {
                    Collections.reverse(llllllllllllllIllllIIIIIllIllIlI.ad);
                }
            }
        }
        return lIIllIIlllIlI[1];
    }

    /*
     * WARNING - void declaration
     */
    public List<TileObject> a(int[][] nArray, List<TileObject> list) {
        void var5_6;
        int llllllllllllllIllllIIIIIllIIIIIl;
        void llllllllllllllIllllIIIIIllIIIlII;
        int llllllllllllllIllllIIIIIllIIIIll;
        void llllllllllllllIllllIIIIIllIIIllI;
        ArrayList arrayList = new ArrayList();
        int n2 = lIIllIIlllIlI[1];
        int llllllllllllllIllllIIIIIllIIIIlI22 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIIIlI22, ((void)llllllllllllllIllllIIIIIllIIIllI[lIIllIIlllIlI[1]]).length)) {
            if (t.lIllIIIIIIIllll((int)llllllllllllllIllllIIIIIllIIIllI[lIIllIIlllIlI[1]][llllllllllllllIllllIIIIIllIIIIlI22], lIIllIIlllIlI[0])) {
                llllllllllllllIllllIIIIIllIIIIll = llllllllllllllIllllIIIIIllIIIIlI22;
                llllllllllllllIllllIIIIIllIIIlII.add(llllllllllllllIllllIIIIIllIIIIll);
                "".length();
                "".length();
                if ("   ".length() >= ((0x35 ^ 0x50 ^ (0x76 ^ 0x17)) & (0x5A ^ 0x5F ^ " ".length() ^ -" ".length()))) break;
                return null;
            }
            ++llllllllllllllIllllIIIIIllIIIIlI22;
            "".length();
            if (((0x58 ^ 0x44) & ~(0x46 ^ 0x5A)) == 0) continue;
            return null;
        }
        while (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIIIll, lIIllIIlllIlI[12])) {
            llllllllllllllIllllIIIIIllIIIIlI22 = llllllllllllllIllllIIIIIllIIIIll / lIIllIIlllIlI[8];
            llllllllllllllIllllIIIIIllIIIIIl = llllllllllllllIllllIIIIIllIIIIll % lIIllIIlllIlI[8];
            if (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0], lIIllIIlllIlI[4]) && t.lIllIIIIIIIllll((int)llllllllllllllIllllIIIIIllIIIllI[llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0]][llllllllllllllIllllIIIIIllIIIIIl], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(llllllllllllllIllllIIIIIllIIIlII.contains((llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + llllllllllllllIllllIIIIIllIIIIIl) ? 1 : 0)) {
                llllllllllllllIllllIIIIIllIIIIll = (llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + llllllllllllllIllllIIIIIllIIIIIl;
                llllllllllllllIllllIIIIIllIIIlII.add(llllllllllllllIllllIIIIIllIIIIll);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
            } else if (t.lIllIIIIIIlIIII(llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]) && t.lIllIIIIIIIllll((int)llllllllllllllIllllIIIIIllIIIllI[llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]][llllllllllllllIllllIIIIIllIIIIIl], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(llllllllllllllIllllIIIIIllIIIlII.contains((llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + llllllllllllllIllllIIIIIllIIIIIl) ? 1 : 0)) {
                llllllllllllllIllllIIIIIllIIIIll = (llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + llllllllllllllIllllIIIIIllIIIIIl;
                llllllllllllllIllllIIIIIllIIIlII.add(llllllllllllllIllllIIIIIllIIIIll);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
            } else if (t.lIllIIIIIIlIIII(llllllllllllllIllllIIIIIllIIIIIl - lIIllIIlllIlI[0]) && t.lIllIIIIIIIllll((int)llllllllllllllIllllIIIIIllIIIllI[llllllllllllllIllllIIIIIllIIIIlI22][llllllllllllllIllllIIIIIllIIIIIl - lIIllIIlllIlI[0]], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(llllllllllllllIllllIIIIIllIIIlII.contains(llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + llllllllllllllIllllIIIIIllIIIIIl - lIIllIIlllIlI[0]) ? 1 : 0)) {
                llllllllllllllIllllIIIIIllIIIIll = llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + llllllllllllllIllllIIIIIllIIIIIl - lIIllIIlllIlI[0];
                llllllllllllllIllllIIIIIllIIIlII.add(llllllllllllllIllllIIIIIllIIIIll);
                "".length();
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            } else if (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIIIIl + lIIllIIlllIlI[0], lIIllIIlllIlI[8]) && t.lIllIIIIIIIllll((int)llllllllllllllIllllIIIIIllIIIllI[llllllllllllllIllllIIIIIllIIIIlI22][llllllllllllllIllllIIIIIllIIIIIl + lIIllIIlllIlI[0]], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(llllllllllllllIllllIIIIIllIIIlII.contains(llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + llllllllllllllIllllIIIIIllIIIIIl + lIIllIIlllIlI[0]) ? 1 : 0)) {
                llllllllllllllIllllIIIIIllIIIIll = llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + llllllllllllllIllllIIIIIllIIIIIl + lIIllIIlllIlI[0];
                llllllllllllllIllllIIIIIllIIIlII.add(llllllllllllllIllllIIIIIllIIIIll);
                "".length();
            }
            "".length();
            if ("  ".length() > 0) continue;
            return null;
        }
        ArrayList<TileObject> llllllllllllllIllllIIIIIllIIIIlI22 = new ArrayList<TileObject>();
        llllllllllllllIllllIIIIIllIIIIIl = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIIIIl, llllllllllllllIllllIIIIIllIIIlII.size())) {
            void llllllllllllllIllllIIIIIllIIIlIl;
            llllllllllllllIllllIIIIIllIIIIlI22.add((TileObject)llllllllllllllIllllIIIIIllIIIlIl.get((Integer)llllllllllllllIllllIIIIIllIIIlII.get(llllllllllllllIllllIIIIIllIIIIIl)));
            "".length();
            ++llllllllllllllIllllIIIIIllIIIIIl;
            "".length();
            if (" ".length() != 0) continue;
            return null;
        }
        System.out.println(lIIllIIlllIIl[lIIllIIlllIlI[4]]);
        return var5_6;
    }

    private static boolean lIllIIIIIIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected t(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[lIIllIIlllIlI[0]];
        nArray[t.lIIllIIlllIlI[1]] = lIIllIIlllIlI[2];
        super(templeTrekkingPlugin, nArray);
        this.ad = new ArrayDeque();
    }

    private static boolean lIllIIIIIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        t.lIllIIIIIIIIlIl();
        t.lIllIIIIIIIIIll();
    }

    private static boolean lIllIIIIIIIIlll(int n2) {
        return n2 > 0;
    }

    private static String lIlIlllllllllll(String llllllllllllllIllllIIIIIlIlIIIlI, String llllllllllllllIllllIIIIIlIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIIlIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIIllIIlllIlI[13]), "DES");
            Cipher llllllllllllllIllllIIIIIlIlIIllI = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIIlIlIIllI.init(lIIllIIlllIlI[3], llllllllllllllIllllIIIIIlIlIIlll);
            return new String(llllllllllllllIllllIIIIIlIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIIlIlIIlIl) {
            llllllllllllllIllllIIIIIlIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIIIlIll(Object object) {
        return object != null;
    }
}

