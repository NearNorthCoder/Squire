package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Banking before doing a run", priority = 10000, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aC  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aC.class */
public class aC extends Task {
    private static /* synthetic */ String[] llIIIIllIIII;
    private /* synthetic */ BankLocation cg;
    private /* synthetic */ int ch;
    private static /* synthetic */ int[] llIIIIllIIIl;
    private final /* synthetic */ Client cf;
    private final /* synthetic */ SquireFarmer cd;
    private /* synthetic */ CompletableFuture<Boolean> ci;
    private final /* synthetic */ SquireFarmerConfig ce;

    private static String llllIIlIllIlll(String lllllllllllllllIlIlIlIlIlIlIlIII, String lllllllllllllllIlIlIlIlIlIlIllII) {
        String lllllllllllllllIlIlIlIlIlIlIlIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlIlIlIlIlIll = new StringBuilder();
        char[] lllllllllllllllIlIlIlIlIlIlIlIlI = lllllllllllllllIlIlIlIlIlIlIllII.toCharArray();
        int lllllllllllllllIlIlIlIlIlIlIlIIl = llIIIIllIIIl[0];
        char[] charArray = lllllllllllllllIlIlIlIlIlIlIlIII2.toCharArray();
        int length = charArray.length;
        int i = llIIIIllIIIl[0];
        while (llllIIlIllllll(i, length)) {
            lllllllllllllllIlIlIlIlIlIlIlIll.append((char) (charArray[i] ^ lllllllllllllllIlIlIlIlIlIlIlIlI[lllllllllllllllIlIlIlIlIlIlIlIIl % lllllllllllllllIlIlIlIlIlIlIlIlI.length]));
            "".length();
            lllllllllllllllIlIlIlIlIlIlIlIIl++;
            i++;
            "".length();
            if ("  ".length() > (65 ^ 69)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIlIlIlIlIlIll);
    }

    private static boolean llllIIllIIIIII(int i, int i2) {
        return i == i2;
    }

    private static boolean llllIIlIllllIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    protected boolean bs() {
        InventorySetup inventorySetup = ((BankLoadout) this.ce.bankLoadout().selected(BankLoadout.class)).getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] ids = inventorySetup.getIds();
        int length = ids.length;
        int i = llIIIIllIIIl[0];
        while (llllIIlIllllll(i, length)) {
            int i2 = ids[i];
            hashMap.put(Integer.valueOf(i2), Integer.valueOf(((Integer) hashMap.getOrDefault(Integer.valueOf(i2), Integer.valueOf(llIIIIllIIIl[0]))).intValue() + llIIIIllIIIl[1]));
            "".length();
            i++;
            "".length();
            if ("  ".length() < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        for (Integer num : hashMap.keySet()) {
            int intValue = num.intValue();
            if (llllIIllIIIIII(intValue, llIIIIllIIIl[3])) {
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                int intValue2 = ((Integer) hashMap.get(Integer.valueOf(intValue))).intValue();
                int[] iArr = new int[llIIIIllIIIl[1]];
                iArr[llIIIIllIIIl[0]] = intValue;
                if (llllIIlIllllll(Inventory.getCount(iArr), intValue2)) {
                    return llIIIIllIIIl[1];
                }
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return llIIIIllIIIl[0];
    }

    private static boolean llllIIlIlllIlI(int i) {
        return i == 0;
    }

    private static void llllIIlIlllIIl() {
        llIIIIllIIIl = new int[4];
        llIIIIllIIIl[0] = ((((88 + 36) - 11) + 20) ^ (((176 + 44) - 62) + 36)) & (((164 ^ 170) ^ (63 ^ 118)) ^ (-" ".length()));
        llIIIIllIIIl[1] = " ".length();
        llIIIIllIIIl[2] = (98 ^ 87) ^ (207 ^ 198);
        llIIIIllIIIl[3] = -" ".length();
    }

    @Inject
    public aC(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, Client client) {
        this.cd = squireFarmer;
        this.ce = squireFarmerConfig;
        this.cf = client;
    }

    private static void llllIIlIlllIII() {
        llIIIIllIIII = new String[llIIIIllIIIl[1]];
        llIIIIllIIII[llIIIIllIIIl[0]] = llllIIlIllIlll("Pz48Eg==", "qQRwS");
    }

    private static boolean llllIIlIllllII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public boolean run() {
        if (llllIIlIlllIlI(this.cd.d() ? 1 : 0)) {
            return llIIIIllIIIl[0];
        }
        String selected = this.ce.bankLoadout().getSelected();
        if (!llllIIlIlllIll(selected) || llllIIlIllllII(selected.equals(llIIIIllIIII[llIIIIllIIIl[0]]) ? 1 : 0)) {
            return llIIIIllIIIl[0];
        }
        BankLoadout bankLoadout = (BankLoadout) this.ce.bankLoadout().selected(BankLoadout.class);
        if (llllIIlIlllIlI(bs() ? 1 : 0)) {
            this.cd.a((boolean) llIIIIllIIIl[0]);
            return llIIIIllIIIl[0];
        } else if (llllIIlIlllIlI(Bank.isOpen() ? 1 : 0)) {
            if (llllIIlIlllIlI(Bank.open() ? 1 : 0)) {
                if (llllIIlIllllIl(this.cg)) {
                    this.cg = BankLocation.getNearestCommon();
                }
                Movement.walkTo(this.cg.getArea());
                "".length();
            }
            return llIIIIllIIIl[1];
        } else {
            if (llllIIlIlllllI(this.cf.getTickCount() - this.ch, llIIIIllIIIl[2])) {
                this.ci = null;
            }
            if (llllIIlIllllIl(this.ci)) {
                this.ci = BankLoadouts.withdraw(bankLoadout, (boolean) llIIIIllIIIl[1]);
                this.ch = this.cf.getTickCount();
            }
            if (llllIIlIllllII(this.ci.isDone() ? 1 : 0)) {
                this.ci.join().booleanValue();
                this.ci = null;
            }
            return llIIIIllIIIl[1];
        }
    }

    private static boolean llllIIlIlllllI(int i, int i2) {
        return i > i2;
    }

    static {
        llllIIlIlllIIl();
        llllIIlIlllIII();
    }

    private static boolean llllIIlIllllll(int i, int i2) {
        return i < i2;
    }

    private static boolean llllIIlIlllIll(Object obj) {
        return obj != null;
    }
}
