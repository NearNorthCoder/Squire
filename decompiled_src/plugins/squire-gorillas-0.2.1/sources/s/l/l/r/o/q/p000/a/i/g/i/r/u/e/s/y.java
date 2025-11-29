package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemDespawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.game.ItemStack;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
@Singleton
@TaskDesc(name = "Looting Gorilla", priority = 25, blocking = true, register = true)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.y  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/y.class */
public class y extends Task {
    private final /* synthetic */ List<ItemStack> al = new ArrayList();
    private final /* synthetic */ o an;
    private static final /* synthetic */ Set<Integer> ak;
    private /* synthetic */ ItemStack ap;
    private final /* synthetic */ SquireGorillaConfig am;
    private static /* synthetic */ String[] llIIllIIIlIl;
    private /* synthetic */ TileItem ao;
    private static /* synthetic */ int[] llIIllIIIllI;

    private static boolean llllllIIIlIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llllllIIIIllII(int i) {
        return i == 0;
    }

    private static boolean llllllIIIIlllI(int i, int i2) {
        return i != i2;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        int i;
        for (ItemStack itemStack : npcLootReceived.getItems()) {
            if (llllllIIIIllIl(Inventory.getFirst(item -> {
                if (llllllIIIlIIIl(item.getId(), itemStack.getId()) && llllllIIIIlIlI(item.isStackable() ? 1 : 0)) {
                    ?? r0 = llIIllIIIllI[1];
                    "".length();
                    return (-(51 ^ 54)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIllIIIllI[0];
            }))) {
                i = llIIllIIIllI[1];
                "".length();
                if ((-" ".length()) >= ((((5 + 138) - 125) + 138) ^ (((47 + 150) - 126) + 81))) {
                    return;
                }
            } else {
                i = llIIllIIIllI[0];
            }
            int i2 = i;
            int itemPrice = Prices.getItemPrice(itemStack.getId()) * itemStack.getQuantity();
            if (llllllIIIIllII(i2) && llllllIIIIllII(ak.contains(Integer.valueOf(itemStack.getId())) ? 1 : 0) && llllllIIIlIIII(itemPrice, this.am.lootValue())) {
                "".length();
                if ((-"  ".length()) >= 0) {
                    return;
                }
            } else {
                this.al.add(itemStack);
                "".length();
                "".length();
                if ((-(141 ^ 137)) >= 0) {
                    return;
                }
            }
        }
    }

    private static void llllllIIIIlIIl() {
        llIIllIIIllI = new int[19];
        llIIllIIIllI[0] = ((32 ^ 73) ^ (16 ^ 46)) & (((((110 + 202) - 177) + 98) ^ (((30 + 10) - (-92)) + 58)) ^ (-" ".length()));
        llIIllIIIllI[1] = " ".length();
        llIIllIIIllI[2] = (-27739) & 28123;
        llIIllIIIllI[3] = "  ".length();
        llIIllIIIllI[4] = (-8193) & 12779;
        llIIllIIIllI[5] = (-12869) & 15231;
        llIIllIIIllI[6] = (-10673) & 11765;
        llIIllIIIllI[7] = (-29441) & 30519;
        llIIllIIIllI[8] = (-((-1873) & 10066)) & (-4933) & 32735;
        llIIllIIIllI[9] = (-(255 ^ 154)) & (-13060) & 32751;
        llIIllIIIllI[10] = 133 ^ 131;
        llIIllIIIllI[11] = (-((-2129) & 10361)) & (-4933) & 32765;
        llIIllIIIllI[12] = (-((-11489) & 16361)) & (-3) & 24463;
        llIIllIIIllI[13] = (-((-18451) & 23391)) & (-8242) & 32767;
        llIIllIIIllI[14] = "   ".length();
        llIIllIIIllI[15] = (-28835) & 29947;
        llIIllIIIllI[16] = 171 ^ 175;
        llIIllIIIllI[17] = (-((-4097) & 4485)) & (-515) & 20431;
        llIIllIIIllI[18] = 51 ^ 54;
    }

    private static boolean llllllIIIIlIlI(int i) {
        return i != 0;
    }

    static {
        llllllIIIIlIIl();
        llllllIIIIlIII();
        Integer valueOf = Integer.valueOf(llIIllIIIllI[4]);
        Integer valueOf2 = Integer.valueOf(llIIllIIIllI[5]);
        Integer valueOf3 = Integer.valueOf(llIIllIIIllI[6]);
        Integer valueOf4 = Integer.valueOf(llIIllIIIllI[7]);
        Integer valueOf5 = Integer.valueOf(llIIllIIIllI[8]);
        Integer valueOf6 = Integer.valueOf(llIIllIIIllI[9]);
        Integer[] numArr = new Integer[llIIllIIIllI[10]];
        numArr[llIIllIIIllI[0]] = Integer.valueOf(llIIllIIIllI[11]);
        numArr[llIIllIIIllI[1]] = Integer.valueOf(llIIllIIIllI[12]);
        numArr[llIIllIIIllI[3]] = Integer.valueOf(llIIllIIIllI[13]);
        numArr[llIIllIIIllI[14]] = Integer.valueOf(llIIllIIIllI[15]);
        numArr[llIIllIIIllI[16]] = Integer.valueOf(llIIllIIIllI[17]);
        numArr[llIIllIIIllI[18]] = Integer.valueOf(llIIllIIIllI[2]);
        ak = ImmutableSet.of(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, numArr);
    }

    @Inject
    public y(SquireGorillaConfig squireGorillaConfig, o oVar) {
        this.am = squireGorillaConfig;
        this.an = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    public boolean run() {
        if (llllllIIIIlIlI(this.al.isEmpty() ? 1 : 0)) {
            return llIIllIIIllI[0];
        }
        ItemStack next = this.al.iterator().next();
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (llllllIIIIlIlI(tileItem.canPickup() ? 1 : 0) && llllllIIIlIIIl(tileItem.getId(), next.getId())) {
                ?? r0 = llIIllIIIllI[1];
                "".length();
                return (-" ".length()) >= "   ".length() ? ((((112 + 92) - 172) + 103) ^ (((78 + 52) - 16) + 26)) & (((86 ^ 22) ^ (72 ^ 3)) ^ (-" ".length())) : r0;
            }
            return llIIllIIIllI[0];
        });
        if (llllllIIIIlIll(nearest)) {
            this.al.remove(next);
            "".length();
            return llIIllIIIllI[0];
        }
        if (llllllIIIIlIlI(Inventory.isFull() ? 1 : 0)) {
            int[] iArr = new int[llIIllIIIllI[1]];
            iArr[llIIllIIIllI[0]] = nearest.getId();
            if (!llllllIIIIlIlI(Inventory.contains(iArr) ? 1 : 0) || llllllIIIIllII(nearest.isStackable() ? 1 : 0)) {
                Item first = Inventory.getFirst(item -> {
                    String[] strArr = new String[llIIllIIIllI[1]];
                    strArr[llIIllIIIllI[0]] = llIIllIIIlIl[llIIllIIIllI[3]];
                    return item.hasAction(strArr);
                });
                if (llllllIIIIllIl(first) && llllllIIIIlllI(next.getId(), llIIllIIIllI[2])) {
                    first.interact(llIIllIIIlIl[llIIllIIIllI[0]]);
                    return llIIllIIIllI[1];
                }
                return llIIllIIIllI[0];
            }
        }
        nearest.interact(llIIllIIIlIl[llIIllIIIllI[1]]);
        this.ao = nearest;
        this.ap = next;
        this.an.sleep(llIIllIIIllI[3]);
        return llIIllIIIllI[1];
    }

    private static boolean llllllIIIIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllllIIIIllIl(Object obj) {
        return obj != null;
    }

    private static boolean llllllIIIIlIll(Object obj) {
        return obj == null;
    }

    private static String llllllIIIIIlll(String lllllllllllllllIlIIlllIIIllIIllI, String lllllllllllllllIlIIlllIIIllIIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIIIllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllIIIllIIlII = new StringBuilder();
        char[] lllllllllllllllIlIIlllIIIllIIIll = lllllllllllllllIlIIlllIIIllIIlIl.toCharArray();
        int lllllllllllllllIlIIlllIIIllIIIlI = llIIllIIIllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIllIIIllI[0];
        while (llllllIIIlIIII(i, length)) {
            char lllllllllllllllIlIIlllIIIllIIlll = charArray[i];
            lllllllllllllllIlIIlllIIIllIIlII.append((char) (lllllllllllllllIlIIlllIIIllIIlll ^ lllllllllllllllIlIIlllIIIllIIIll[lllllllllllllllIlIIlllIIIllIIIlI % lllllllllllllllIlIIlllIIIllIIIll.length]));
            "".length();
            lllllllllllllllIlIIlllIIIllIIIlI++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlllIIIllIIlII);
    }

    private static void llllllIIIIlIII() {
        llIIllIIIlIl = new String[llIIllIIIllI[14]];
        llIIllIIIlIl[llIIllIIIllI[0]] = llllllIIIIIllI("9RG9Y/AL+/U=", "bHOxC");
        llIIllIIIlIl[llIIllIIIllI[1]] = llllllIIIIIllI("xOK9lJZJRI0=", "hMbRJ");
        llIIllIIIlIl[llIIllIIIllI[3]] = llllllIIIIIlll("AhYS", "Gwfas");
    }

    private static String llllllIIIIIllI(String lllllllllllllllIlIIlllIIIlIlIIIl, String lllllllllllllllIlIIlllIIIlIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIIIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIIIllI[3], lllllllllllllllIlIIlllIIIlIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllIIIlIlIIlI) {
            lllllllllllllllIlIIlllIIIlIlIIlI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        if (llllllIIIIllIl(this.ao) && llllllIIIIllll(itemDespawned.getItem(), this.ao)) {
            this.al.remove(this.ap);
            "".length();
            this.ao = null;
            this.ap = null;
        }
    }

    public List<ItemStack> P() {
        return this.al;
    }

    private static boolean llllllIIIlIIII(int i, int i2) {
        return i < i2;
    }
}
