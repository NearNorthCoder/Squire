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
        N.llllIIlIllIl[0] = " ".length();
        N.llllIIlIllIl[1] = -" ".length();
        N.llllIIlIllIl[2] = (0x54 ^ 0x15) & ~(0xCD ^ 0x8C);
        N.llllIIlIllIl[3] = "  ".length();
        N.llllIIlIllIl[4] = "   ".length();
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
        N lllllllllllllllIIlIlllIllIlllIll;
        void lllllllllllllllIIlIlllIllIlllIlI;
        String lllllllllllllllIIlIlllIllIlllIIl;
        Object lllllllllllllllIIlIlllIllIllIlll;
        if (N.lIIIllllllIIIll(chatMessage.getType(), ChatMessageType.MESBOX)) {
            Object lllllllllllllllIIlIlllIllIllIllI;
            String string = Text.sanitizeMultilineText((String)chatMessage.getMessage()).toLowerCase();
            Matcher matcher = dk.matcher(string);
            if (N.lIIIlllllIlllII(matcher.find() ? 1 : 0)) {
                String string2 = matcher.group(llllIIlIllII[llllIIlIllIl[9]]);
                dn = Integer.parseInt(string2.replaceAll(llllIIlIllII[llllIIlIllIl[10]], llllIIlIllII[llllIIlIllIl[11]]));
            }
            if (N.lIIIlllllIlllII(((Matcher)(lllllllllllllllIIlIlllIllIllIlll = dl.matcher(lllllllllllllllIIlIlllIllIlllIIl))).find() ? 1 : 0)) {
                lllllllllllllllIIlIlllIllIllIllI = ((Matcher)lllllllllllllllIIlIlllIllIllIlll).group(llllIIlIllII[llllIIlIllIl[12]]);
                dn = Integer.parseInt(((String)lllllllllllllllIIlIlllIllIllIllI).replaceAll(llllIIlIllII[llllIIlIllIl[13]], llllIIlIllII[llllIIlIllIl[14]]));
            }
            if (N.lIIIlllllIlllII(((Matcher)(lllllllllllllllIIlIlllIllIllIllI = dm.matcher(lllllllllllllllIIlIlllIllIlllIIl))).find() ? 1 : 0)) {
                String lllllllllllllllIIlIlllIllIllIlIl = ((Matcher)lllllllllllllllIIlIlllIllIllIllI).group(llllIIlIllII[llllIIlIllIl[15]]);
                dn += Integer.parseInt(lllllllllllllllIIlIlllIllIllIlIl.replaceAll(llllIIlIllII[llllIIlIllIl[16]], llllIIlIllII[llllIIlIllIl[17]]));
            }
        }
        if (N.lIIIllllllIIlII(lllllllllllllllIIlIlllIllIlllIlI.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        lllllllllllllllIIlIlllIllIlllIIl = Text.sanitizeMultilineText((String)lllllllllllllllIIlIlllIllIlllIlI.getMessage()).toLowerCase();
        Matcher lllllllllllllllIIlIlllIllIlllIII = dj.matcher(lllllllllllllllIIlIlllIllIlllIIl);
        if (N.lIIIlllllIlllII(lllllllllllllllIIlIlllIllIlllIII.find() ? 1 : 0)) {
            lllllllllllllllIIlIlllIllIllIlll = lllllllllllllllIIlIlllIllIlllIII.group(llllIIlIllII[llllIIlIllIl[18]]);
            dn = Integer.parseInt(((String)lllllllllllllllIIlIlllIllIllIlll).replaceAll(llllIIlIllII[llllIIlIllIl[19]], llllIIlIllII[llllIIlIllIl[20]]));
        }
        if (N.lIIIlllllIlllII(lllllllllllllllIIlIlllIllIlllIlI.getMessage().contains(llllIIlIllII[llllIIlIllIl[21]]) ? 1 : 0)) {
            di.info(llllIIlIllII[llllIIlIllIl[22]]);
            N.p(llllIIlIllIl[2]);
            lllllllllllllllIIlIlllIllIlllIll.cW.m();
            "".length();
        }
        if (N.lIIIlllllIlllII(lllllllllllllllIIlIlllIllIlllIlI.getMessage().contains(llllIIlIllII[llllIIlIllIl[23]]) ? 1 : 0)) {
            Log.info((String)llllIIlIllII[llllIIlIllIl[24]]);
            if (N.lIIIlllllIlllII(lllllllllllllllIIlIlllIllIlllIll.cW.m() ? 1 : 0)) {
                lllllllllllllllIIlIlllIllIlllIll.cW.forceStop();
            }
        }
    }

    private static String lIIIlllllIlIlll(String lllllllllllllllIIlIlllIllIIIIlII, String lllllllllllllllIIlIlllIllIIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIllIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIllIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIllIIIIllI.init(llllIIlIllIl[3], lllllllllllllllIIlIlllIllIIIIlll);
            return new String(lllllllllllllllIIlIlllIllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIllIIIIlIl) {
            lllllllllllllllIIlIlllIllIIIIlIl.printStackTrace();
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
        N lllllllllllllllIIlIlllIlllIIlllI;
        if (N.lIIIlllllIlllII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return llllIIlIllIl[0];
        }
        Item lllllllllllllllIIlIlllIlllIIllIl = Inventory.getFirst(item -> this.ca().contains(item.getId()));
        if (N.lIIIlllllIlllIl(lllllllllllllllIIlIlllIlllIIllIl)) {
            if (N.lIIIlllllIlllII(Bank.isOpen() ? 1 : 0)) {
                Bank.withdraw(item -> this.ca().contains(item.getId()), (int)llllIIlIllIl[0], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return llllIIlIllIl[0];
            }
            return Bank.open();
        }
        if (N.lIIIlllllIlllII(GrandExchange.isOpen() ? 1 : 0)) {
            Bank.open();
            "".length();
            return llllIIlIllIl[0];
        }
        if (N.lIIIlllllIlllII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lllllllllllllllIIlIlllIlllIIlllI.cV.rechargeStaffAmount());
            return llllIIlIllIl[0];
        }
        if (N.lIIIlllllIllllI(dn, llllIIlIllIl[1])) {
            lllllllllllllllIIlIlllIlllIIllIl.interact(llllIIlIllII[llllIIlIllIl[2]]);
            return llllIIlIllIl[0];
        }
        if (N.lIIIlllllIlllll(dn, lllllllllllllllIIlIlllIlllIIlllI.cV.rechargeStaffAt())) {
            Object[] objectArray = new Object[llllIIlIllIl[3]];
            objectArray[N.llllIIlIllIl[2]] = dn;
            objectArray[N.llllIIlIllIl[0]] = lllllllllllllllIIlIlllIlllIIlllI.cV.rechargeStaffAt();
            Log.info((String)llllIIlIllII[llllIIlIllIl[0]], (Object[])objectArray);
            return llllIIlIllIl[2];
        }
        int lllllllllllllllIIlIlllIlllIIllII = lllllllllllllllIIlIlllIlllIIlllI.cg();
        if (N.lIIIllllllIIIII(lllllllllllllllIIlIlllIlllIIllII, llllIIlIllIl[1])) {
            if (N.lIIIlllllIlllII(Bank.isOpen() ? 1 : 0)) {
                if (N.lIIIlllllIlllII(Inventory.isFull() ? 1 : 0)) {
                    Bank.depositInventory();
                }
                int[] nArray = new int[llllIIlIllIl[0]];
                nArray[N.llllIIlIllIl[2]] = lllllllllllllllIIlIlllIlllIIllII;
                if (N.lIIIllllllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llllIIlIllIl[0]];
                    nArray2[N.llllIIlIllIl[2]] = lllllllllllllllIIlIlllIlllIIllII;
                    if (N.lIIIllllllIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        if (N.lIIIllllllIIIIl(lllllllllllllllIIlIlllIlllIIlllI.cV.enableRestocking() ? 1 : 0)) {
                            Object[] objectArray = new Object[llllIIlIllIl[0]];
                            objectArray[N.llllIIlIllIl[2]] = lllllllllllllllIIlIlllIlllIIllII;
                            Log.info((String)llllIIlIllII[llllIIlIllIl[3]], (Object[])objectArray);
                            lllllllllllllllIIlIlllIlllIIlllI.cW.forceStop();
                        }
                        Object[] objectArray = new Object[llllIIlIllIl[0]];
                        objectArray[N.llllIIlIllIl[2]] = lllllllllllllllIIlIlllIlllIIllII;
                        Log.info((String)llllIIlIllII[llllIIlIllIl[4]], (Object[])objectArray);
                        lllllllllllllllIIlIlllIlllIIlllI.cW.l(llllIIlIllIl[0]);
                    }
                }
                if (N.lIIIllllllIIIlI(Inventory.getFreeSlots(), lllllllllllllllIIlIlllIlllIIlllI.do)) {
                    Bank.depositAllExcept(item -> {
                        int n2;
                        if (!N.lIIIllllllIIIIl(this.dr.contains(item.getId()) ? 1 : 0) || N.lIIIlllllIlllII(this.dp.contains(item.getId()) ? 1 : 0)) {
                            n2 = llllIIlIllIl[0];
                            "".length();
                            if (" ".length() < 0) {
                                return ((1 ^ 0x30) & ~(0x97 ^ 0xA6)) != 0;
                            }
                        } else {
                            n2 = llllIIlIllIl[2];
                        }
                        return n2 != 0;
                    });
                    return llllIIlIllIl[0];
                }
                Bank.withdrawAll((int)lllllllllllllllIIlIlllIlllIIllII, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return llllIIlIllIl[0];
            }
            return Bank.open();
        }
        int[] nArray = new int[llllIIlIllIl[0]];
        nArray[N.llllIIlIllIl[2]] = lllllllllllllllIIlIlllIlllIIlllI.dr.get(llllIIlIllIl[2]);
        Item lllllllllllllllIIlIlllIlllIIlIll = Inventory.getFirst((int[])nArray);
        if (N.lIIIlllllIlllIl(lllllllllllllllIIlIlllIlllIIlIll)) {
            return llllIIlIllIl[2];
        }
        Iterator<Map.Entry<Integer, Integer>> lllllllllllllllIIlIlllIlllIIlIlI = lllllllllllllllIIlIlllIlllIIlllI.dq.entrySet().iterator();
        while (N.lIIIlllllIlllII(lllllllllllllllIIlIlllIlllIIlIlI.hasNext() ? 1 : 0)) {
            Map.Entry<Integer, Integer> lllllllllllllllIIlIlllIlllIIlIIl = lllllllllllllllIIlIlllIlllIIlIlI.next();
            int[] nArray3 = new int[llllIIlIllIl[0]];
            nArray3[N.llllIIlIllIl[2]] = lllllllllllllllIIlIlllIlllIIlIIl.getKey();
            if (N.lIIIllllllIIIlI(Inventory.getCount((boolean)llllIIlIllIl[0], (int[])nArray3), lllllllllllllllIIlIlllIlllIIlIIl.getValue())) {
                Object[] objectArray = new Object[llllIIlIllIl[0]];
                objectArray[N.llllIIlIllIl[2]] = lllllllllllllllIIlIlllIlllIIlllI.ca();
                Log.info((String)llllIIlIllII[llllIIlIllIl[5]], (Object[])objectArray);
                Object[] objectArray2 = new Object[llllIIlIllIl[0]];
                objectArray2[N.llllIIlIllIl[2]] = lllllllllllllllIIlIlllIlllIIlIIl.getKey();
                Log.info((String)llllIIlIllII[llllIIlIllIl[6]], (Object[])objectArray2);
                if (N.lIIIllllllIIIlI(dn, lllllllllllllllIIlIlllIlllIIlllI.cV.rechargeStaffAt())) {
                    if (N.lIIIllllllIIIIl(lllllllllllllllIIlIlllIlllIIlllI.cV.enableRestocking() ? 1 : 0)) {
                        Object[] objectArray3 = new Object[llllIIlIllIl[3]];
                        objectArray3[N.llllIIlIllIl[2]] = dn;
                        objectArray3[N.llllIIlIllIl[0]] = lllllllllllllllIIlIlllIlllIIlllI.cV.rechargeStaffAt();
                        Log.info((String)llllIIlIllII[llllIIlIllIl[7]], (Object[])objectArray3);
                        lllllllllllllllIIlIlllIlllIIlllI.cW.forceStop();
                        return llllIIlIllIl[2];
                    }
                    Object[] objectArray4 = new Object[llllIIlIllIl[3]];
                    objectArray4[N.llllIIlIllIl[2]] = dn;
                    objectArray4[N.llllIIlIllIl[0]] = lllllllllllllllIIlIlllIlllIIlllI.cV.rechargeStaffAt();
                    Log.info((String)llllIIlIllII[llllIIlIllIl[8]], (Object[])objectArray4);
                    lllllllllllllllIIlIlllIlllIIlllI.cW.l(llllIIlIllIl[0]);
                    return llllIIlIllIl[2];
                }
            }
            "".length();
            if ((0x23 ^ 0x27) >= ((0x19 ^ 0x50) & ~(9 ^ 0x40))) continue;
            return ((0x28 ^ 0x2F) & ~(0x14 ^ 0x13)) != 0;
        }
        var3_3.useOn((Item)var1_1);
        return llllIIlIllIl[0];
    }

    private static String lIIIlllllIllIII(String lllllllllllllllIIlIlllIllIlIIllI, String lllllllllllllllIIlIlllIllIlIIIII) {
        lllllllllllllllIIlIlllIllIlIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIllIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIllIlIIlII = new StringBuilder();
        char[] lllllllllllllllIIlIlllIllIlIIIll = lllllllllllllllIIlIlllIllIlIIIII.toCharArray();
        int lllllllllllllllIIlIlllIllIlIIIlI = llllIIlIllIl[2];
        char[] lllllllllllllllIIlIlllIllIIlllII = lllllllllllllllIIlIlllIllIlIIllI.toCharArray();
        int lllllllllllllllIIlIlllIllIIllIll = lllllllllllllllIIlIlllIllIIlllII.length;
        int lllllllllllllllIIlIlllIllIIllIlI = llllIIlIllIl[2];
        while (N.lIIIllllllIIIlI(lllllllllllllllIIlIlllIllIIllIlI, lllllllllllllllIIlIlllIllIIllIll)) {
            char lllllllllllllllIIlIlllIllIlIIlll = lllllllllllllllIIlIlllIllIIlllII[lllllllllllllllIIlIlllIllIIllIlI];
            lllllllllllllllIIlIlllIllIlIIlII.append((char)(lllllllllllllllIIlIlllIllIlIIlll ^ lllllllllllllllIIlIlllIllIlIIIll[lllllllllllllllIIlIlllIllIlIIIlI % lllllllllllllllIIlIlllIllIlIIIll.length]));
            "".length();
            ++lllllllllllllllIIlIlllIllIlIIIlI;
            ++lllllllllllllllIIlIlllIllIIllIlI;
            "".length();
            if (-" ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlllIllIlIIlII);
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
        Iterator<Integer> lllllllllllllllIIlIlllIlllIIIlII = this.dr.iterator();
        while (N.lIIIlllllIlllII(lllllllllllllllIIlIlllIlllIIIlII.hasNext() ? 1 : 0)) {
            Integer lllllllllllllllIIlIlllIlllIIIIll = lllllllllllllllIIlIlllIlllIIIlII.next();
            int[] nArray = new int[llllIIlIllIl[0]];
            nArray[N.llllIIlIllIl[2]] = lllllllllllllllIIlIlllIlllIIIIll;
            if (N.lIIIllllllIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lllllllllllllllIIlIlllIlllIIIIll;
            }
            "".length();
            if ((0xAD ^ 0xA9) >= " ".length()) continue;
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

    private static String lIIIlllllIllIIl(String lllllllllllllllIIlIlllIllIIlIIIl, String lllllllllllllllIIlIlllIllIIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIllIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIllIIlIIII.getBytes(StandardCharsets.UTF_8)), llllIIlIllIl[9]), "DES");
            Cipher lllllllllllllllIIlIlllIllIIlIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIllIIlIIll.init(llllIIlIllIl[3], lllllllllllllllIIlIlllIllIIlIlII);
            return new String(lllllllllllllllIIlIlllIllIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIllIIlIIlI) {
            lllllllllllllllIIlIlllIllIIlIIlI.printStackTrace();
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
        N.llllIIlIllII[N.llllIIlIllIl[2]] = N.lIIIlllllIlIlll("7YbLu8u2Jro=", "JQCsb");
        N.llllIIlIllII[N.llllIIlIllIl[0]] = N.lIIIlllllIllIII("PwgJOTYfCg8CIwwLDGt3DhgYIzIDGUoyPwwfDTQkV00RLHcEHko2JQgMHjQlTRkCMDlNHw8yPwwfDTQEGQwMNxYZV0oqKkM=", "mmjQW");
        N.llllIIlIllII[N.llllIIlIllIl[3]] = N.lIIIlllllIlIlll("1A79pl+zq5OtimJlziStoN/2oRFTfKrQJsr96ypUXUxTyIYV9XPgTgitYF0mzBJnstqwlpCIMl1LIFhP8uDvwfa1p1Gqba+MPPRERFK5ISk=", "SiqKU");
        N.llllIIlIllII[N.llllIIlIllIl[4]] = N.lIIIlllllIllIII("ICsiJwAAKSQcFRMoJ3VBHycyPAgcKWE9BBEmID0GF24oOwQfbjoyQRMgJW8WF24lIEEcITVvCRM4JG8IBmJhPBUTPDUmDxVuMyoSBiEiJE8=", "rNAOa");
        N.llllIIlIllII[N.llllIIlIllIl[5]] = N.lIIIlllllIlIlll("AdrOw+hqZtJ9O+yleeaDrLNUpW2/V9dfJJa8s2qj6sUnaDNHbvmZGw==", "DTCai");
        N.llllIIlIllII[N.llllIIlIllIl[6]] = N.lIIIlllllIlIlll("DU8SrPxZ/PpuIVR0nFPbLjUfc7JfNY9czXuLU4cOcXS9diEMU/fo9UMH4AUTmOTe/Y7blYYtpYgTVdEO6Rvbb2bJvOT15tvh", "VXPZs");
        N.llllIIlIllII[N.llllIIlIllIl[7]] = N.lIIIlllllIllIII("HT86GhA9PTwhBS48P0hRLC8rABQhLnkRGS4oPhcCdXoiD1EmKXkeFDwpeQYZLjR5ABQsMjgAFioJLRMXKRstSFE0J3VSECE+eQUUbz42HFY7ejETByp6LRoUbyg8AwQmKDwWUSYuPB8CYXoLFwI7NToZGCE9eRsCbz4wARAtNjwWUTw1eQUUby0wHh1vKS0dAWE=", "OZYrq");
        N.llllIIlIllII[N.llllIIlIllIl[8]] = N.lIIIlllllIllIII("CAYsBSgoBCo+PTsFKVdpORY9Hyw0F28OITsRKAg6YEM0EGkzEG8BLCkQbxkhOw1vHyw5Cy4fLj8wOwwvPCI7V2khHmNNKDQHbxosegcgA24uQycMPz9DOwUsehEqHDwzESoJaTMXKgA6dkM8GSgoFyYDLnoRKh49NQAkQw==", "ZcOmI");
        N.llllIIlIllII[N.llllIIlIllIl[9]] = N.lIIIlllllIllIII("Bg0dKj0xCgg5NhcR", "rbiKQ");
        N.llllIIlIllII[N.llllIIlIllIl[10]] = N.lIIIlllllIllIIl("bOa3OpOwb2A=", "jeIwf");
        N.llllIIlIllII[N.llllIIlIllIl[11]] = N.lIIIlllllIllIIl("1RajdouurAs=", "fhmMZ");
        N.llllIIlIllII[N.llllIIlIllIl[12]] = N.lIIIlllllIllIIl("Fzv//rPIKYx7uXrSoZQzLQ==", "PUjSe");
        N.llllIIlIllII[N.llllIIlIllIl[13]] = N.lIIIlllllIllIII("aA==", "DvVEU");
        N.llllIIlIllII[N.llllIIlIllIl[14]] = N.lIIIlllllIllIII("", "cJTtA");
        N.llllIIlIllII[N.llllIIlIllIl[15]] = N.lIIIlllllIllIIl("IZcGjdL8LbFdLFBUg9oT7SViUu3pazzH", "OjMSF");
        N.llllIIlIllII[N.llllIIlIllIl[16]] = N.lIIIlllllIlIlll("rdz+1aphZhg=", "YTgcI");
        N.llllIIlIllII[N.llllIIlIllIl[17]] = N.lIIIlllllIllIIl("rb8Uy+wP8lM=", "ODjTa");
        N.llllIIlIllII[N.llllIIlIllIl[18]] = N.lIIIlllllIllIIl("9GrUI+TCmUg=", "NPVut");
        N.llllIIlIllII[N.llllIIlIllIl[19]] = N.lIIIlllllIllIIl("JqoI7p5X9JE=", "BRQaw");
        N.llllIIlIllII[N.llllIIlIllIl[20]] = N.lIIIlllllIlIlll("AGY/ZxzR5YE=", "LBfQm");
        N.llllIIlIllII[N.llllIIlIllIl[21]] = N.lIIIlllllIllIII("CSMWdSMOYgY9LBMlACY=", "aBeUM");
        N.llllIIlIllII[N.llllIIlIllIl[22]] = N.lIIIlllllIllIII("Gy4IOBI7LA4DBygtDWpTJiUoOBI9Bg4jACgsDmpTOj8KNhVpIwojUyckSzMbKDkMNQA=", "IKkPs");
        N.llllIIlIllII[N.llllIIlIllIl[23]] = N.lIIIlllllIllIII("BA4BIBIPEgt3DAMHCiRCEg1ONQdGAQY2EAEHCncVDxYG", "fbnWb");
        N.llllIIlIllII[N.llllIIlIllIl[24]] = N.lIIIlllllIllIII("FTEiLy8vESApFDoCISoadEMQKWcvESJsKDsXZyMhbgErIzA+CjcpZyoCNTg0bgw1bDQtAispNGJDMykrKxMoPjMnDSBsKDsXZy0pKkM0OCg+Ey4iIGA=", "NcGLG");
        N.llllIIlIllII[N.llllIIlIllIl[25]] = N.lIIIlllllIllIIl("0X4GErRk3b82gTLnJ/1i7D8qDB3K+WiGcdTHVCKW97qB+vf/ogUnY6icrQrQRBrzn7B+rVbvesBn1J84I7fyNiqbt0WmOHzP5o4YlW+4DVK3I2YsKwfC1ULuqrUrmy7d", "YkxIv");
        N.llllIIlIllII[N.llllIIlIllIl[26]] = N.lIIIlllllIllIIl("NaVX2fuVVbNMafnlr9g7Z1XEejUKXARzECzDjSSa7WZWGL/tZUHNJLs0zGpELKcILys9g0QEO3FLmlpKRFAeEKWMdeUKyMdo8xsnwSERFdTV1wL35UdmSrODiMqrBaeYeUHXnc1yT+74rR4keRTyiw==", "wxjjg");
        N.llllIIlIllII[N.llllIIlIllIl[27]] = N.lIIIlllllIlIlll("3AreQsyVW3k7mx1aQDiWbj5CldBSVFXUeVDn2s/y56kVD8XthmPumdT/Elp18otHG37dE/kdVzuiTUHU3X0sG0ZnfG9WjuyPB3iOuR7YPugRPvdAkUmgrO5Gci0H844LwpNSkzuFKCVOSXCuPIAQ3fa7prTAXRNglTEybxmScy84wzpFRFd2oF4GUK6kxMmnN5Hin6N+jJ0=", "tPalH");
        N.llllIIlIllII[N.llllIIlIllIl[28]] = N.lIIIlllllIllIIl("VmeMBR/DsZ0c9ly0XUESBnJQGfZrec+1LW+h2MQLoKQbQgrgqIVDksOU6KC45bvvHMo8qkh9FbS+Zxn4Vhnko4O3yhz4SGFQ7rdEUesD7Z8=", "jGxBr");
    }
}

