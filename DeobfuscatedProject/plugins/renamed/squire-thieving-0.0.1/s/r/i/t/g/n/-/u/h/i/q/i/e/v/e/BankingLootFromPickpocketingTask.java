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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a_Unknown;

/* TASK: Banking loot from pickpocketing -> BankinglootfrompickpocketingTask */
@TaskDesc(name="Banking loot from pickpocketing", priority=2000, blocking=true, register=true)
public class BankingLootFromPickpocketingTask
extends a_Unknown {
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
        Item var18;
        C var19;
        if (C.lIllIIIllllIlII(this.p.depositSeedVault() ? 1 : 0)) {
            return lIIllIlllIlll[0];
        }
        if (C.lIllIIIllllIlIl(var19.o.j() ? 1 : 0)) {
            return lIIllIlllIlll[0];
        }
        if (C.lIllIIIllllIlIl(Bank.isOpen() ? 1 : 0)) {
            return lIIllIlllIlll[0];
        }
        InventorySetup var3 = var19.o.g();
        if (C.lIllIIIllllIlII(var3.matchesInventory() ? 1 : 0)) {
            var19.o.b(lIIllIlllIlll[0]);
        }
        if (C.lIllIIIllllIlII(var19.p.gemBag() ? 1 : 0) && C.lIllIIIllllIlIl(var19.o.k() ? 1 : 0) && C.lIllIIIllllIllI(var18 = Bank.Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIIllIlllIllI[lIIllIlllIlll[2]])))) {
            var18.interact(lIIllIlllIllI[lIIllIlllIlll[0]]);
            return lIIllIlllIlll[1];
        }
        var1_1.withdraw();
        0;
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
        C.lIIllIlllIlll[0] = (0x54 ^ 0x2A ^ (0x14 ^ 0x7F)) & (0x44 ^ 0xA ^ (0xCF ^ 0x94) ^ -1);
        C.lIIllIlllIlll[1] = 1;
        C.lIIllIlllIlll[2] = 2;
        C.lIIllIlllIlll[3] = 3;
        C.lIIllIlllIlll[4] = 0xB7 ^ 0xBF ^ (0x30 ^ 0x78) & ~(0x8B ^ 0xC3);
    }

    private static void lIllIIIllllIIlI() {
        lIIllIlllIllI = new String[lIIllIlllIlll[3]];
        C.lIIllIlllIllI[C.lIIllIlllIlll[0]] = C."Empty";
        C.lIIllIlllIllI[C.lIIllIlllIlll[1]] = C."gem bag is empty";
        C.lIIllIlllIllI[C.lIIllIlllIlll[2]] = C."gem bag";
    }

    private static String lIllIIIllllIIIl(String var24, String var12) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIIllIlllIlll[4]), "DES");
            Cipher var25 = Cipher.getInstance("DES");
            var25.init(lIIllIlllIlll[2], var16);
            return new String(var25.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlllIllll(String var5, String var22) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var21 = var22.toCharArray();
        int var11 = lIIllIlllIlll[0];
        char[] var7 = var5.toCharArray();
        int var23 = var7.length;
        int var13 = lIIllIlllIlll[0];
        while (C.lIllIIIlllllIII(var13, var23)) {
            char var9 = var7[var13];
            var15.append((char)(var9 ^ var21[var11 % var21.length]));
            0;
            ++var11;
            ++var13;
            0;
            if (1 >= 1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static String lIllIIIllllIIII(String var6, String var20) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIllIlllIlll[2], var10);
            return new String(var17.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
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
        void var1;
        if (C.lIllIIIllllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var14 = var1.getMessage();
        if (C.lIllIIIllllIlII(var14.contains(lIIllIlllIllI[lIIllIlllIlll[1]]) ? 1 : 0)) {
            C var8;
            var8.o.c(lIIllIlllIlll[1]);
        }
    }
}

