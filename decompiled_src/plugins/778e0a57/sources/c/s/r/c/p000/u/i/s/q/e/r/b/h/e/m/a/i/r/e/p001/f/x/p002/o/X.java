package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import com.openosrs.client.game.NPCManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import net.runelite.api.coords.WorldArea;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.http.api.item.ItemStats;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Test Task", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.X  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/X.class */
public class X extends Task {
    private static /* synthetic */ String[] lIlIIIIIIIll;
    private final /* synthetic */ SquireChambersPlugin ct;
    private static /* synthetic */ int[] lIlIIIIIIlII;
    private final /* synthetic */ NPCManager cv;
    private final /* synthetic */ SquireChambersConfig cu;

    private static boolean llIlIIllllIIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIlIIllllIIll(int i) {
        return i == 0;
    }

    private static boolean llIlIIllllIIIl(int i, int i2) {
        return i < i2;
    }

    private static String llIlIIlllIlllI(String lllllllllllllllIlllIIlIlIlIIIlll, String lllllllllllllllIlllIIlIlIlIIIllI) {
        String lllllllllllllllIlllIIlIlIlIIIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlIlIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIlIlIlIIIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIlIlIlIIIllI.toCharArray();
        int lllllllllllllllIlllIIlIlIlIIIIll = lIlIIIIIIlII[0];
        char[] charArray2 = lllllllllllllllIlllIIlIlIlIIIlll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIIIIlII[0];
        while (llIlIIllllIIIl(i, length)) {
            char lllllllllllllllIlllIIlIlIlIIlIII = charArray2[i];
            lllllllllllllllIlllIIlIlIlIIIlIl.append((char) (lllllllllllllllIlllIIlIlIlIIlIII ^ charArray[lllllllllllllllIlllIIlIlIlIIIIll % charArray.length]));
            "".length();
            lllllllllllllllIlllIIlIlIlIIIIll++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIIlIlIlIIIlIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    public int[] aT() {
        ItemManager itemManager = Static.getItemManager();
        int[] iArr = new int[lIlIIIIIIlII[1]];
        int[] a = a(Inventory.getAll().stream().mapToInt(item -> {
            return item.getId();
        }).toArray(), Equipment.getAll().stream().mapToInt(item2 -> {
            return item2.getId();
        }).toArray());
        int length = a.length;
        int lllllllllllllllIlllIIlIlIlllIIII = lIlIIIIIIlII[0];
        while (llIlIIllllIIIl(lllllllllllllllIlllIIlIlIlllIIII, length)) {
            int i = a[lllllllllllllllIlllIIlIlIlllIIII];
            ItemStats itemStats = itemManager.getItemStats(i, (boolean) lIlIIIIIIlII[0]);
            if (llIlIIllllIIlI(itemStats)) {
                if (llIlIIllllIIll(itemStats.isEquipable() ? 1 : 0)) {
                    "".length();
                    if ((((13 ^ 48) ^ (14 ^ 123)) & (((((87 + 103) - 46) + 56) ^ (((72 + 106) - 56) + 6)) ^ (-" ".length()))) != 0) {
                        return null;
                    }
                } else {
                    int slot = itemStats.getEquipment().getSlot();
                    if (llIlIIllllIIll(iArr[slot])) {
                        iArr[slot] = i;
                        "".length();
                        if ((-" ".length()) > "   ".length()) {
                            return null;
                        }
                    } else {
                        ItemStats itemStats2 = itemManager.getItemStats(iArr[slot], (boolean) lIlIIIIIIlII[0]);
                        if (llIlIIllllIIIl(itemStats2.getEquipment().getMdmg(), itemStats.getEquipment().getMdmg())) {
                            iArr[slot] = i;
                            "".length();
                            if ((-"  ".length()) > 0) {
                                return null;
                            }
                        } else if (llIlIIllllIIIl(itemStats2.getEquipment().getAmagic(), itemStats.getEquipment().getAmagic())) {
                            iArr[slot] = i;
                        }
                    }
                }
            }
            lllllllllllllllIlllIIlIlIlllIIII++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return iArr;
    }

    protected int cq() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIlIIIIIIIll[lIlIIIIIIlII[0]]);
        });
    }

    @Inject
    public X(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, NPCManager nPCManager) {
        this.ct = squireChambersPlugin;
        this.cu = squireChambersConfig;
        this.cv = nPCManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    public int[] aS() {
        ItemManager itemManager = Static.getItemManager();
        int[] iArr = new int[lIlIIIIIIlII[1]];
        int[] a = a(Inventory.getAll().stream().mapToInt(item -> {
            return item.getId();
        }).toArray(), Equipment.getAll().stream().mapToInt(item2 -> {
            return item2.getId();
        }).toArray());
        int length = a.length;
        int i = lIlIIIIIIlII[0];
        while (llIlIIllllIIIl(i, length)) {
            int lllllllllllllllIlllIIlIllIIIlIIl = a[i];
            ItemStats itemStats = itemManager.getItemStats(lllllllllllllllIlllIIlIllIIIlIIl, (boolean) lIlIIIIIIlII[0]);
            if (llIlIIllllIIlI(itemStats)) {
                if (llIlIIllllIIll(itemStats.isEquipable() ? 1 : 0)) {
                    "".length();
                    if ((-" ".length()) >= 0) {
                        return null;
                    }
                } else {
                    int slot = itemStats.getEquipment().getSlot();
                    if (llIlIIllllIIll(iArr[slot])) {
                        iArr[slot] = lllllllllllllllIlllIIlIllIIIlIIl;
                        "".length();
                        if ((25 ^ 28) <= 0) {
                            return null;
                        }
                    } else {
                        ItemStats itemStats2 = itemManager.getItemStats(iArr[slot], (boolean) lIlIIIIIIlII[0]);
                        if (llIlIIllllIIIl(itemStats2.getEquipment().getRstr(), itemStats.getEquipment().getRstr())) {
                            iArr[slot] = lllllllllllllllIlllIIlIllIIIlIIl;
                            "".length();
                            if ((-((210 ^ 188) ^ (200 ^ 162))) > 0) {
                                return null;
                            }
                        } else if (llIlIIllllIIIl(itemStats2.getEquipment().getArange(), itemStats.getEquipment().getArange())) {
                            iArr[slot] = lllllllllllllllIlllIIlIllIIIlIIl;
                        }
                    }
                }
            }
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return iArr;
    }

    public int[] aV() {
        aS();
        return new int[lIlIIIIIIlII[0]];
    }

    protected BankLoadout q() {
        return (BankLoadout) this.cu.bankLoadout().selected(BankLoadout.class);
    }

    private List<Integer> a(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = lIlIIIIIIlII[0];
        while (llIlIIllllIIIl(i, length)) {
            arrayList.add(Integer.valueOf(iArr[i]));
            "".length();
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean run() {
        return lIlIIIIIIlII[0];
    }

    private String a(WorldArea worldArea) {
        return "(" + worldArea.getX() + "," + worldArea.getY() + "," + worldArea.getPlane() + " | width/height: " + worldArea.getWidth() + "/" + worldArea.getHeight() + ")";
    }

    private static void llIlIIllllIIII() {
        lIlIIIIIIlII = new int[4];
        lIlIIIIIIlII[0] = ((18 ^ 26) ^ ((86 ^ 73) & ((120 ^ 103) ^ (-1)))) & (((224 ^ 142) ^ (40 ^ 78)) ^ (-" ".length()));
        lIlIIIIIIlII[1] = 41 ^ 39;
        lIlIIIIIIlII[2] = " ".length();
        lIlIIIIIIlII[3] = "  ".length();
    }

    protected int cp() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIlIIIIIIIll[lIlIIIIIIlII[2]]);
        });
    }

    private static void llIlIIlllIllll() {
        lIlIIIIIIIll = new String[lIlIIIIIIlII[3]];
        lIlIIIIIIIll[lIlIIIIIIlII[0]] = llIlIIlllIlllI("GCYuHwArLzEFFT4qNxg=", "JCXvt");
        lIlIIIIIIIll[lIlIIIIIIlII[2]] = llIlIIlllIlllI("DDwUEwBzKkYbCjA=", "TYfzc");
    }

    public int[] a(int[] iArr, int[] iArr2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(a(iArr));
        "".length();
        hashSet.addAll(a(iArr2));
        "".length();
        return hashSet.stream().mapToInt((v0) -> {
            return v0.intValue();
        }).toArray();
    }

    static {
        llIlIIllllIIII();
        llIlIIlllIllll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    public int[] aU() {
        ItemManager itemManager = Static.getItemManager();
        int[] iArr = new int[lIlIIIIIIlII[1]];
        int[] a = a(Inventory.getAll().stream().mapToInt(item -> {
            return item.getId();
        }).toArray(), Equipment.getAll().stream().mapToInt(item2 -> {
            return item2.getId();
        }).toArray());
        int length = a.length;
        int i = lIlIIIIIIlII[0];
        while (llIlIIllllIIIl(i, length)) {
            int i2 = a[i];
            ItemStats itemStats = itemManager.getItemStats(i2, (boolean) lIlIIIIIIlII[0]);
            if (llIlIIllllIIlI(itemStats)) {
                if (llIlIIllllIIll(itemStats.isEquipable() ? 1 : 0)) {
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                } else {
                    int slot = itemStats.getEquipment().getSlot();
                    if (llIlIIllllIIll(iArr[slot])) {
                        iArr[slot] = i2;
                        "".length();
                        if (" ".length() <= (((141 ^ 176) ^ (38 ^ 20)) & (((25 ^ 50) ^ (17 ^ 53)) ^ (-" ".length())))) {
                            return null;
                        }
                    } else {
                        ItemStats itemStats2 = itemManager.getItemStats(iArr[slot], (boolean) lIlIIIIIIlII[0]);
                        if (llIlIIllllIIIl(itemStats2.getEquipment().getRstr(), itemStats.getEquipment().getRstr())) {
                            iArr[slot] = i2;
                            "".length();
                            if (" ".length() > "   ".length()) {
                                return null;
                            }
                        } else if (llIlIIllllIIIl(itemStats2.getEquipment().getArange(), itemStats.getEquipment().getArange())) {
                            iArr[slot] = i2;
                        }
                    }
                }
            }
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return iArr;
    }
}
