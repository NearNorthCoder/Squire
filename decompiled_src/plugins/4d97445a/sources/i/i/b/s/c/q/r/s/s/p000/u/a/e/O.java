package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.combat.Lure.SquireLurer;
import java.util.function.Supplier;
import net.runelite.client.util.HotkeyListener;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.O  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/O.class */
public class O extends HotkeyListener {
    final /* synthetic */ SquireLurer bZ;

    public void hotkeyPressed() {
        this.bZ.bW.aH();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(SquireLurer squireLurer, Supplier supplier) {
        super(supplier);
        this.bZ = squireLurer;
    }
}
