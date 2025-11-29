/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Start trek task")
public class r
extends Task {
    /* synthetic */ Pattern X;
    /* synthetic */ WorldArea Y;
    private final /* synthetic */ TempleTrekkingConfig W;
    private static /* synthetic */ int[] lIIllIlIIIIll;
    private static /* synthetic */ String[] lIIllIlIIIIIl;
    private final /* synthetic */ TempleTrekkingPlugin V;

    @Inject
    public r(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        this.X = Pattern.compile(lIIllIlIIIIIl[lIIllIlIIIIll[0]]);
        this.Y = new WorldArea(new WorldPoint(lIIllIlIIIIll[1], lIIllIlIIIIll[2], lIIllIlIIIIll[0]), new WorldPoint(lIIllIlIIIIll[3], lIIllIlIIIIll[4], lIIllIlIIIIll[0]));
        this.W = templeTrekkingConfig;
        this.V = templeTrekkingPlugin;
    }

    private static void lIllIIIIIlIlIII() {
        lIIllIlIIIIIl = new String[lIIllIlIIIIll[21]];
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[0]] = r.lIllIIIIIlIIIlI("eJfYAZ2Oyzh+mif7q7UVDkd45gUEH34L", "TGngC");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[5]] = r.lIllIIIIIlIIlII("XfZYyEzBx1c=", "gStof");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[6]] = r.lIllIIIIIlIIlII("EnCDjk+R8IM=", "XQKMS");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[7]] = r.lIllIIIIIlIIlIl("Oh8gJw==", "vpGTM");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[10]] = r.lIllIIIIIlIIlII("Nfeg6Qkqw80=", "BRjDk");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[11]] = r.lIllIIIIIlIIIlI("ABIpg4COQxh8IHuOJp4bfQ==", "dPTPT");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[8]] = r.lIllIIIIIlIIlII("VPlPJpCgXFU=", "kKMPG");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[12]] = r.lIllIIIIIlIIIlI("AWHs2GJs/DQ=", "PjixL");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[13]] = r.lIllIIIIIlIIlII("0NgmvWlVfaM=", "xSwSd");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[14]] = r.lIllIIIIIlIIIlI("mjEPfA6CK2s=", "LiNcl");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[9]] = r.lIllIIIIIlIIIlI("CATUoD4w+6GJsyMRIQphqQ==", "sEBUk");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[15]] = r.lIllIIIIIlIIlIl("Mzk8Mg==", "VXOKj");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[16]] = r.lIllIIIIIlIIlII("gFLhda5xSP8=", "eMaTW");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[17]] = r.lIllIIIIIlIIlII("DPRWRcX83vk=", "WFPTJ");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[18]] = r.lIllIIIIIlIIlIl("LA8KDQA=", "jvcbn");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[19]] = r.lIllIIIIIlIIIlI("fi9cgYajB8E=", "ekQmc");
        r.lIIllIlIIIIIl[r.lIIllIlIIIIll[20]] = r.lIllIIIIIlIIlII("a/i/CBIhIRE=", "wKQhr");
    }

    private static boolean lIllIIIIIllIIIl(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIIIlIIlII(String llllllllllllllIlllIllllllIIIlIll, String llllllllllllllIlllIllllllIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIllllllIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllllIIIlIlI.getBytes(StandardCharsets.UTF_8)), lIIllIlIIIIll[13]), "DES");
            Cipher llllllllllllllIlllIllllllIIIllll = Cipher.getInstance("DES");
            llllllllllllllIlllIllllllIIIllll.init(lIIllIlIIIIll[6], llllllllllllllIlllIllllllIIlIIII);
            return new String(llllllllllllllIlllIllllllIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllllllIIIlllI) {
            llllllllllllllIlllIllllllIIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIlIllIl() {
        lIIllIlIIIIll = new int[22];
        r.lIIllIlIIIIll[0] = (0x14 ^ 0x1F) & ~(0x90 ^ 0x9B);
        r.lIIllIlIIIIll[1] = -(0xFFFFBF2F & 0x52D3) & (0xFFFFBFFE & 0x5F5F);
        r.lIIllIlIIIIll[2] = 0xFFFF9DE7 & 0x6F98;
        r.lIIllIlIIIIll[3] = 0xFFFFDF7B & 0x2DF7;
        r.lIIllIlIIIIll[4] = 0xFFFFCDFB & 0x3FA7;
        r.lIIllIlIIIIll[5] = " ".length();
        r.lIIllIlIIIIll[6] = "  ".length();
        r.lIIllIlIIIIll[7] = "   ".length();
        r.lIIllIlIIIIll[8] = " ".length() ^ (0x9B ^ 0x9C);
        r.lIIllIlIIIIll[9] = 0x8A ^ 0xC4 ^ (0xEC ^ 0xA8);
        r.lIIllIlIIIIll[10] = 0xA2 ^ 0xA6;
        r.lIIllIlIIIIll[11] = 0xF ^ 0xA;
        r.lIIllIlIIIIll[12] = 0x44 ^ 1 ^ (0xE1 ^ 0xA3);
        r.lIIllIlIIIIll[13] = 0x9C ^ 0xA7 ^ (0x56 ^ 0x65);
        r.lIIllIlIIIIll[14] = 5 ^ 0xC;
        r.lIIllIlIIIIll[15] = 0x31 ^ 0x3A;
        r.lIIllIlIIIIll[16] = 0 ^ 0xC;
        r.lIIllIlIIIIll[17] = 0x6A ^ 0x6F ^ (0x62 ^ 0x6A);
        r.lIIllIlIIIIll[18] = 10 + 133 - 111 + 103 ^ 107 + 119 - 194 + 105;
        r.lIIllIlIIIIll[19] = 0x5B ^ 0x49 ^ (0x4C ^ 0x51);
        r.lIIllIlIIIIll[20] = 0x31 ^ 1 ^ (0x22 ^ 2);
        r.lIIllIlIIIIll[21] = 31 + 94 - 75 + 99 ^ 63 + 90 - 79 + 58;
    }

    private static boolean lIllIIIIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        r.lIllIIIIIlIllIl();
        r.lIllIIIIIlIlIII();
    }

    private static boolean lIllIIIIIllIlII(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIIllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    public boolean run() {
        Player llllllllllllllIlllIlllllllIIIIIl;
        r llllllllllllllIlllIlllllllIIIIll;
        block18: {
            block20: {
                block19: {
                    if (r.lIllIIIIIlIllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        Dialog.enterAmount((int)lIIllIlIIIIll[0]);
                        return lIIllIlIIIIll[5];
                    }
                    if (r.lIllIIIIIlIllll(llllllllllllllIlllIlllllllIIIIll.V.e() ? 1 : 0)) {
                        return lIIllIlIIIIll[0];
                    }
                    llllllllllllllIlllIlllllllIIIIIl = Players.getLocal();
                    if (r.lIllIIIIIllIIII(llllllllllllllIlllIlllllllIIIIIl)) {
                        return lIIllIlIIIIll[0];
                    }
                    if (!r.lIllIIIIIllIIIl(llllllllllllllIlllIlllllllIIIIIl.isMoving() ? 1 : 0) || r.lIllIIIIIlIllll(llllllllllllllIlllIlllllllIIIIIl.isAnimating() ? 1 : 0)) {
                        return lIIllIlIIIIll[0];
                    }
                    if (r.lIllIIIIIllIIlI(llllllllllllllIlllIlllllllIIIIll.V.c(), lIIllIlIIIIll[6])) {
                        return lIIllIlIIIIll[0];
                    }
                    if (r.lIllIIIIIlIllll(Dialog.isOpen() ? 1 : 0)) {
                        return lIIllIlIIIIll[0];
                    }
                    if (!r.lIllIIIIIlIllll(llllllllllllllIlllIlllllllIIIIll.V.f().contains((Locatable)llllllllllllllIlllIlllllllIIIIIl) ? 1 : 0)) break block18;
                    if (r.lIllIIIIIlIllll(llllllllllllllIlllIlllllllIIIIll.W.healInBank() ? 1 : 0) && r.lIllIIIIIllIIll(llllllllllllllIlllIlllllllIIIIll.W.hpToBank(), Skills.getBoostedLevel((Skill)Skill.HITPOINTS))) {
                        llllllllllllllIlllIlllllllIIIIll.V.b(lIIllIlIIIIll[5]);
                        return lIIllIlIIIIll[0];
                    }
                    String[] stringArray = new String[lIIllIlIIIIll[5]];
                    stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[5]];
                    if (!r.lIllIIIIIlIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block19;
                    String[] stringArray2 = new String[lIIllIlIIIIll[6]];
                    stringArray2[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[6]];
                    stringArray2[r.lIIllIlIIIIll[5]] = lIIllIlIIIIIl[lIIllIlIIIIll[7]];
                    if (r.lIllIIIIIllIIll(Inventory.getFreeSlots() - Math.min(lIIllIlIIIIll[7], Inventory.getAll((String[])stringArray2).size()), lIIllIlIIIIll[8]) && (!r.lIllIIIIIlIllll(llllllllllllllIlllIlllllllIIIIll.W.stamina()) || !r.lIllIIIIIllIIIl(Inventory.contains(item -> {
                        int n2;
                        if (r.lIllIIIIIlIllll(item.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[19]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIllIlIIIIll[5]];
                            stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[20]];
                            if (r.lIllIIIIIlIllll(item.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIllIlIIIIll[5];
                                "".length();
                                if ("   ".length() != " ".length()) return n2 != 0;
                                return ((8 ^ 0x39) & ~(0x34 ^ 5)) != 0;
                            }
                        }
                        n2 = lIIllIlIIIIll[0];
                        return n2 != 0;
                    }) ? 1 : 0))) break block20;
                }
                llllllllllllllIlllIlllllllIIIIll.V.b(lIIllIlIIIIll[5]);
                return lIIllIlIIIIll[0];
            }
            NPC llllllllllllllIlllIlllllllIIIIII = NPCs.getNearest(nPC -> {
                int n2;
                if (r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[15]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIlIIIIll[5]];
                    stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[16]];
                    if (r.lIllIIIIIlIllll(nPC.hasAction(stringArray) ? 1 : 0) && (!r.lIllIIIIIllIIIl(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[17]]) ? 1 : 0) || r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[18]]) ? 1 : 0))) {
                        n2 = lIIllIlIIIIll[5];
                        "".length();
                        if ("  ".length() != -" ".length()) return n2 != 0;
                        return ((157 + 33 - 38 + 28 ^ 4 + 126 - 68 + 74) & (85 + 206 - 164 + 128 ^ 151 + 166 - 261 + 139 ^ -" ".length())) != 0;
                    }
                }
                n2 = lIIllIlIIIIll[0];
                return n2 != 0;
            });
            if (r.lIllIIIIIllIlII(llllllllllllllIlllIlllllllIIIIII) && r.lIllIIIIIllIlIl(llllllllllllllIlllIlllllllIIIIIl.distanceTo((Locatable)llllllllllllllIlllIlllllllIIIIII), lIIllIlIIIIll[9])) {
                llllllllllllllIlllIlllllllIIIIII.interact(lIIllIlIIIIIl[lIIllIlIIIIll[10]]);
                llllllllllllllIlllIlllllllIIIIll.sleep(lIIllIlIIIIll[11]);
                return lIIllIlIIIIll[5];
            }
            Movement.walkTo((WorldArea)llllllllllllllIlllIlllllllIIIIll.V.f());
            "".length();
            return lIIllIlIIIIll[5];
        }
        if (r.lIllIIIIIlIllll(llllllllllllllIlllIlllllllIIIIll.Y.contains((Locatable)llllllllllllllIlllIlllllllIIIIIl) ? 1 : 0)) {
            String[] stringArray = new String[lIIllIlIIIIll[5]];
            stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[11]];
            if (r.lIllIIIIIlIllll(Inventory.dropAll((String[])stringArray) ? 1 : 0)) {
                return lIIllIlIIIIll[5];
            }
            if (r.lIllIIIIIlIllll(llllllllllllllIlllIlllllllIIIIll.V.g().contains((Locatable)llllllllllllllIlllIlllllllIIIIIl) ? 1 : 0)) {
                NPC llllllllllllllIlllIlllllllIIIIII = NPCs.getNearest(nPC -> {
                    int n2;
                    if (r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[12]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIlIIIIll[5]];
                        stringArray[r.lIIllIlIIIIll[0]] = lIIllIlIIIIIl[lIIllIlIIIIll[13]];
                        if (r.lIllIIIIIlIllll(nPC.hasAction(stringArray) ? 1 : 0) && (!r.lIllIIIIIllIIIl(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[14]]) ? 1 : 0) || r.lIllIIIIIlIllll(nPC.getName().contains(lIIllIlIIIIIl[lIIllIlIIIIll[9]]) ? 1 : 0))) {
                            n2 = lIIllIlIIIIll[5];
                            "".length();
                            if ("   ".length() >= 0) return n2 != 0;
                            return ((0x8C ^ 0xA5) & ~(0x10 ^ 0x39)) != 0;
                        }
                    }
                    n2 = lIIllIlIIIIll[0];
                    return n2 != 0;
                });
                if (r.lIllIIIIIllIlII(llllllllllllllIlllIlllllllIIIIII)) {
                    llllllllllllllIlllIlllllllIIIIII.interact(lIIllIlIIIIIl[lIIllIlIIIIll[8]]);
                    llllllllllllllIlllIlllllllIIIIll.sleep(lIIllIlIIIIll[11]);
                    return lIIllIlIIIIll[5];
                }
                "".length();
                if (" ".length() == 0) {
                    return ((0xE ^ 0x64 ^ (0x47 ^ 0x1F)) & (166 + 157 - 307 + 228 ^ 194 + 142 - 295 + 157 ^ -" ".length())) != 0;
                }
            } else {
                Movement.walkTo((WorldArea)llllllllllllllIlllIlllllllIIIIll.V.g());
                "".length();
                return lIIllIlIIIIll[5];
            }
        }
        return lIIllIlIIIIll[0];
    }

    private static boolean lIllIIIIIllIIII(Object object) {
        return object == null;
    }

    private static String lIllIIIIIlIIIlI(String llllllllllllllIlllIllllllIIllIlI, String llllllllllllllIlllIllllllIIllIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllllllIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllllIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllllllIIlllII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllllllIIlllII.init(lIIllIlIIIIll[6], llllllllllllllIlllIllllllIIlllIl);
            return new String(llllllllllllllIlllIllllllIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllllllIIllIll) {
            llllllllllllllIlllIllllllIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIlIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIIIIlIIlIl(String llllllllllllllIlllIllllllIlIllll, String llllllllllllllIlllIllllllIlIlIIl) {
        llllllllllllllIlllIllllllIlIllll = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllllIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllllllIlIllIl = new StringBuilder();
        char[] llllllllllllllIlllIllllllIlIllII = llllllllllllllIlllIllllllIlIlIIl.toCharArray();
        int llllllllllllllIlllIllllllIlIlIll = lIIllIlIIIIll[0];
        char[] llllllllllllllIlllIllllllIlIIlIl = llllllllllllllIlllIllllllIlIllll.toCharArray();
        int llllllllllllllIlllIllllllIlIIlII = llllllllllllllIlllIllllllIlIIlIl.length;
        int llllllllllllllIlllIllllllIlIIIll = lIIllIlIIIIll[0];
        while (r.lIllIIIIIllIlIl(llllllllllllllIlllIllllllIlIIIll, llllllllllllllIlllIllllllIlIIlII)) {
            char llllllllllllllIlllIllllllIllIIII = llllllllllllllIlllIllllllIlIIlIl[llllllllllllllIlllIllllllIlIIIll];
            llllllllllllllIlllIllllllIlIllIl.append((char)(llllllllllllllIlllIllllllIllIIII ^ llllllllllllllIlllIllllllIlIllII[llllllllllllllIlllIllllllIlIlIll % llllllllllllllIlllIllllllIlIllII.length]));
            "".length();
            ++llllllllllllllIlllIllllllIlIlIll;
            ++llllllllllllllIlllIllllllIlIIIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllllllIlIllIl);
    }
}

