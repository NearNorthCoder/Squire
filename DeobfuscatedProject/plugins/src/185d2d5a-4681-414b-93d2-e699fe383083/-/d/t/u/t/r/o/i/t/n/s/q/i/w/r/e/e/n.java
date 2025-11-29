/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.a;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Fletching Logs", priority=1, blocking=true, register=true)
public class n
extends Task {
    private static final /* synthetic */ int U;
    private static /* synthetic */ int[] lIlIllllIlIIl;
    private static /* synthetic */ String[] lIlIllllIIlll;
    private final /* synthetic */ SquireWintertodtConfig W;
    private final /* synthetic */ b V;
    private /* synthetic */ int X;

    private static boolean llIIIIlIlllIllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var4_4;
        n llllllllllllllIllIIllllIIIlllIll;
        if (!n.llIIIIlIlllIlIl(this.V.i() ? 1 : 0) || !n.llIIIIlIlllIllI(this.V.u() ? 1 : 0) || n.llIIIIlIlllIlIl(this.V.j() ? 1 : 0)) {
            return lIlIllllIlIIl[0];
        }
        int[] nArray = new int[lIlIllllIlIIl[1]];
        nArray[n.lIlIllllIlIIl[0]] = lIlIllllIlIIl[2];
        int llllllllllllllIllIIllllIIIlllIlI = Inventory.getCount((int[])nArray);
        if (!n.llIIIIlIlllIlIl(llllllllllllllIllIIllllIIIlllIll.W.fletch() ? 1 : 0) || n.llIIIIlIlllIlll(llllllllllllllIllIIllllIIIlllIll.V.f(), lIlIllllIlIIl[3] - llllllllllllllIllIIllllIIIlllIlI * lIlIllllIlIIl[4])) {
            return lIlIllllIlIIl[0];
        }
        int[] nArray2 = new int[lIlIllllIlIIl[1]];
        nArray2[n.lIlIllllIlIIl[0]] = lIlIllllIlIIl[5];
        if (n.llIIIIlIllllIII(llllllllllllllIllIIllllIIIlllIlI + Inventory.getCount((int[])nArray2), llllllllllllllIllIIllllIIIlllIll.V.g())) {
            return lIlIllllIlIIl[0];
        }
        Player llllllllllllllIllIIllllIIIlllIIl = Players.getLocal();
        a llllllllllllllIllIIllllIIIlllIII = llllllllllllllIllIIllllIIIlllIll.V.q();
        if (n.llIIIIlIllllIII(llllllllllllllIllIIllllIIIlllIII.b().distanceTo((Locatable)llllllllllllllIllIIllllIIIlllIIl), lIlIllllIlIIl[6]) && n.llIIIIlIlllIllI(llllllllllllllIllIIllllIIIlllIIl.isMoving() ? 1 : 0)) {
            return lIlIllllIlIIl[0];
        }
        int[] nArray3 = new int[lIlIllllIlIIl[1]];
        nArray3[n.lIlIllllIlIIl[0]] = lIlIllllIlIIl[2];
        Item llllllllllllllIllIIllllIIIllIlll = Inventory.getFirst((int[])nArray3);
        int[] nArray4 = new int[lIlIllllIlIIl[1]];
        nArray4[n.lIlIllllIlIIl[0]] = lIlIllllIlIIl[7];
        Item llllllllllllllIllIIllllIIIllIllI = Inventory.getFirst((int[])nArray4);
        if (!n.llIIIIlIllllIIl(llllllllllllllIllIIllllIIIllIlll) || n.llIIIIlIllllIlI(llllllllllllllIllIIllllIIIllIllI)) {
            return lIlIllllIlIIl[0];
        }
        if (n.llIIIIlIllllIll(Players.getLocal().getAnimation(), lIlIllllIlIIl[8])) {
            int n2 = llllllllllllllIllIIllllIIIlllIll.X;
            llllllllllllllIllIIllllIIIlllIll.X = n2 - lIlIllllIlIIl[1];
            if (n.llIIIIlIlllllII(n2)) {
                llllllllllllllIllIIllllIIIlllIll.X = lIlIllllIlIIl[6];
                return lIlIllllIlIIl[0];
            }
        }
        var4_4.useOn((Item)var5_5);
        this.X = lIlIllllIlIIl[6];
        this.V.n();
        return lIlIllllIlIIl[1];
    }

    private static boolean llIIIIlIllllIlI(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIllllIll(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!n.llIIIIlIlllIllI(string.contains(lIlIllllIIlll[lIlIllllIlIIl[0]]) ? 1 : 0) || n.llIIIIlIlllIlIl(string.contains(lIlIllllIIlll[lIlIllllIlIIl[1]]) ? 1 : 0)) {
            llllllllllllllIllIIllllIIIllIIlI.X = lIlIllllIlIIl[0];
        }
    }

    @Inject
    public n(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.V = b2;
        this.W = squireWintertodtConfig;
    }

    private static boolean llIIIIlIllllIIl(Object object) {
        return object != null;
    }

    private static void llIIIIlIlllIlII() {
        lIlIllllIlIIl = new int[10];
        n.lIlIllllIlIIl[0] = (0x24 ^ 0x68 ^ (8 ^ 0x7B)) & (0xA9 ^ 0xB0 ^ (0x48 ^ 0x6E) ^ -" ".length());
        n.lIlIllllIlIIl[1] = " ".length();
        n.lIlIllllIlIIl[2] = -(0xFFFFA32D & 0x7DDB) & (0xFFFFF7DF & 0x79FF);
        n.lIlIllllIlIIl[3] = -(0xFFFFFA79 & 0x7F8F) & (0xFFFFFBFD & 0x7FFE);
        n.lIlIllllIlIIl[4] = (0xAC ^ 0x81) & ~(0x49 ^ 0x64) ^ (7 ^ 0xD);
        n.lIlIllllIlIIl[5] = 0xFFFFF8D8 & 0x57FF;
        n.lIlIllllIlIIl[6] = "  ".length();
        n.lIlIllllIlIIl[7] = -(0xFFFFCE6E & 0x7D9F) & (0xFFFFCFBF & Short.MAX_VALUE);
        n.lIlIllllIlIIl[8] = -(0xFFFFFA39 & 0x5FDF) & (0xFFFFDFFB & 0x7EFC);
        n.lIlIllllIlIIl[9] = 0x13 ^ 0x1B;
    }

    private static void llIIIIlIlllIIII() {
        lIlIllllIIlll = new String[lIlIllllIlIIl[6]];
        n.lIlIllllIIlll[n.lIlIllllIlIIl[0]] = n.llIIIIlIllIllII("sJyibpYwifV9Lqqulekh5M9zdvQ4mu0n", "lDTPZ");
        n.lIlIllllIIlll[n.lIlIllllIlIIl[1]] = n.llIIIIlIllIlllI("i4tlsY+NEW0VRAOL4YE+hQ==", "jDCeM");
    }

    private static boolean llIIIIlIlllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIlIllllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIIlIlllIlIl(int n2) {
        return n2 != 0;
    }

    private static String llIIIIlIllIllII(String llllllllllllllIllIIllllIIIlIlIII, String llllllllllllllIllIIllllIIIlIIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIllllIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllllIIIlIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllllIIIlIlIlI.init(lIlIllllIlIIl[6], llllllllllllllIllIIllllIIIlIlIll);
            return new String(llllllllllllllIllIIllllIIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllllIIIlIlIIl) {
            llllllllllllllIllIIllllIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIlllllII(int n2) {
        return n2 >= 0;
    }

    static {
        n.llIIIIlIlllIlII();
        n.llIIIIlIlllIIII();
        U = lIlIllllIlIIl[8];
    }

    private static String llIIIIlIllIlllI(String llllllllllllllIllIIllllIIIIllIIl, String llllllllllllllIllIIllllIIIIllIII) {
        try {
            SecretKeySpec llllllllllllllIllIIllllIIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIIIIllIII.getBytes(StandardCharsets.UTF_8)), lIlIllllIlIIl[9]), "DES");
            Cipher llllllllllllllIllIIllllIIIIlllIl = Cipher.getInstance("DES");
            llllllllllllllIllIIllllIIIIlllIl.init(lIlIllllIlIIl[6], llllllllllllllIllIIllllIIIIllllI);
            return new String(llllllllllllllIllIIllllIIIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllllIIIIlllII) {
            llllllllllllllIllIIllllIIIIlllII.printStackTrace();
            return null;
        }
    }
}

