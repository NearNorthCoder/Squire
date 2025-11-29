/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.util.Log
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.D;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class N
extends D {
    private static /* synthetic */ int[] llllIIlIllIl;
    private static final /* synthetic */ Pattern dk;
    private static final /* synthetic */ Logger di;
    private static /* synthetic */ String[] llllIIlIllII;
    protected /* synthetic */ Map<Integer, Integer> dq;
    private static final /* synthetic */ Pattern dl;
    private static final /* synthetic */ Pattern dm;
    private static final /* synthetic */ Pattern dj;
    protected /* synthetic */ int do;
    protected /* synthetic */ Collection<Integer> dp;
    protected /* synthetic */ List<Integer> dr;
    public static /* synthetic */ int dn;

    private static void lIIIlllllIllIll() {
        llllIIlIllIl = new int[30];
        N.llllIIlIllIl[0] = 1;
        N.llllIIlIllIl[1] = -1;
        N.llllIIlIllIl[2] = (0x54 ^ 0x15) & ~(0xCD ^ 0x8C);
        N.llllIIlIllIl[3] = 2;
        N.llllIIlIllIl[4] = 3;
        N.llllIIlIllIl[5] = 9 ^ 0x22 ^ (0xAF ^ 0x80);
        N.llllIIlIllIl[6] = 82 + 90 - 5 + 2 ^ 129 + 107 - 108 + 44;
        N.llllIIlIllIl[7] = 0x88 ^ 0x8E;
        N.llllIIlIllIl[8] = 163 + 142 - 124 + 3 ^ 106 + 181 - 233 + 137;
        N.llllIIlIllIl[9] = 5 ^ 0xD;
        N.llllIIlIllIl[10] = 113 + 61 - 58 + 38 ^ 110 + 141 - 245 + 141;
        N.llllIIlIllIl[11] = 0x54 ^ 0x68 ^ (0x44 ^ 0x72);
        N.llllIIlIllIl[12] = 143 + 30 - 114 + 123 ^ 147 + 66 - 179 + 155;
        N.llllIIlIllIl[13] = 0x1C ^ 0x10;
        N.llllIIlIllIl[14] = 0x3D ^ 0x30;
        N.llllIIlIllIl[15] = 0x4C ^ 0x42;
        N.llllIIlIllIl[16] = 0x82 ^ 0x8D;
        N.llllIIlIllIl[17] = 0x60 ^ 0x70;
        N.llllIIlIllIl[18] = 0x62 ^ 0x73;
        N.llllIIlIllIl[19] = 0x78 ^ 0x6A;
        N.llllIIlIllIl[20] = 0x27 ^ 0x55 ^ (0x6D ^ 0xC);
        N.llllIIlIllIl[21] = 0x46 ^ 0x52;
        N.llllIIlIllIl[22] = 133 + 129 - 219 + 102 ^ 10 + 69 - -23 + 30;
        N.llllIIlIllIl[23] = 0x41 ^ 0x57;
        N.llllIIlIllIl[24] = 0x5A ^ 0x4D;
        N.llllIIlIllIl[25] = 0x53 ^ 0x4B;
        N.llllIIlIllIl[26] = 0x4F ^ 0x1F ^ (0xCE ^ 0x87);
        N.llllIIlIllIl[27] = 9 ^ 0x13 ^ (0x2B ^ 0x4B) & ~(0x65 ^ 5);
        N.llllIIlIllIl[28] = 0x15 ^ 0xE;
        N.llllIIlIllIl[29] = 79 + 215 - 88 + 13 ^ 146 + 37 - 124 + 140;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        N var25;
        void var12;
        String var26;
        Object var8;
        if (N.lIIIllllllIIIll(chatMessage.getType(), ChatMessageType.MESBOX)) {
            Object var32;
            String string = Text.sanitizeMultilineText((String)chatMessage.getMessage()).toLowerCase();
            Matcher matcher = dk.matcher(string);
            if (N.lIIIlllllIlllII(matcher.find() ? 1 : 0)) {
                String string2 = matcher.group(llllIIlIllII[llllIIlIllIl[9]]);
                dn = Integer.parseInt(string2.replaceAll(llllIIlIllII[llllIIlIllIl[10]], llllIIlIllII[llllIIlIllIl[11]]));
            }
            if (N.lIIIlllllIlllII(((Matcher)(var8 = dl.matcher(var26))).find() ? 1 : 0)) {
                var32 = ((Matcher)var8).group(llllIIlIllII[llllIIlIllIl[12]]);
                dn = Integer.parseInt(((String)var32).replaceAll(llllIIlIllII[llllIIlIllIl[13]], llllIIlIllII[llllIIlIllIl[14]]));
            }
            if (N.lIIIlllllIlllII(((Matcher)(var32 = dm.matcher(var26))).find() ? 1 : 0)) {
                String var17 = ((Matcher)var32).group(llllIIlIllII[llllIIlIllIl[15]]);
                dn += Integer.parseInt(var17.replaceAll(llllIIlIllII[llllIIlIllIl[16]], llllIIlIllII[llllIIlIllIl[17]]));
            }
        }
        if (N.lIIIllllllIIlII(var12.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        var26 = Text.sanitizeMultilineText((String)var12.getMessage()).toLowerCase();
        Matcher var14 = dj.matcher(var26);
        if (N.lIIIlllllIlllII(var14.find() ? 1 : 0)) {
            var8 = var14.group(llllIIlIllII[llllIIlIllIl[18]]);
            dn = Integer.parseInt(((String)var8).replaceAll(llllIIlIllII[llllIIlIllIl[19]], llllIIlIllII[llllIIlIllIl[20]]));
        }
        if (N.lIIIlllllIlllII(var12.getMessage().contains(llllIIlIllII[llllIIlIllIl[21]]) ? 1 : 0)) {
            di.info(llllIIlIllII[llllIIlIllIl[22]]);
            N.p(llllIIlIllIl[2]);
            var25.cW.m();
            0;
        }
        if (N.lIIIlllllIlllII(var12.getMessage().contains(llllIIlIllII[llllIIlIllIl[23]]) ? 1 : 0)) {
            Log.info((String)llllIIlIllII[llllIIlIllIl[24]]);
            if (N.lIIIlllllIlllII(var25.cW.m() ? 1 : 0)) {
                var25.cW.forceStop();
            }
        }
    }

    private static String lIIIlllllIlIlll(String var27, String var19) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llllIIlIllIl[3], var2);
            return new String(var6.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllllIIIII(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean cf() {
        void var1_1;
        void var3_3;
        N var18;
        if (N.lIIIlllllIlllII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llllIIlIllIl[0];
        }
        Item var33 = Inventory.getFirst(item -> this.ca().contains(item.getId()));
        if (N.lIIIlllllIlllIl(var33)) {
            if (N.lIIIlllllIlllII(Bank.isOpen() ? 1 : 0)) {
                Bank.withdraw(item -> this.ca().contains(item.getId()), (int)llllIIlIllIl[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return llllIIlIllIl[0];
            }
            return Bank.open();
        }
        if (N.lIIIlllllIlllII(GrandExchange.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return llllIIlIllIl[0];
        }
        if (N.lIIIlllllIlllII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)var18.cV.rechargeStaffAmount());
            return llllIIlIllIl[0];
        }
        if (N.lIIIlllllIllllI(dn, llllIIlIllIl[1])) {
            var33.interact(llllIIlIllII[llllIIlIllIl[2]]);
            return llllIIlIllIl[0];
        }
        if (N.lIIIlllllIlllll(dn, var18.cV.rechargeStaffAt())) {
            Object[] objectArray = new Object[llllIIlIllIl[3]];
            objectArray[N.llllIIlIllIl[2]] = dn;
            objectArray[N.llllIIlIllIl[0]] = var18.cV.rechargeStaffAt();
            Log.info((String)llllIIlIllII[llllIIlIllIl[0]], (Object[])objectArray);
            return llllIIlIllIl[2];
        }
        int var10 = var18.cg();
        if (N.lIIIllllllIIIII(var10, llllIIlIllIl[1])) {
            if (N.lIIIlllllIlllII(Bank.isOpen() ? 1 : 0)) {
                if (N.lIIIlllllIlllII(Inventory.isFull() ? 1 : 0)) {
                    Bank.depositInventory();
                }
                int[] nArray = new int[llllIIlIllIl[0]];
                nArray[N.llllIIlIllIl[2]] = var10;
                if (N.lIIIllllllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llllIIlIllIl[0]];
                    nArray2[N.llllIIlIllIl[2]] = var10;
                    if (N.lIIIllllllIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        if (N.lIIIllllllIIIIl(var18.cV.enableRestocking() ? 1 : 0)) {
                            Object[] objectArray = new Object[llllIIlIllIl[0]];
                            objectArray[N.llllIIlIllIl[2]] = var10;
                            Log.info((String)llllIIlIllII[llllIIlIllIl[3]], (Object[])objectArray);
                            var18.cW.forceStop();
                        }
                        Object[] objectArray = new Object[llllIIlIllIl[0]];
                        objectArray[N.llllIIlIllIl[2]] = var10;
                        Log.info((String)llllIIlIllII[llllIIlIllIl[4]], (Object[])objectArray);
                        var18.cW.l(llllIIlIllIl[0]);
                    }
                }
                if (N.lIIIllllllIIIlI(Inventory.getFreeSlots(), var18.do)) {
                    Bank.depositAllExcept(item -> {
                        int n2;
                        if (!N.lIIIllllllIIIIl(this.dr.contains(item.getId()) ? 1 : 0) || N.lIIIlllllIlllII(this.dp.contains(item.getId()) ? 1 : 0)) {
                            n2 = llllIIlIllIl[0];
                            0;
                            if (1 < 0) {
                                return false;
                            }
                        } else {
                            n2 = llllIIlIllIl[2];
                        }
                        return n2 != 0;
                    });
                    return llllIIlIllIl[0];
                }
                Bank.withdrawAll((int)var10, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return llllIIlIllIl[0];
            }
            return Bank.open();
        }
        int[] nArray = new int[llllIIlIllIl[0]];
        nArray[N.llllIIlIllIl[2]] = var18.dr.get(llllIIlIllIl[2]);
        Item var22 = Inventory.getFirst((int[])nArray);
        if (N.lIIIlllllIlllIl(var22)) {
            return llllIIlIllIl[2];
        }
        Iterator<Map.Entry<Integer, Integer>> var13 = var18.dq.entrySet().iterator();
        while (N.lIIIlllllIlllII(var13.hasNext() ? 1 : 0)) {
            Map.Entry<Integer, Integer> var20 = var13.next();
            int[] nArray3 = new int[llllIIlIllIl[0]];
            nArray3[N.llllIIlIllIl[2]] = var20.getKey();
            if (N.lIIIllllllIIIlI(Inventory.getCount((boolean)llllIIlIllIl[0], (int[])nArray3), var20.getValue())) {
                Object[] objectArray = new Object[llllIIlIllIl[0]];
                objectArray[N.llllIIlIllIl[2]] = var18.ca();
                Log.info((String)llllIIlIllII[llllIIlIllIl[5]], (Object[])objectArray);
                Object[] objectArray2 = new Object[llllIIlIllIl[0]];
                objectArray2[N.llllIIlIllIl[2]] = var20.getKey();
                Log.info((String)llllIIlIllII[llllIIlIllIl[6]], (Object[])objectArray2);
                if (N.lIIIllllllIIIlI(dn, var18.cV.rechargeStaffAt())) {
                    if (N.lIIIllllllIIIIl(var18.cV.enableRestocking() ? 1 : 0)) {
                        Object[] objectArray3 = new Object[llllIIlIllIl[3]];
                        objectArray3[N.llllIIlIllIl[2]] = dn;
                        objectArray3[N.llllIIlIllIl[0]] = var18.cV.rechargeStaffAt();
                        Log.info((String)llllIIlIllII[llllIIlIllIl[7]], (Object[])objectArray3);
                        var18.cW.forceStop();
                        return llllIIlIllIl[2];
                    }
                    Object[] objectArray4 = new Object[llllIIlIllIl[3]];
                    objectArray4[N.llllIIlIllIl[2]] = dn;
                    objectArray4[N.llllIIlIllIl[0]] = var18.cV.rechargeStaffAt();
                    Log.info((String)llllIIlIllII[llllIIlIllIl[8]], (Object[])objectArray4);
                    var18.cW.l(llllIIlIllIl[0]);
                    return llllIIlIllIl[2];
                }
            }
            0;
            if ((0x23 ^ 0x27) >= ((0x19 ^ 0x50) & ~(9 ^ 0x40))) continue;
            return false;
        }
        var3_3.useOn((Item)var1_1);
        return llllIIlIllIl[0];
    }

    private static String lIIIlllllIllIII(String var31, String var34) {
        var31 = new String(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var15 = var34.toCharArray();
        int var4 = llllIIlIllIl[2];
        char[] var1 = var31.toCharArray();
        int var23 = var1.length;
        int var29 = llllIIlIllIl[2];
        while (N.lIIIllllllIIIlI(var29, var23)) {
            char var24 = var1[var29];
            var3.append((char)(var24 ^ var15[var4 % var15.length]));
            0;
            ++var4;
            ++var29;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean lIIIllllllIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlllllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllllllIIlII(Object object, Object object2) {
        return object != object2;
    }

    public int cg() {
        Iterator<Integer> var7 = this.dr.iterator();
        while (N.lIIIlllllIlllII(var7.hasNext() ? 1 : 0)) {
            Integer var16 = var7.next();
            int[] nArray = new int[llllIIlIllIl[0]];
            nArray[N.llllIIlIllIl[2]] = var16;
            if (N.lIIIllllllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return var16;
            }
            0;
            if ((0xAD ^ 0xA9) >= 1) continue;
            return (3 ^ 0x5E) & ~(0xE0 ^ 0xBD);
        }
        return llllIIlIllIl[1];
    }

    private static boolean lIIIlllllIlllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlllllIlllIl(Object object) {
        return object == null;
    }

    @Inject
    protected N(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    public static int ch() {
        return dn;
    }

    private static boolean lIIIllllllIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlllllIllIIl(String var9, String var5) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llllIIlIllIl[9]), "DES");
            Cipher var30 = Cipher.getInstance("DES");
            var30.init(llllIIlIllIl[3], var21);
            return new String(var30.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    public static void p(int n2) {
        dn = n2;
    }

    private static boolean lIIIlllllIlllII(int n2) {
        return n2 != 0;
    }

    static {
        N.lIIIlllllIllIll();
        N.lIIIlllllIllIlI();
        di = LoggerFactory.getLogger(N.class);
        dj = Pattern.compile(llllIIlIllII[llllIIlIllIl[25]]);
        dk = Pattern.compile(llllIIlIllII[llllIIlIllIl[26]]);
        dl = Pattern.compile(llllIIlIllII[llllIIlIllIl[27]]);
        dm = Pattern.compile(llllIIlIllII[llllIIlIllIl[28]]);
        dn = llllIIlIllIl[1];
    }

    private static void lIIIlllllIllIlI() {
        llllIIlIllII = new String[llllIIlIllIl[29]];
        N.llllIIlIllII[N.llllIIlIllIl[2]] = N."Check";
        N.llllIIlIllII[N.llllIIlIllIl[0]] = N."RechargeStaff: current charges: {} is greater than rechargeStaffAt: {}.";
        N.llllIIlIllII[N.llllIIlIllIl[3]] = N."RechargeStaff: missing recharge item {} and we do not have it, stopping plugin.";
        N.llllIIlIllII[N.llllIIlIllIl[4]] = N."RechargeStaff: missing recharge item {} and we do not have it, starting restock.";
        N.llllIIlIllII[N.llllIIlIllIl[5]] = N."RechargeStaff: Current staff ids: {}";
        N.llllIIlIllII[N.llllIIlIllIl[6]] = N."RechargeStaff: not enough of item: {} and we do NOT seem to have it.";
        N.llllIIlIllII[N.llllIIlIllIl[7]] = N."RechargeStaff: current charges: {} is less than rechargeStaffAt: {}, and we don't have the required items. Restocking is disabled so we will stop.";
        N.llllIIlIllII[N.llllIIlIllIl[8]] = N."RechargeStaff: current charges: {} is less than rechargeStaffAt: {}, and we don't have the required items, starting restock.";
        N.llllIIlIllII[N.llllIIlIllIl[9]] = N."totalCharges";
        N.llllIIlIllII[N.llllIIlIllIl[10]] = N.",";
        N.llllIIlIllII[N.llllIIlIllIl[11]] = N."";
        N.llllIIlIllII[N.llllIIlIllIl[12]] = N."totalCharges";
        N.llllIIlIllII[N.llllIIlIllIl[13]] = N.",";
        N.llllIIlIllII[N.llllIIlIllIl[14]] = N."";
        N.llllIIlIllII[N.llllIIlIllIl[15]] = N."amountOfChargesAdded";
        N.llllIIlIllII[N.llllIIlIllIl[16]] = N.",";
        N.llllIIlIllII[N.llllIIlIllIl[17]] = N."";
        N.llllIIlIllII[N.llllIIlIllIl[18]] = N."amount";
        N.llllIIlIllII[N.llllIIlIllIl[19]] = N.",";
        N.llllIIlIllII[N.llllIIlIllIl[20]] = N."";
        N.llllIIlIllII[N.llllIIlIllIl[21]] = N."has no charges";
        N.llllIIlIllII[N.llllIIlIllIl[22]] = N."RechargeStaff: onChatMessage: staff has no charges";
        N.llllIIlIllII[N.llllIIlIllIl[23]] = N."blowpipe needs to be charged with";
        N.llllIIlIllII[N.llllIIlIllIl[24]] = N."[RechargeStaff]: We are out of blowpipe darts or scales, teleporting out and stopping.";
        N.llllIIlIllII[N.llllIIlIllIl[25]] = N."^(?:your )?(?<item>.+?) (?:only has|has) (?<amount>[\\d,]+) charges(?: (?:left|remaining))?\\.$";
        N.llllIIlIllII[N.llllIIlIllIl[26]] = N."^you add (?<amountOfChargesAdded>[\\d,]+) charges to the (?<itemName>.+?)\\. new total: (?<totalCharges>[\\d,]+)$";
        N.llllIIlIllII[N.llllIIlIllIl[27]] = N."^you apply an additional (?<amountOfChargesAdded>[\\d,]+) charges to your (?<itemName>.+?)\\. it now has (?<totalCharges>[\\d,]+) charges in total\\.$";
        N.llllIIlIllII[N.llllIIlIllIl[28]] = N."^you apply (?<amountOfChargesAdded>[\\d,]+) charges to your (?<itemName>.+?)\\.$";
    }
}

