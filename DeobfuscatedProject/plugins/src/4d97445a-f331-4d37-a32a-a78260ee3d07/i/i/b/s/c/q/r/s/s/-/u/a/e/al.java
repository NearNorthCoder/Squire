/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.input.Keyboard
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.debug.typer.SquireTyperConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.input.Keyboard;

@TaskDesc(name="Typing")
public class al
extends Task {
    private static /* synthetic */ int[] llllIIlll;
    @Inject
    private /* synthetic */ SquireTyperConfig cR;

    private static boolean llIIllllllI(int n2) {
        return n2 != 0;
    }

    static {
        al.llIIlllllIl();
    }

    public boolean run() {
        if (al.llIIllllllI(this.cR.msg().isEmpty() ? 1 : 0)) {
            return llllIIlll[0];
        }
        Keyboard.type((String)this.cR.msg(), (boolean)llllIIlll[1]);
        int n2 = this.cR.tickDelay();
        int n3 = (int)((double)n2 * 0.1);
        this.sleep(Rand.nextInt((int)(this.cR.tickDelay() - n3), (int)(this.cR.tickDelay() + n3)));
        return llllIIlll[1];
    }

    private static void llIIlllllIl() {
        llllIIlll = new int[2];
        al.llllIIlll[0] = (8 ^ 0x28 ^ (0xC5 ^ 0xBD)) & (0x27 ^ 0x7B ^ (0x99 ^ 0x9D) ^ -" ".length());
        al.llllIIlll[1] = " ".length();
    }
}

