package r.g.q.p000.s.r.s.u.i.e.r.r.n.c.s.p001.e.s.e.o.e.d.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Banking")
/* renamed from: r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.b  reason: invalid package */
/* loaded from: 36afa564-21f3-409d-8955-c6e80fe75d70.jar:r/g/q/-/s/r/s/u/i/e/r/r/n/c/s/-/e/s/e/o/e/d/a/b.class */
public class b extends Task {
    private static /* synthetic */ int[] lIIllIIlIIllI;
    private static /* synthetic */ String[] lIIllIIlIIIIl;
    private final /* synthetic */ SquireSorceressGardenConfig s;

    static {
        lIlIlllllIlIIll();
        lIlIllllIllllll();
    }

    private static void lIlIlllllIlIIll() {
        lIIllIIlIIllI = new int[3];
        lIIllIIlIIllI[0] = (84 ^ 73) & ((176 ^ 173) ^ (-1));
        lIIllIIlIIllI[1] = " ".length();
        lIIllIIlIIllI[2] = "  ".length();
    }

    private static boolean lIlIlllllIlIlIl(int i) {
        return i == 0;
    }

    private static boolean lIlIlllllIlIllI(int i) {
        return i != 0;
    }

    private static String lIlIllllIllllII(String llllllllllllllIllllIIIIllllllIIl, String llllllllllllllIllllIIIIllllllIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIllllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIIlllllIlll = new StringBuilder();
        char[] llllllllllllllIllllIIIIlllllIllI = llllllllllllllIllllIIIIllllllIII.toCharArray();
        int llllllllllllllIllllIIIIlllllIlIl = lIIllIIlIIllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int llllllllllllllIllllIIIIllllIllIl = lIIllIIlIIllI[0];
        while (lIlIlllllIlIlll(llllllllllllllIllllIIIIllllIllIl, length)) {
            char llllllllllllllIllllIIIIllllllIlI = charArray[llllllllllllllIllllIIIIllllIllIl];
            llllllllllllllIllllIIIIlllllIlll.append((char) (llllllllllllllIllllIIIIllllllIlI ^ llllllllllllllIllllIIIIlllllIllI[llllllllllllllIllllIIIIlllllIlIl % llllllllllllllIllllIIIIlllllIllI.length]));
            "".length();
            llllllllllllllIllllIIIIlllllIlIl++;
            llllllllllllllIllllIIIIllllIllIl++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIIIIlllllIlll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean run() {
        if (!lIlIlllllIlIlII(this.s.botActivity(), a.MINIGAME) && !lIlIlllllIlIlIl(o() ? 1 : 0)) {
            return lIlIlllllIlIllI(Bank.isOpen() ? 1 : 0) ? p() : r();
        }
        return lIIllIIlIIllI[0];
    }

    @Inject
    public b(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.s = squireSorceressGardenConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean r() {
        if (lIlIlllllIlIllI(BankLocation.AL_KHARID_BANK.getArea().contains(Players.getLocal()) ? 1 : 0)) {
            Bank.open();
            "".length();
            return lIIllIIlIIllI[1];
        }
        Movement.walkTo(BankLocation.AL_KHARID_BANK.getArea());
        "".length();
        return lIIllIIlIIllI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean q() {
        if (lIlIlllllIlIllI(Inventory.contains(item -> {
            return item.getName().toLowerCase().contains(lIIllIIlIIIIl[lIIllIIlIIllI[1]]);
        }) ? 1 : 0)) {
            Bank.close();
            return lIIllIIlIIllI[1];
        }
        Bank.withdraw(item2 -> {
            return item2.getName().toLowerCase().contains(lIIllIIlIIIIl[lIIllIIlIIllI[0]]);
        }, this.s.stamAmount(), Bank.WithdrawMode.ITEM);
        return lIIllIIlIIllI[1];
    }

    private static boolean lIlIlllllIlIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean p() {
        if (lIlIlllllIlIllI(Inventory.isFull() ? 1 : 0)) {
            Bank.depositInventory();
            return lIIllIIlIIllI[1];
        } else if (lIlIlllllIlIllI(this.s.useStaminas() ? 1 : 0)) {
            return q();
        } else {
            Bank.close();
            return lIIllIIlIIllI[1];
        }
    }

    private static boolean lIlIlllllIlIlll(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllllIllllll() {
        lIIllIIlIIIIl = new String[lIIllIIlIIllI[2]];
        lIIllIIlIIIIl[lIIllIIlIIllI[0]] = lIlIllllIllllII("BRU7FSYYAA==", "vaZxO");
        lIIllIIlIIIIl[lIIllIIlIIllI[1]] = lIlIllllIllllII("FywgGwgKOQ==", "dXAva");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean o() {
        if (!lIlIlllllIlIlIl(Inventory.isFull() ? 1 : 0) || lIlIlllllIlIllI(Bank.isOpen() ? 1 : 0)) {
            ?? r0 = lIIllIIlIIllI[1];
            "".length();
            return ((68 ^ 39) & ((18 ^ 113) ^ (-1))) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllIIlIIllI[0];
    }
}
