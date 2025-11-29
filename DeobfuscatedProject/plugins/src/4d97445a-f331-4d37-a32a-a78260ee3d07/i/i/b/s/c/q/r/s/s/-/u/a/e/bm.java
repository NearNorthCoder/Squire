/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping Items", priority=20, blocking=true)
public class bm
extends Task {
    private final /* synthetic */ SquireQuestHelper fO;
    private static /* synthetic */ int[] llllIIII;
    private static /* synthetic */ String[] lllIllll;

    private static boolean llIlIIIIlI(int n2) {
        return n2 != 0;
    }

    static {
        bm.llIlIIIIIl();
        bm.llIlIIIIII();
    }

    private static String llIIllllll(String llIlIIlIllIIIlI, String llIlIIlIlIlllll) {
        try {
            SecretKeySpec llIlIIlIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIlIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIlIllIIlII = Cipher.getInstance("Blowfish");
            llIlIIlIllIIlII.init(llllIIII[3], llIlIIlIllIIlIl);
            return new String(llIlIIlIllIIlII.doFinal(Base64.getDecoder().decode(llIlIIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIlIllIIIll) {
            llIlIIlIllIIIll.printStackTrace();
            return null;
        }
    }

    private static String llIIlllllI(String llIlIIlIlllIlll, String llIlIIlIlllIllI) {
        llIlIIlIlllIlll = new String(Base64.getDecoder().decode(llIlIIlIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIlIlllIlIl = new StringBuilder();
        char[] llIlIIlIlllIlII = llIlIIlIlllIllI.toCharArray();
        int llIlIIlIlllIIll = llllIIII[0];
        char[] llIlIIlIllIllIl = llIlIIlIlllIlll.toCharArray();
        int llIlIIlIllIllII = llIlIIlIllIllIl.length;
        int llIlIIlIllIlIll = llllIIII[0];
        while (bm.llIlIIIIll(llIlIIlIllIlIll, llIlIIlIllIllII)) {
            char llIlIIlIllllIII = llIlIIlIllIllIl[llIlIIlIllIlIll];
            llIlIIlIlllIlIl.append((char)(llIlIIlIllllIII ^ llIlIIlIlllIlII[llIlIIlIlllIIll % llIlIIlIlllIlII.length]));
            "".length();
            ++llIlIIlIlllIIll;
            ++llIlIIlIllIlIll;
            "".length();
            if (((0x5A ^ 0x4D) & ~(0x29 ^ 0x3E)) == 0) continue;
            return null;
        }
        return String.valueOf(llIlIIlIlllIlIl);
    }

    private static boolean llIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void llIlIIllIIIIIll;
        List<Integer> list = this.fO.cF();
        if (bm.llIlIIIIlI(list.isEmpty() ? 1 : 0)) {
            return llllIIII[0];
        }
        List llIlIIllIIIIIlI = Inventory.getAll(arg_0 -> bm.a((List)llIlIIllIIIIIll, arg_0));
        if (bm.llIlIIIIlI(llIlIIllIIIIIlI.isEmpty() ? 1 : 0)) {
            return llllIIII[0];
        }
        var2_2.forEach(item -> {
            String[] stringArray = new String[llllIIII[2]];
            stringArray[bm.llllIIII[0]] = lllIllll[llllIIII[0]];
            stringArray[bm.llllIIII[1]] = lllIllll[llllIIII[1]];
            stringArray[bm.llllIIII[3]] = lllIllll[llllIIII[3]];
            item.interact(stringArray);
        });
        return llllIIII[1];
    }

    private static void llIlIIIIIl() {
        llllIIII = new int[4];
        bm.llllIIII[0] = (0x58 ^ 0x12) & ~(0x44 ^ 0xE);
        bm.llllIIII[1] = " ".length();
        bm.llllIIII[2] = "   ".length();
        bm.llllIIII[3] = "  ".length();
    }

    private static void llIlIIIIII() {
        lllIllll = new String[llllIIII[2]];
        bm.lllIllll[bm.llllIIII[0]] = bm.llIIlllllI("GgIsOA==", "MgMJk");
        bm.lllIllll[bm.llllIIII[1]] = bm.llIIllllll("wZxcnwSziVc=", "xPNZS");
        bm.lllIllll[bm.llllIIII[3]] = bm.llIIllllll("W7W9AMKS2Ls=", "UJHwH");
    }

    private static /* synthetic */ boolean a(List list, Item item) {
        return list.contains(item.getId());
    }

    @Inject
    public bm(SquireQuestHelper squireQuestHelper) {
        this.fO = squireQuestHelper;
    }
}

