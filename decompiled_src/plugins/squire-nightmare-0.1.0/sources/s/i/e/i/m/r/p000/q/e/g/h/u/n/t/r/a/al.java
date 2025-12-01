package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.al  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/al.class */
public abstract class al extends C {
    private static final /* synthetic */ Logger eb;
    private static /* synthetic */ int[] llllIIllIlIl;
    protected final /* synthetic */ C0009f ec;

    public abstract EquipmentSetup cq();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C
    public boolean bY() {
        return lIIIlllllllIIll(this.cK.assistantMode() ? 1 : 0) ? llllIIllIlIl[0] : cr();
    }

    public boolean x(NPC npc) {
        return this.ec.a(npc, cq());
    }

    private static void lIIIlllllllIIlI() {
        llllIIllIlIl = new int[2];
        llllIIllIlIl[0] = ((111 ^ 56) ^ (67 ^ 47)) & (((3 ^ 41) ^ (24 ^ 9)) ^ (-" ".length()));
        llllIIllIlIl[1] = " ".length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean cw() {
        TileObject aV = C0013j.aV();
        RectangularArea ay = C0008e.ay();
        Player local = Players.getLocal();
        if (lIIIlllllllIlll(aV) && lIIIlllllllIlll(ay) && lIIIlllllllIlIl(ay.contains(local.getWorldLocation()) ? 1 : 0)) {
            ?? r0 = llllIIllIlIl[1];
            "".length();
            return ((106 ^ 100) ^ (51 ^ 57)) < "   ".length() ? ((28 ^ 64) ^ (17 ^ 87)) & (((((142 + 78) - 131) + 88) ^ (((61 + 80) - (-23)) + 7)) ^ (-" ".length())) : r0;
        }
        return llllIIllIlIl[0];
    }

    private static boolean lIIIlllllllIlIl(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean cx() {
        List<WorldArea> ax = C0008e.ax();
        if (lIIIlllllllIlIl(ax.isEmpty() ? 1 : 0)) {
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            return ax.stream().anyMatch(worldArea -> {
                return worldArea.contains(worldLocation);
            });
        }
        return llllIIllIlIl[0];
    }

    protected boolean cy() {
        return this.cS.getWorldArea().contains(Players.getLocal().getWorldLocation());
    }

    private static boolean lIIIlllllllIlII(int i, int i2) {
        return i != i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public al(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0009f c0009f) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin);
        this.ec = c0009f;
    }

    private static boolean lIIIlllllllIIll(int i) {
        return i != 0;
    }

    static {
        lIIIlllllllIIlI();
        eb = LoggerFactory.getLogger(al.class);
    }

    protected boolean cv() {
        return this.cM.Y().contains(Players.getLocal().getWorldLocation());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    protected boolean cz() {
        if (lIIIlllllllIIll(Players.getLocal().isMoving() ? 1 : 0) && lIIIlllllllIlll(Movement.getDestination())) {
            ?? r0 = llllIIllIlIl[1];
            "".length();
            return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIIllIlIl[0];
    }

    private static boolean lIIIlllllllIlll(Object obj) {
        return obj != null;
    }

    public abstract boolean cr();

    private static boolean lIIIlllllllIllI(int i) {
        return i > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean cu() {
        if ((lIIIlllllllIlII(this.cM.ap(), llllIIllIlIl[1]) && lIIIlllllllIlIl(cz() ? 1 : 0) && !lIIIlllllllIIll(cv() ? 1 : 0)) || (lIIIlllllllIllI(this.cM.ap()) && lIIIlllllllIIll(cy() ? 1 : 0))) {
            ?? r0 = llllIIllIlIl[1];
            "".length();
            return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIIllIlIl[0];
    }
}
