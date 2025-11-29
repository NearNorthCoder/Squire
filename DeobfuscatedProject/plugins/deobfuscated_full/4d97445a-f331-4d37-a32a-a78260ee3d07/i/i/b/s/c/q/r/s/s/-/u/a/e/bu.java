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
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

/* TASK: Using item on item -> UsingitemonitemTask */
@TaskDesc(name="Using item on item", priority=10, blocking=true)
public class bu
extends Task {
    private static /* synthetic */ String[] lIIlIllIl;
    private static /* synthetic */ int[] lIIlIlllI;
    private final /* synthetic */ SquireQuestHelper fX;

    private static void lIIIIlIIIlI() {
        lIIlIllIl = new String[lIIlIlllI[1]];
        bu.lIIlIllIl[bu.lIIlIlllI[0]] = bu."DetailedQuestStep";
        bu.lIIlIllIl[bu.lIIlIlllI[2]] = bu."ItemRequirement";
    }

    private static void lIIIIlIIIll() {
        lIIlIlllI = new int[4];
        bu.lIIlIlllI[0] = (0x23 ^ 0x7B ^ (0x47 ^ 0x25)) & (0x3E ^ 0x6E ^ (0x1F ^ 0x75) ^ -1);
        bu.lIIlIlllI[1] = 2;
        bu.lIIlIlllI[2] = 1;
        bu.lIIlIlllI[3] = 0xA9 ^ 0xA1;
    }

    static {
        bu.lIIIIlIIIll();
        bu.lIIIIlIIIlI();
    }

    private static boolean lIIIIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIlIIllI(int n2) {
        return n2 != 0;
    }

    private static String lIIIIlIIIII(String llIIIllIlllIlII, String llIIIllIlllIIIl) {
        try {
            SecretKeySpec llIIIllIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIllIlllIllI = Cipher.getInstance("Blowfish");
            llIIIllIlllIllI.init(lIIlIlllI[1], llIIIllIlllIlll);
            return new String(llIIIllIlllIllI.doFinal(Base64.getDecoder().decode(llIIIllIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIllIlllIlIl) {
            llIIIllIlllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIlIII(Object object) {
        return object == null;
    }

    private static boolean lIIIIlIIlll(Object object) {
        return object != null;
    }

    private static boolean lIIIIlIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public bu(SquireQuestHelper squireQuestHelper) {
        this.fX = squireQuestHelper;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        void var5_5;
        bu llIIIlllIIlIIIl;
        String string = this.fX.cz();
        if (bu.lIIIIlIIlII(string.equals(lIIlIllIl[lIIlIlllI[0]]) ? 1 : 0)) {
            return lIIlIlllI[0];
        }
        List<Object> llIIIlllIIIllll = llIIIlllIIlIIIl.fX.cE();
        if (bu.lIIIIlIIlIl(llIIIlllIIIllll.size(), lIIlIlllI[1])) {
            return lIIlIlllI[0];
        }
        if (bu.lIIIIlIIllI(llIIIlllIIIllll.stream().anyMatch(object -> {
            boolean bl2;
            if (bu.lIIIIlIIlII(object.getClass().getSimpleName().equals(lIIlIllIl[lIIlIlllI[2]]) ? 1 : 0)) {
                bl2 = lIIlIlllI[2];
                0;
                
                }
            } else {
                bl2 = lIIlIlllI[0];
            }
            return bl2;
        }) ? 1 : 0)) {
            return lIIlIlllI[0];
        }
        int llIIIlllIIIlllI = llIIIlllIIlIIIl.fX.A(lIIlIlllI[0]);
        int llIIIlllIIIllIl = llIIIlllIIlIIIl.fX.A(lIIlIlllI[2]);
        int[] nArray = new int[lIIlIlllI[2]];
        nArray[bu.lIIlIlllI[0]] = llIIIlllIIIlllI;
        Item llIIIlllIIIllII = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lIIlIlllI[2]];
        nArray2[bu.lIIlIlllI[0]] = llIIIlllIIIllIl;
        Item llIIIlllIIIlIll = Inventory.getFirst((int[])nArray2);
        if (!bu.lIIIIlIIlll(llIIIlllIIIllII) || bu.lIIIIlIlIII(llIIIlllIIIlIll)) {
            return lIIlIlllI[0];
        }
        var5_5.useOn((Item)var6_6);
        return lIIlIlllI[2];
    }

    private static String lIIIIlIIIIl(String llIIIllIlllllll, String llIIIllIllllllI) {
        try {
            SecretKeySpec llIIIlllIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIllIllllllI.getBytes(StandardCharsets.UTF_8)), lIIlIlllI[3]), "DES");
            Cipher llIIIlllIIIIIll = Cipher.getInstance("DES");
            llIIIlllIIIIIll.init(lIIlIlllI[1], llIIIlllIIIIlII);
            return new String(llIIIlllIIIIIll.doFinal(Base64.getDecoder().decode(llIIIllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlllIIIIIlI) {
            llIIIlllIIIIIlI.printStackTrace();
            return null;
        }
    }
}

