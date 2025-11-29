/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.b;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.d;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Banking", priority=0x7FFFFFFF, blocking=true)
public class s
extends Task {
    private static /* synthetic */ String[] lIIllIlIlIlll;
    private final /* synthetic */ b ab;
    private final /* synthetic */ TempleTrekkingPlugin Z;
    private /* synthetic */ List<Integer> ac;
    private /* synthetic */ Player G;
    private final /* synthetic */ TempleTrekkingConfig aa;
    private static /* synthetic */ int[] lIIllIlIllIII;

    static {
        s.lIllIIIIlllIIII();
        s.lIllIIIIllIllll();
    }

    @Inject
    public s(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b b2) {
        this.ac = d.XP_TOME.w();
        this.aa = templeTrekkingConfig;
        this.ab = b2;
        this.Z = templeTrekkingPlugin;
    }

    private static boolean lIllIIIIlllIIlI(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIIllIlllI(String llllllllllllllIlllIllllIIIlIlIII, String llllllllllllllIlllIllllIIIlIIlll) {
        llllllllllllllIlllIllllIIIlIlIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllIIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllllIIIlIIllI = new StringBuilder();
        char[] llllllllllllllIlllIllllIIIlIIlIl = llllllllllllllIlllIllllIIIlIIlll.toCharArray();
        int llllllllllllllIlllIllllIIIlIIlII = lIIllIlIllIII[0];
        char[] llllllllllllllIlllIllllIIIIllllI = llllllllllllllIlllIllllIIIlIlIII.toCharArray();
        int llllllllllllllIlllIllllIIIIlllIl = llllllllllllllIlllIllllIIIIllllI.length;
        int llllllllllllllIlllIllllIIIIlllII = lIIllIlIllIII[0];
        while (s.lIllIIIIlllIIll(llllllllllllllIlllIllllIIIIlllII, llllllllllllllIlllIllllIIIIlllIl)) {
            char llllllllllllllIlllIllllIIIlIlIIl = llllllllllllllIlllIllllIIIIllllI[llllllllllllllIlllIllllIIIIlllII];
            llllllllllllllIlllIllllIIIlIIllI.append((char)(llllllllllllllIlllIllllIIIlIlIIl ^ llllllllllllllIlllIllllIIIlIIlIl[llllllllllllllIlllIllllIIIlIIlII % llllllllllllllIlllIllllIIIlIIlIl.length]));
            "".length();
            ++llllllllllllllIlllIllllIIIlIIlII;
            ++llllllllllllllIlllIllllIIIIlllII;
            "".length();
            if ("   ".length() != -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllllIIIlIIllI);
    }

    private static void lIllIIIIlllIIII() {
        lIIllIlIllIII = new int[3];
        s.lIIllIlIllIII[0] = (0x13 ^ 0x44 ^ (0xC1 ^ 0xC6)) & (0x64 ^ 0x58 ^ (0xD8 ^ 0xB4) ^ -" ".length());
        s.lIIllIlIllIII[1] = " ".length();
        s.lIIllIlIllIII[2] = 0x88 ^ 0xC6 ^ (0x72 ^ 0x20);
    }

    public boolean run() {
        s llllllllllllllIlllIllllIIIllIlIl;
        if (s.lIllIIIIlllIIIl(this.aa.claimBankTomes() ? 1 : 0)) {
            return lIIllIlIllIII[0];
        }
        List llllllllllllllIlllIllllIIIllIlII = Inventory.getAll(item -> this.ac.contains(item.getId()));
        if (s.lIllIIIIlllIIlI(llllllllllllllIlllIllllIIIllIlII.isEmpty() ? 1 : 0)) {
            if (s.lIllIIIIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.open();
                "".length();
                return lIIllIlIllIII[1];
            }
            Bank.withdraw(item -> this.ac.contains(item.getId()), (int)lIIllIlIllIII[2], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return lIIllIlIllIII[1];
        }
        int llllllllllllllIlllIllllIIIllIIll = lIIllIlIllIII[0];
        while (s.lIllIIIIlllIIll(llllllllllllllIlllIllllIIIllIIll, Math.min(llllllllllllllIlllIllllIIIllIlIl.aa.perTick(), llllllllllllllIlllIllllIIIllIlII.size()))) {
            ((Item)llllllllllllllIlllIllllIIIllIlII.get(llllllllllllllIlllIllllIIIllIIll)).interact(lIIllIlIlIlll[lIIllIlIllIII[0]]);
            ++llllllllllllllIlllIllllIIIllIIll;
            "".length();
            if (-(0xDD ^ 0xA7 ^ 59 + 31 - 88 + 125) < 0) continue;
            return ((0x6A ^ 0x43 ^ (0xB ^ 0x71)) & (0x3F ^ 0x5F ^ (0x7B ^ 0x48) ^ -" ".length())) != 0;
        }
        return lIIllIlIllIII[1];
    }

    private static boolean lIllIIIIlllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIIIllIllll() {
        lIIllIlIlIlll = new String[lIIllIlIllIII[1]];
        s.lIIllIlIlIlll[s.lIIllIlIllIII[0]] = s.lIllIIIIllIlllI("Ji02Pg==", "tHWZp");
    }
}

