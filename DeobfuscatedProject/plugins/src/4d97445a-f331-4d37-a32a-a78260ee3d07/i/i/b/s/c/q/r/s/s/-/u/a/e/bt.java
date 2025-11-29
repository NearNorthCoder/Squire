/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Talking to NPC", priority=10, blocking=true)
public class bt
extends Task {
    private /* synthetic */ int fW;
    private static /* synthetic */ int[] llllIllll;
    private static /* synthetic */ String[] llllIlllI;
    private final /* synthetic */ SquireQuestHelper fV;

    private static boolean llIlIIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIIllIII(Object object) {
        return object == null;
    }

    public boolean run() {
        bt lIlIIllIIllIIII;
        if (bt.llIlIIlIllI(Dialog.isOpen() ? 1 : 0) && bt.llIlIIlIlll(this.fV.cu() ? 1 : 0)) {
            return llllIllll[0];
        }
        if (bt.llIlIIlIlll(lIlIIllIIllIIII.fV.cz().equals(llllIlllI[llllIllll[0]]) ? 1 : 0)) {
            return llllIllll[0];
        }
        String[] stringArray = new String[llllIllll[1]];
        stringArray[bt.llllIllll[0]] = llllIlllI[llllIllll[2]];
        stringArray[bt.llllIllll[2]] = llllIlllI[llllIllll[3]];
        stringArray[bt.llllIllll[3]] = llllIlllI[llllIllll[1]];
        if (bt.llIlIIlIllI(lIlIIllIIllIIII.fV.a(stringArray) ? 1 : 0)) {
            return llllIllll[0];
        }
        if (bt.llIlIIlIlll(Movement.shouldWalk() ? 1 : 0)) {
            return llllIllll[0];
        }
        NPC lIlIIllIIlIllll = lIlIIllIIllIIII.fV.cK();
        if (bt.llIlIIllIII(lIlIIllIIlIllll)) {
            return lIlIIllIIllIIII.fV.cB();
        }
        if (bt.llIlIIlIlll(Reachable.isInteractable((Locatable)lIlIIllIIlIllll) ? 1 : 0) && bt.llIlIIllIIl(lIlIIllIIllIIII.fW, llllIllll[4])) {
            lIlIIllIIllIIII.fW += llllIllll[2];
            Movement.walkTo((Locatable)lIlIIllIIlIllll);
            "".length();
            "".length();
            if (-(0x41 ^ 0x7F ^ (0x2D ^ 0x16)) >= 0) {
                return ((0x93 ^ 0x8D ^ (0xD8 ^ 0x95)) & (70 + 182 - 178 + 176 ^ 158 + 28 - 141 + 124 ^ -" ".length())) != 0;
            }
        } else {
            Item lIlIIllIIlIllIl;
            List<Integer> lIlIIllIIlIlllI = lIlIIllIIllIIII.fV.cI();
            if (bt.llIlIIlIlll(lIlIIllIIlIlllI.isEmpty() ? 1 : 0) && bt.llIlIIllIlI(lIlIIllIIlIllIl = Inventory.getFirst(item -> lIlIIllIIlIlllI.contains(item.getId())))) {
                lIlIIllIIlIllIl.useOn((Actor)lIlIIllIIlIllll);
                lIlIIllIIllIIII.sleep(llllIllll[5]);
                return llllIllll[2];
            }
            lIlIIllIIllIIII.fW = llllIllll[0];
            lIlIIllIIlIllll.interact(llllIlllI[llllIllll[5]]);
        }
        this.sleep(llllIllll[5]);
        return llllIllll[2];
    }

    private static void llIlIIlIlII() {
        llllIlllI = new String[llllIllll[4]];
        bt.llllIlllI[bt.llllIllll[0]] = bt.llIlIIlIIlI("ov50m8R0a4Q=", "LXxpv");
        bt.llllIlllI[bt.llllIllll[2]] = bt.llIlIIlIIll("Bj0EPA==", "mThPi");
        bt.llllIlllI[bt.llllIllll[3]] = bt.llIlIIlIIlI("d741Bj8khe4=", "xnaEF");
        bt.llllIlllI[bt.llllIllll[1]] = bt.llIlIIlIIlI("eVOMxkN7uBU=", "jcELl");
        bt.llllIlllI[bt.llllIllll[5]] = bt.llIlIIlIIll("Ow4LE0sbAA==", "oogxf");
    }

    @Inject
    public bt(SquireQuestHelper squireQuestHelper) {
        this.fV = squireQuestHelper;
    }

    private static void llIlIIlIlIl() {
        llllIllll = new int[7];
        bt.llllIllll[0] = (0x42 ^ 0x59 ^ (0x44 ^ 0x74)) & (31 + 128 - 39 + 63 ^ 150 + 95 - 171 + 82 ^ -" ".length());
        bt.llllIllll[1] = "   ".length();
        bt.llllIllll[2] = " ".length();
        bt.llllIllll[3] = "  ".length();
        bt.llllIllll[4] = 12 + 70 - 61 + 117 ^ 87 + 58 - 121 + 119;
        bt.llllIllll[5] = 125 + 85 - 97 + 44 ^ 39 + 144 - 116 + 86;
        bt.llllIllll[6] = 9 + 44 - -33 + 42 ^ 111 + 121 - 142 + 46;
    }

    private static boolean llIlIIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIIllIlI(Object object) {
        return object != null;
    }

    static {
        bt.llIlIIlIlIl();
        bt.llIlIIlIlII();
    }

    private static String llIlIIlIIll(String lIlIIllIIIlIlIl, String lIlIIllIIIlIlII) {
        lIlIIllIIIlIlIl = new String(Base64.getDecoder().decode(lIlIIllIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIllIIIlIIll = new StringBuilder();
        char[] lIlIIllIIIlIIlI = lIlIIllIIIlIlII.toCharArray();
        int lIlIIllIIIlIIIl = llllIllll[0];
        char[] lIlIIllIIIIlIll = lIlIIllIIIlIlIl.toCharArray();
        int lIlIIllIIIIlIlI = lIlIIllIIIIlIll.length;
        int lIlIIllIIIIlIIl = llllIllll[0];
        while (bt.llIlIIllIIl(lIlIIllIIIIlIIl, lIlIIllIIIIlIlI)) {
            char lIlIIllIIIlIllI = lIlIIllIIIIlIll[lIlIIllIIIIlIIl];
            lIlIIllIIIlIIll.append((char)(lIlIIllIIIlIllI ^ lIlIIllIIIlIIlI[lIlIIllIIIlIIIl % lIlIIllIIIlIIlI.length]));
            "".length();
            ++lIlIIllIIIlIIIl;
            ++lIlIIllIIIIlIIl;
            "".length();
            if ("   ".length() > -" ".length()) continue;
            return null;
        }
        return String.valueOf(lIlIIllIIIlIIll);
    }

    private static String llIlIIlIIlI(String lIlIIllIIlIIlIl, String lIlIIllIIlIIlII) {
        try {
            SecretKeySpec lIlIIllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllIIlIIlII.getBytes(StandardCharsets.UTF_8)), llllIllll[6]), "DES");
            Cipher lIlIIllIIlIIlll = Cipher.getInstance("DES");
            lIlIIllIIlIIlll.init(llllIllll[3], lIlIIllIIlIlIII);
            return new String(lIlIIllIIlIIlll.doFinal(Base64.getDecoder().decode(lIlIIllIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIllIIlIIllI) {
            lIlIIllIIlIIllI.printStackTrace();
            return null;
        }
    }
}

