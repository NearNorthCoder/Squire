/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.quest.tasks;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.d;
import gg.squire.quest.tasks.QuestTaskBase;
import gg.squire.quest.tasks.IHelper;

public class k
extends QuestTaskBase {
    private final  List<d> ac;
    
    private  String ae;
    private final  boolean ad;

    public k(WorldPoint ... worldPointArray) {
        this.ac = Stream.of(worldPointArray).map(d::new).collect(i.w());
        this.ad = lIIIllIlIIIll[1];
    }

    private static boolean lIlIIIlIIlllIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIIlIIlllIlI(int n2) {
        return n2 == 0;
    }

    static {
        k.lIlIIIlIIlllIIl();
        k.lIlIIIlIIlllIII();
    }

    public k(String string, boolean bl, d d2) {
        int n2;
        this.ae = string;
        if (k.lIlIIIlIIlllIlI(bl ? 1 : 0)) {
            n2 = lIIIllIlIIIll[1];

            if (2 != 2) {
                throw null;
            }
        } else {
            n2 = lIIIllIlIIIll[0];
        }
        this.ad = n2;
        d[] dArray = new d[lIIIllIlIIIll[1]];
        dArray[k.lIIIllIlIIIll[0]] = d2;
        this.ac = i.a(dArray);
    }

    public k(boolean bl, WorldPoint ... worldPointArray) {
        this.ac = Stream.of(worldPointArray).map(d::new).collect(i.w());
        this.ad = bl;
    }

        return String.valueOf(var1);
    }

    private static void lIlIIIlIIlllIII() {
        lIIIllIlIIIlI = new String[lIIIllIlIIIll[1]];
        k.lIIIllIlIIIlI[k.lIIIllIlIIIll[0]] = k.lIlIIIlIIllIlll("", "WAWrD");
    }

    @Override
    @Nonnull
    public String j() {
        String string;
        if (k.lIlIIIlIIllllIl(this.ae)) {
            string = lIIIllIlIIIlI[lIIIllIlIIIll[0]];

            if (3 <= 1) {
                return null;
            }
        } else {
            k var2;
            string = var2.ae;
        }
        return string;
    }

    private static boolean lIlIIIlIIllllIl(Object object) {
        return object == null;
    }

    public k(String string, d d2) {
        this(string, lIIIllIlIIIll[0], d2);
    }

    private static boolean lIlIIIlIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    public k(d ... dArray) {
        this.ac = i.a(dArray);
        this.ad = lIIIllIlIIIll[1];
    }

    @Override
    public boolean a(Client client) {
        Player player = client.getLocalPlayer();
        if (k.lIlIIIlIIlllIll(player) && k.lIlIIIlIIlllIll(this.ac)) {
            boolean bl;
            WorldPoint worldPoint = WorldPoint.fromLocalInstance((Client)client, (LocalPoint)player.getLocalLocation());
            int n2 = this.ac.stream().anyMatch(d2 -> d2.a(worldPoint)) ? 1 : 0;
            if (k.lIlIIIlIIllllII(n2, this.ad ? 1 : 0)) {
                bl = lIIIllIlIIIll[1];

                if (3 == 0) {
                    return ((119 + 107 - 127 + 123 ^ 60 + 101 - 49 + 31) & (0x25 ^ 0x14 ^ (0x17 ^ 0x77) ^ -1)) != 0;
                }
            } else {
                bl = lIIIllIlIIIll[0];
            }
            return bl;
        }
        return lIIIllIlIIIll[0];
    }

    public k(boolean bl, d ... dArray) {
        this.ac = i.a(dArray);
        this.ad = bl;
    }

    private static boolean lIlIIIlIIllllII(int n2, int n3) {
        return n2 == n3;
    }
}

