/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonSyntaxException
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.WorldType
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.config.RuneScapeProfileType
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.WorldType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneScapeProfileType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.g;

@Singleton
public class f {
    private static final /* synthetic */ String T;
    private static /* synthetic */ int[] lIlIIIllIlIll;
    private static final /* synthetic */ String S;
    private /* synthetic */ RuneScapeProfileType ab;
    private final /* synthetic */ ConfigManager U;
    private /* synthetic */ String aa;
    private final /* synthetic */ g X;
    private final /* synthetic */ Gson W;
    private static final /* synthetic */ Logger R;
    public /* synthetic */ List<WorldType> Y;
    private static /* synthetic */ String[] lIlIIIllIlIlI;
    private final /* synthetic */ Client V;
    private /* synthetic */ List<Item> Z;

    private static boolean lIlllIIIIllIlII(int n2) {
        return n2 != 0;
    }

    public void a(Item[] itemArray) {
        this.X.b(itemArray);
        this.Z = this.X.v();
    }

    private static boolean lIlllIIIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIIIIllIIlI(Object object) {
        return object != null;
    }

    public List<Item> o() {
        return this.Z;
    }

    static {
        f.lIlllIIIIllIIII();
        f.lIlllIIIIlIllll();
        S = lIlIIIllIlIlI[lIlIIIllIlIll[7]];
        T = lIlIIIllIlIlI[lIlIIIllIlIll[8]];
        R = LoggerFactory.getLogger(f.class);
    }

    private static String lIlllIIIIlIllIl(String llllllllllllllIlllIIIlIIIlIIlIIl, String llllllllllllllIlllIIIlIIIlIIlIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIIIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), lIlIIIllIlIll[8]), "DES");
            Cipher llllllllllllllIlllIIIlIIIlIIllIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIIlIIIlIIllIl.init(lIlIIIllIlIll[3], llllllllllllllIlllIIIlIIIlIIlllI);
            return new String(llllllllllllllIlllIIIlIIIlIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIIIlIIllII) {
            llllllllllllllIlllIIIlIIIlIIllII.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIIIlIlllI(String llllllllllllllIlllIIIlIIIllIlIII, String llllllllllllllIlllIIIlIIIllIIlll) {
        llllllllllllllIlllIIIlIIIllIlIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIIllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIIlIIIllIlIll = new StringBuilder();
        char[] llllllllllllllIlllIIIlIIIllIlIlI = llllllllllllllIlllIIIlIIIllIIlll.toCharArray();
        int llllllllllllllIlllIIIlIIIllIlIIl = lIlIIIllIlIll[1];
        char[] llllllllllllllIlllIIIlIIIllIIIll = llllllllllllllIlllIIIlIIIllIlIII.toCharArray();
        int llllllllllllllIlllIIIlIIIllIIIlI = llllllllllllllIlllIIIlIIIllIIIll.length;
        int llllllllllllllIlllIIIlIIIllIIIIl = lIlIIIllIlIll[1];
        while (f.lIlllIIIIllIlIl(llllllllllllllIlllIIIlIIIllIIIIl, llllllllllllllIlllIIIlIIIllIIIlI)) {
            char llllllllllllllIlllIIIlIIIllIlllI = llllllllllllllIlllIIIlIIIllIIIll[llllllllllllllIlllIIIlIIIllIIIIl];
            llllllllllllllIlllIIIlIIIllIlIll.append((char)(llllllllllllllIlllIIIlIIIllIlllI ^ llllllllllllllIlllIIIlIIIllIlIlI[llllllllllllllIlllIIIlIIIllIlIIl % llllllllllllllIlllIIIlIIIllIlIlI.length]));
            0;
            ++llllllllllllllIlllIIIlIIIllIlIIl;
            ++llllllllllllllIlllIIIlIIIllIIIIl;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIIlIIIllIlIll);
    }

    public void s() {
        if (f.lIlllIIIIllIIll(this.aa)) {
            return;
        }
        this.U.setConfiguration(lIlIIIllIlIlI[lIlIIIllIlIll[4]], this.aa, lIlIIIllIlIlI[lIlIIIllIlIll[0]], this.W.toJson((Object)this.X.w()));
    }

    private static void lIlllIIIIllIIII() {
        lIlIIIllIlIll = new int[10];
        f.lIlIIIllIlIll[0] = 0x12 ^ 0x51 ^ (0x13 ^ 0x54);
        f.lIlIIIllIlIll[1] = 3 & ~3;
        f.lIlIIIllIlIll[2] = 1;
        f.lIlIIIllIlIll[3] = 2;
        f.lIlIIIllIlIll[4] = 3;
        f.lIlIIIllIlIll[5] = 0x9C ^ 0x99;
        f.lIlIIIllIlIll[6] = 0x4E ^ 0x48;
        f.lIlIIIllIlIll[7] = 0x42 ^ 0x45;
        f.lIlIIIllIlIll[8] = 0x32 ^ 0x3A;
        f.lIlIIIllIlIll[9] = 0x1C ^ 0x15;
    }

    /*
     * WARNING - void declaration
     */
    private String t() {
        f llllllllllllllIlllIIIlIIIlllllII;
        StringBuilder stringBuilder = new StringBuilder();
        EnumSet enumSet = this.V.getWorldType();
        Iterator llllllllllllllIlllIIIlIIIllllIIl = enumSet.iterator();
        while (f.lIlllIIIIllIlII(llllllllllllllIlllIIIlIIIllllIIl.hasNext() ? 1 : 0)) {
            WorldType llllllllllllllIlllIIIlIIIllllIII = (WorldType)llllllllllllllIlllIIIlIIIllllIIl.next();
            if (f.lIlllIIIIllIlII(llllllllllllllIlllIIIlIIIlllllII.Y.contains(llllllllllllllIlllIIIlIIIllllIII) ? 1 : 0)) {
                void llllllllllllllIlllIIIlIIIllllIll;
                llllllllllllllIlllIIIlIIIllllIll.append(llllllllllllllIlllIIIlIIIllllIII.name()).append(lIlIIIllIlIlI[lIlIIIllIlIll[5]]);
                0;
            }
            0;
            if (1 == 1) continue;
            return null;
        }
        if (f.lIlllIIIIllIIll(llllllllllllllIlllIIIlIIIlllllII.V.getLocalPlayer())) {
            return lIlIIIllIlIlI[lIlIIIllIlIll[6]];
        }
        stringBuilder.append(this.V.getLocalPlayer().getName());
        0;
        return String.valueOf(stringBuilder);
    }

    private static void lIlllIIIIlIllll() {
        lIlIIIllIlIlI = new String[lIlIIIllIlIll[9]];
        f.lIlIIIllIlIlI[f.lIlIIIllIlIll[1]] = f."squirequester";
        f.lIlIIIllIlIlI[f.lIlIIIllIlIll[2]] = f."squirequester";
        f.lIlIIIllIlIlI[f.lIlIIIllIlIll[3]] = f."bankitems";
        f.lIlIIIllIlIlI[f.lIlIIIllIlIll[4]] = f."squirequester";
        f.lIlIIIllIlIlI[f.lIlIIIllIlIll[0]] = f."bankitems";
        f.lIlIIIllIlIlI[f.lIlIIIllIlIll[5]] = f.":";
        f.lIlIIIllIlIlI[f.lIlIIIllIlIll[6]] = f."NULL PLAYER";
        f.lIlIIIllIlIlI[f.lIlIIIllIlIll[7]] = f."squirequester";
        f.lIlIIIllIlIlI[f.lIlIIIllIlIll[8]] = f."bankitems";
    }

    private static boolean lIlllIIIIllIIll(Object object) {
        return object == null;
    }

    public void p() {
        this.aa = null;
        this.ab = null;
        this.X.u();
        this.Z = new ArrayList<Item>();
    }

    private static boolean lIlllIIIIllIIIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public f(Client client, ConfigManager configManager, Gson gson) {
        WorldType[] worldTypeArray = new WorldType[lIlIIIllIlIll[0]];
        worldTypeArray[f.lIlIIIllIlIll[1]] = WorldType.SEASONAL;
        worldTypeArray[f.lIlIIIllIlIll[2]] = WorldType.TOURNAMENT_WORLD;
        worldTypeArray[f.lIlIIIllIlIll[3]] = WorldType.DEADMAN;
        worldTypeArray[f.lIlIIIllIlIll[4]] = WorldType.NOSAVE_MODE;
        this.Y = Arrays.asList(worldTypeArray);
        this.U = configManager;
        this.V = client;
        this.W = gson;
        this.X = new g();
        this.Z = new ArrayList<Item>();
    }

    private static String lIlllIIIIlIllII(String llllllllllllllIlllIIIlIIIlIllIII, String llllllllllllllIlllIIIlIIIlIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIIIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIIIlIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIIIlIllIlI.init(lIlIIIllIlIll[3], llllllllllllllIlllIIIlIIIlIllIll);
            return new String(llllllllllllllIlllIIIlIIIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIIIlIllIIl) {
            llllllllllllllIlllIIIlIIIlIllIIl.printStackTrace();
            return null;
        }
    }

    public void q() {
        if (f.lIlllIIIIllIIIl(RuneScapeProfileType.getCurrent((Client)this.V).equals((Object)this.ab) ? 1 : 0)) {
            f llllllllllllllIlllIIIlIIlIIIlIlI;
            if (f.lIlllIIIIllIIlI(this.aa)) {
                this.s();
            }
            llllllllllllllIlllIIIlIIlIIIlIlI.r();
        }
    }

    private void r() {
        f llllllllllllllIlllIIIlIIlIIIIllI;
        this.U.unsetConfiguration(lIlIIIllIlIlI[lIlIIIllIlIll[1]], this.t());
        this.aa = this.U.getRSProfileKey();
        this.ab = RuneScapeProfileType.getCurrent((Client)this.V);
        String llllllllllllllIlllIIIlIIlIIIIlIl = this.U.getRSProfileConfiguration(lIlIIIllIlIlI[lIlIIIllIlIll[2]], lIlIIIllIlIlI[lIlIIIllIlIll[3]]);
        try {
            llllllllllllllIlllIIIlIIlIIIIllI.X.a((int[])llllllllllllllIlllIIIlIIlIIIIllI.W.fromJson(llllllllllllllIlllIIIlIIlIIIIlIl, int[].class));
            0;
        }
        catch (JsonSyntaxException llllllllllllllIlllIIIlIIlIIIIlII) {
            llllllllllllllIlllIIIlIIlIIIIllI.X.a(new int[lIlIIIllIlIll[1]]);
            llllllllllllllIlllIIIlIIlIIIIllI.s();
        }
        if (null != null) {
            return;
        }
        this.Z = this.X.v();
    }
}

