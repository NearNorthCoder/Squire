/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.runelite.api.Client
 */
package gg.squire.quest.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.j;

public abstract class QuestTaskBase
implements j {
    protected  boolean N;
    private  String P;
    
    private  j Q;
    
    private  String O;

    private static void lIlllIIlIIIIlII() {
        lIlIIlIIIlIll = new String[lIlIIlIIIllII[2]];
        e.lIlIIlIIIlIll[e.lIlIIlIIIllII[0]] = e.lIlllIIlIIIIIll("nW5nhmjOtag=", "bEyid");
        e.lIlIIlIIIlIll[e.lIlIIlIIIllII[1]] = "\n";
    }

    @Override
    public boolean j() {
        return this.N;
    }

    @Override
    public void d(String string) {
        this.P = string;
    }

    @Override
    public j n() {
        return this.Q;
    }

    @Override
    public void c(String string) {
        this.O = string;
    }

    @Override
    public abstract String k();

    @Override
    public abstract boolean a(Client var1);

    @Override
    public void a(j j2) {
        this.Q = j2;
    }

    private static boolean lIlllIIlIIIIllI(Object object) {
        return object != null;
    }

    private static boolean lIlllIIlIIIIlll(int n2) {
        return n2 != 0;
    }

    static {
        e.lIlllIIlIIIIlIl();
        e.lIlllIIlIIIIlII();
    }

    /*
     * WARNING - void declaration
     */
    public void QuestTaskBase(String string) {
        void var1;
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.l();
        if (e.lIlllIIlIIIIllI(string2)) {
            String string3;
            stringBuilder.append(string2);

            if (e.lIlllIIlIIIIlll(string2.isEmpty() ? 1 : 0)) {
                string3 = lIlIIlIIIlIll[lIlIIlIIIllII[0]];

                if (2 != 2) {
                    return;
                }
            } else {
                string3 = lIlIIlIIIlIll[lIlIIlIIIllII[1]];
            }
            stringBuilder.append(string3);

        }
        if (e.lIlllIIlIIIIllI(var1)) {
            void var2;
            var2.append((String)var1);

        }
        this.O = String.valueOf(stringBuilder);
    }

    public QuestTaskBase() {
        this.N = lIlIIlIIIllII[0];
        this.Q = null;
    }

    @Override
    @Nullable
    public String l() {
        return this.O;
    }

    @Override
    @Nullable
    public String m() {
        return this.P;
    }
}

