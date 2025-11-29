/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a;

@TaskDesc(name="Banking loot from pickpocketing", priority=2000, blocking=true, register=true)
public class C
extends a {
    private static /* synthetic */ int[] lIIllIlllIlll;
    private static final /* synthetic */ Logger au;
    private static /* synthetic */ String[] lIIllIlllIllI;

    static {
        C.lIllIIIllllIIll();
        C.lIllIIIllllIIlI();
        au = LoggerFactory.getLogger(C.class);
    }

    private static boolean lIllIIIlllllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var1_1;
        Item llllllllllllllIlllIllIllllIIIIII;
        C llllllllllllllIlllIllIllllIIIIlI;
        if (C.lIllIIIllllIlII(this.p.depositSeedVault() ? 1 : 0)) {
            return lIIllIlllIlll[0];
        }
        if (C.lIllIIIllllIlIl(llllllllllllllIlllIllIllllIIIIlI.o.j() ? 1 : 0)) {
            return lIIllIlllIlll[0];
        }
        if (C.lIllIIIllllIlIl(Bank.isOpen() ? 1 : 0)) {
            return lIIllIlllIlll[0];
        }
        InventorySetup llllllllllllllIlllIllIllllIIIIIl = llllllllllllllIlllIllIllllIIIIlI.o.g();
        if (C.lIllIIIllllIlII(llllllllllllllIlllIllIllllIIIIIl.matchesInventory() ? 1 : 0)) {
            llllllllllllllIlllIllIllllIIIIlI.o.b(lIIllIlllIlll[0]);
        }
        if (C.lIllIIIllllIlII(llllllllllllllIlllIllIllllIIIIlI.p.gemBag() ? 1 : 0) && C.lIllIIIllllIlIl(llllllllllllllIlllIllIllllIIIIlI.o.k() ? 1 : 0) && C.lIllIIIllllIllI(llllllllllllllIlllIllIllllIIIIII = Bank.Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIIllIlllIllI[lIIllIlllIlll[2]])))) {
            llllllllllllllIlllIllIllllIIIIII.interact(lIIllIlllIllI[lIIllIlllIlll[0]]);
            return lIIllIlllIlll[1];
        }
        var1_1.withdraw();
        "".length();
        this.sleep(lIIllIlllIlll[2]);
        return lIIllIlllIlll[1];
    }

    @Inject
    public C(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIIllllIlII(int n2) {
        return n2 != 0;
    }

    private static void lIllIIIllllIIll() {
        lIIllIlllIlll = new int[5];
        C.lIIllIlllIlll[0] = (0x54 ^ 0x2A ^ (0x14 ^ 0x7F)) & (0x44 ^ 0xA ^ (0xCF ^ 0x94) ^ -" ".length());
        C.lIIllIlllIlll[1] = " ".length();
        C.lIIllIlllIlll[2] = "  ".length();
        C.lIIllIlllIlll[3] = "   ".length();
        C.lIIllIlllIlll[4] = 0xB7 ^ 0xBF ^ (0x30 ^ 0x78) & ~(0x8B ^ 0xC3);
    }

    private static void lIllIIIllllIIlI() {
        lIIllIlllIllI = new String[lIIllIlllIlll[3]];
        C.lIIllIlllIllI[C.lIIllIlllIlll[0]] = C.lIllIIIlllIllll("Fik0Gxw=", "SDDoe");
        C.lIIllIlllIllI[C.lIIllIlllIlll[1]] = C.lIllIIIllllIIII("V2DW07QBZtgZO9tiSRj8nMxLVCy7V5We", "aJPFu");
        C.lIIllIlllIllI[C.lIIllIlllIlll[2]] = C.lIllIIIllllIIIl("vpXuJ9cK0dc=", "VSQCc");
    }

    private static String lIllIIIllllIIIl(String llllllllllllllIlllIllIlllIlIIlIl, String llllllllllllllIlllIllIlllIlIIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlllIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlllIlIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIlllIlll[4]), "DES");
            Cipher llllllllllllllIlllIllIlllIlIIlll = Cipher.getInstance("DES");
            llllllllllllllIlllIllIlllIlIIlll.init(lIIllIlllIlll[2], llllllllllllllIlllIllIlllIlIlIII);
            return new String(llllllllllllllIlllIllIlllIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIlllIlIIllI) {
            llllllllllllllIlllIllIlllIlIIllI.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlllIllll(String llllllllllllllIlllIllIlllIIlIlIl, String llllllllllllllIlllIllIlllIIIllll) {
        llllllllllllllIlllIllIlllIIlIlIl = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIlllIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIlllIIlIIll = new StringBuilder();
        char[] llllllllllllllIlllIllIlllIIlIIlI = llllllllllllllIlllIllIlllIIIllll.toCharArray();
        int llllllllllllllIlllIllIlllIIlIIIl = lIIllIlllIlll[0];
        char[] llllllllllllllIlllIllIlllIIIlIll = llllllllllllllIlllIllIlllIIlIlIl.toCharArray();
        int llllllllllllllIlllIllIlllIIIlIlI = llllllllllllllIlllIllIlllIIIlIll.length;
        int llllllllllllllIlllIllIlllIIIlIIl = lIIllIlllIlll[0];
        while (C.lIllIIIlllllIII(llllllllllllllIlllIllIlllIIIlIIl, llllllllllllllIlllIllIlllIIIlIlI)) {
            char llllllllllllllIlllIllIlllIIlIllI = llllllllllllllIlllIllIlllIIIlIll[llllllllllllllIlllIllIlllIIIlIIl];
            llllllllllllllIlllIllIlllIIlIIll.append((char)(llllllllllllllIlllIllIlllIIlIllI ^ llllllllllllllIlllIllIlllIIlIIlI[llllllllllllllIlllIllIlllIIlIIIl % llllllllllllllIlllIllIlllIIlIIlI.length]));
            "".length();
            ++llllllllllllllIlllIllIlllIIlIIIl;
            ++llllllllllllllIlllIllIlllIIIlIIl;
            "".length();
            if (" ".length() >= " ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIlllIIlIIll);
    }

    private static String lIllIIIllllIIII(String llllllllllllllIlllIllIlllIllIIlI, String llllllllllllllIlllIllIlllIllIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlllIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlllIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIlllIllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIlllIllIlII.init(lIIllIlllIlll[2], llllllllllllllIlllIllIlllIllIlIl);
            return new String(llllllllllllllIlllIllIlllIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIlllIllIIll) {
            llllllllllllllIlllIllIlllIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllllIllI(Object object) {
        return object != null;
    }

    private static boolean lIllIIIllllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIllllIlll(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        void llllllllllllllIlllIllIlllIlllIll;
        if (C.lIllIIIllllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String llllllllllllllIlllIllIlllIlllIlI = llllllllllllllIlllIllIlllIlllIll.getMessage();
        if (C.lIllIIIllllIlII(llllllllllllllIlllIllIlllIlllIlI.contains(lIIllIlllIllI[lIIllIlllIlll[1]]) ? 1 : 0)) {
            C llllllllllllllIlllIllIlllIllllII;
            llllllllllllllIlllIllIlllIllllII.o.c(lIIllIlllIlll[1]);
        }
    }
}

