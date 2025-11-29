/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.Locatable
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import com.google.common.collect.ImmutableSet;
import gg.squire.thieving.SquirePlunderConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.b_Unknown;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.CEnum;

@Singleton
public class a_Unknown {
    private static final /* synthetic */ Logger g;
    private static /* synthetic */ int[] llllllIllIll;
    private /* synthetic */ int l;
    public final /* synthetic */ Set<Integer> h;
    private final /* synthetic */ Client j;
    private final /* synthetic */ List<GameObject> k;
    private static /* synthetic */ String[] llllllIllIlI;
    private final /* synthetic */ SquirePlunderConfig i;
    private /* synthetic */ int m;

    public int d() {
        return this.l;
    }

    private static boolean lIIlIlIIlIIlIlI(Object object) {
        return object == null;
    }

    @Inject
    public a(SquirePlunderConfig squirePlunderConfig, Client client) {
        this.h = ImmutableSet.of((Object)llllllIllIll[0], (Object)llllllIllIll[1], (Object)llllllIllIll[2]);
        this.k = new ArrayList<GameObject>();
        this.l = llllllIllIll[3];
        this.m = llllllIllIll[3];
        this.i = squirePlunderConfig;
        this.j = client;
    }

    private static String lIIlIlIIlIIIllI(String var8, String var2) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llllllIllIll[6], var7);
            return new String(var9.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var6;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (a.lIIlIlIIlIIlIIl(Players.getLocal().getWorldLocation().getRegionID(), llllllIllIll[4])) {
            return;
        }
        if (a.lIIlIlIIlIIlIlI((Object)c.f())) {
            return;
        }
        if (a.lIIlIlIIlIIlIll(c.f().i().contains((Locatable)var6) ? 1 : 0) && a.lIIlIlIIlIIlIll(var6.getName().toLowerCase().contains(llllllIllIlI[llllllIllIll[3]]) ? 1 : 0)) {
            a var10;
            var10.k.add((GameObject)var6);
            0;
        }
    }

    private static void lIIlIlIIlIIIlll() {
        llllllIllIlI = new String[llllllIllIll[5]];
        a.llllllIllIlI[a.llllllIllIll[3]] = a."urn";
    }

    private static boolean lIIlIlIIlIIlIll(int n2) {
        return n2 != 0;
    }

    public boolean a(c c2) {
        switch (b.n[c2.ordinal()]) {
            case 1: {
                a var4;
                return var4.i.plunderChestOne();
            }
            case 2: {
                a var4;
                return var4.i.plunderChestTwo();
            }
            case 3: {
                a var4;
                return var4.i.plunderChestThree();
            }
            case 4: {
                a var4;
                return var4.i.plunderChestFour();
            }
            case 5: {
                a var4;
                return var4.i.plunderChestFive();
            }
            case 6: {
                a var4;
                return var4.i.plunderChestSix();
            }
            case 7: {
                a var4;
                return var4.i.plunderChestSeven();
            }
            case 8: {
                a var4;
                return var4.i.plunderChestEight();
            }
        }
        return llllllIllIll[3];
    }

    public List<GameObject> c() {
        return this.k;
    }

    private static boolean lIIlIlIIlIIllII(Object object, Object object2) {
        return object == object2;
    }

    public boolean b(c c2) {
        switch (b.n[c2.ordinal()]) {
            case 1: {
                a var3;
                return var3.i.plunderUrnsOne();
            }
            case 2: {
                a var3;
                return var3.i.plunderUrnsTwo();
            }
            case 3: {
                a var3;
                return var3.i.plunderUrnsThree();
            }
            case 4: {
                a var3;
                return var3.i.plunderUrnsFour();
            }
            case 5: {
                a var3;
                return var3.i.plunderUrnsFive();
            }
            case 6: {
                a var3;
                return var3.i.plunderUrnsSix();
            }
            case 7: {
                a var3;
                return var3.i.plunderUrnsSeven();
            }
            case 8: {
                a var3;
                return var3.i.plunderUrnsEight();
            }
        }
        return llllllIllIll[3];
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (a.lIIlIlIIlIIllII(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.k.clear();
        }
    }

    private static boolean lIIlIlIIlIIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    public void b(int n2) {
        this.m = n2;
    }

    private static void lIIlIlIIlIIlIII() {
        llllllIllIll = new int[7];
        a.llllllIllIll[0] = -(0xFFFFAAC3 & 0x7D7F) & (0xFFFFFB4F & Short.MAX_VALUE);
        a.llllllIllIll[1] = -(0xFFFFCD69 & 0x3ED7) & (0xFFFFFF4F & 0x5FFE);
        a.llllllIllIll[2] = -(141 + 80 - 67 + 71) & (0xFFFFDFFF & 0x73EF);
        a.llllllIllIll[3] = (88 + 169 - 248 + 185 ^ 115 + 62 - 39 + 22) & (0xE8 ^ 0xB2 ^ (0x62 ^ 0x5A) ^ -1);
        a.llllllIllIll[4] = 0xFFFF9E65 & 0x7FDF;
        a.llllllIllIll[5] = 1;
        a.llllllIllIll[6] = 2;
    }

    public int e() {
        return this.m;
    }

    public boolean c(c c2) {
        switch (b.n[c2.ordinal()]) {
            case 1: {
                a var5;
                return var5.i.plunderSarcophagusOne();
            }
            case 2: {
                a var5;
                return var5.i.plunderSarcophagusTwo();
            }
            case 3: {
                a var5;
                return var5.i.plunderSarcophagusThree();
            }
            case 4: {
                a var5;
                return var5.i.plunderSarcophagusFour();
            }
            case 5: {
                a var5;
                return var5.i.plunderSarcophagusFive();
            }
            case 6: {
                a var5;
                return var5.i.plunderSarcophagusSix();
            }
            case 7: {
                a var5;
                return var5.i.plunderSarcophagusSeven();
            }
            case 8: {
                a var5;
                return var5.i.plunderSarcophagusEight();
            }
        }
        return llllllIllIll[3];
    }

    public void a(int n2) {
        this.l = n2;
    }

    static {
        a.lIIlIlIIlIIlIII();
        a.lIIlIlIIlIIIlll();
        g = LoggerFactory.getLogger(a.class);
    }
}

