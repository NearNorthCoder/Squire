package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.o  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/o.class */
public final class EnumC0014o {
    public static final /* synthetic */ EnumC0014o EMERALD_AMULET;
    public static final /* synthetic */ EnumC0014o OPAL_AMULET;
    public static final /* synthetic */ EnumC0014o ONYX_RING;
    public static final /* synthetic */ EnumC0014o GOLD_NECKLACE;
    public static final /* synthetic */ EnumC0014o DRAGONSTONE_RING;
    public static final /* synthetic */ EnumC0014o RUBY_BRACELET;
    private final /* synthetic */ int craftingWidgetGroup;
    public static final /* synthetic */ EnumC0014o RUBY_NECKLACE;
    public static final /* synthetic */ EnumC0014o ZENYTE_BRACELET;
    public static final /* synthetic */ EnumC0014o EMERALD_BRACELET;
    public static final /* synthetic */ EnumC0014o DIAMOND_BRACELET;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ EnumC0014o RUBY_RING;
    public static final /* synthetic */ EnumC0014o DIAMOND_AMULET;
    public static final /* synthetic */ EnumC0014o ONYX_AMULET;
    public static final /* synthetic */ EnumC0014o OPAL_RING;
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ EnumC0014o OPAL_NECKLACE;
    public static final /* synthetic */ EnumC0014o JADE_NECKLACE;
    public static final /* synthetic */ EnumC0014o EMERALD_NECKLACE;
    public static final /* synthetic */ EnumC0014o ONYX_NECKLACE;
    public static final /* synthetic */ EnumC0014o SAPPHIRE_AMULET;
    private final /* synthetic */ String craftingOption;
    private static /* synthetic */ int[] lllIlIlIllI;
    private final /* synthetic */ int mouldID;
    public static final /* synthetic */ EnumC0014o GOLD_RING;
    public static final /* synthetic */ EnumC0014o DRAGONSTONE_BRACELET;
    public static final /* synthetic */ EnumC0014o SAPPHIRE_BRACELET;
    public static final /* synthetic */ EnumC0014o OPAL_BRACELET;
    public static final /* synthetic */ EnumC0014o ONYX_BRACELET;
    public static final /* synthetic */ EnumC0014o TOPAZ_RING;
    public static final /* synthetic */ EnumC0014o TOPAZ_NECKLACE;
    public static final /* synthetic */ EnumC0014o GOLD_AMULET;
    private static /* synthetic */ String[] lllIlIlIlIl;
    public static final /* synthetic */ EnumC0014o SAPPHIRE_NECKLACE;
    public static final /* synthetic */ EnumC0014o SAPPHIRE_RING;
    public static final /* synthetic */ EnumC0014o RUBY_AMULET;
    public static final /* synthetic */ EnumC0014o JADE_RING;
    public static final /* synthetic */ EnumC0014o GOLD_BRACELET;
    public static final /* synthetic */ EnumC0014o TOPAZ_BRACELET;
    public static final /* synthetic */ EnumC0014o DRAGONSTONE_NECKLACE;
    public static final /* synthetic */ EnumC0014o ZENYTE_AMULET;
    public static final /* synthetic */ EnumC0014o EMERALD_RING;
    public static final /* synthetic */ EnumC0014o DRAGONSTONE_AMULET;
    public static final /* synthetic */ EnumC0014o JADE_AMULET;
    public static final /* synthetic */ EnumC0014o DIAMOND_RING;
    public static final /* synthetic */ EnumC0014o TOPAZ_AMULET;
    public static final /* synthetic */ EnumC0014o JADE_BRACELET;
    private final /* synthetic */ int secondaryID;
    public static final /* synthetic */ EnumC0014o DIAMOND_NECKLACE;
    public static final /* synthetic */ EnumC0014o ZENYTE_NECKLACE;
    private final /* synthetic */ int craftingWidgetID;
    private static final /* synthetic */ EnumC0014o[] $VALUES;
    public static final /* synthetic */ EnumC0014o ZENYTE_RING;

    private EnumC0014o(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str2) {
        this.materialID = i2;
        this.secondaryID = i3;
        this.mouldID = i4;
        this.finishedID = i5;
        this.craftingWidgetGroup = i6;
        this.craftingWidgetID = i7;
        this.craftingOption = str2;
    }

    public static EnumC0014o valueOf(String str) {
        return (EnumC0014o) Enum.valueOf(EnumC0014o.class, str);
    }

    private static String lIlIlllllllIll(String llllllllllllllllIIlIIlIIllIIIllI, String llllllllllllllllIIlIIlIIllIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIIllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), lllIlIlIllI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIlIllI[8], llllllllllllllllIIlIIlIIllIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIIllIIIlll) {
            llllllllllllllllIIlIIlIIllIIIlll.printStackTrace();
            return null;
        }
    }

    public int K() {
        return this.craftingWidgetID;
    }

    public int z() {
        return this.materialID;
    }

    public static EnumC0014o[] values() {
        return (EnumC0014o[]) $VALUES.clone();
    }

    static {
        lIlIllllllllll();
        lIlIlllllllllI();
        GOLD_RING = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[1]], lllIlIlIllI[1], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[4], lllIlIlIllI[5], lllIlIlIllI[6], lllIlIlIlIl[lllIlIlIllI[7]]);
        GOLD_NECKLACE = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[8]], lllIlIlIllI[7], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[10], lllIlIlIllI[5], lllIlIlIllI[11], lllIlIlIlIl[lllIlIlIllI[12]]);
        GOLD_AMULET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[13]], lllIlIlIllI[8], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[15], lllIlIlIllI[5], lllIlIlIllI[16], lllIlIlIlIl[lllIlIlIllI[17]]);
        GOLD_BRACELET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[18]], lllIlIlIllI[12], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[20], lllIlIlIllI[5], lllIlIlIllI[21], lllIlIlIlIl[lllIlIlIllI[22]]);
        OPAL_RING = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[6]], lllIlIlIllI[13], lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[3], lllIlIlIllI[25], lllIlIlIllI[18], lllIlIlIllI[22], lllIlIlIlIl[lllIlIlIllI[26]]);
        OPAL_NECKLACE = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[27]], lllIlIlIllI[17], lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[9], lllIlIlIllI[28], lllIlIlIllI[18], lllIlIlIllI[29], lllIlIlIlIl[lllIlIlIllI[29]]);
        OPAL_BRACELET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[30]], lllIlIlIllI[18], lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[19], lllIlIlIllI[31], lllIlIlIllI[18], lllIlIlIllI[32], lllIlIlIlIl[lllIlIlIllI[33]]);
        OPAL_AMULET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[34]], lllIlIlIllI[22], lllIlIlIllI[23], lllIlIlIllI[24], lllIlIlIllI[14], lllIlIlIllI[35], lllIlIlIllI[18], lllIlIlIllI[36], lllIlIlIlIl[lllIlIlIllI[36]]);
        JADE_RING = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[37]], lllIlIlIllI[6], lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[3], lllIlIlIllI[39], lllIlIlIllI[18], lllIlIlIllI[6], lllIlIlIlIl[lllIlIlIllI[40]]);
        JADE_NECKLACE = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[41]], lllIlIlIllI[26], lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[9], lllIlIlIllI[42], lllIlIlIllI[18], lllIlIlIllI[30], lllIlIlIlIl[lllIlIlIllI[32]]);
        JADE_BRACELET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[43]], lllIlIlIllI[27], lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[19], lllIlIlIllI[44], lllIlIlIllI[18], lllIlIlIllI[43], lllIlIlIlIl[lllIlIlIllI[45]]);
        JADE_AMULET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[46]], lllIlIlIllI[29], lllIlIlIllI[38], lllIlIlIllI[24], lllIlIlIllI[14], lllIlIlIllI[47], lllIlIlIllI[18], lllIlIlIllI[37], lllIlIlIlIl[lllIlIlIllI[11]]);
        TOPAZ_RING = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[48]], lllIlIlIllI[30], lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[3], lllIlIlIllI[50], lllIlIlIllI[18], lllIlIlIllI[26], lllIlIlIlIl[lllIlIlIllI[51]]);
        TOPAZ_NECKLACE = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[52]], lllIlIlIllI[33], lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[9], lllIlIlIllI[53], lllIlIlIllI[18], lllIlIlIllI[33], lllIlIlIlIl[lllIlIlIllI[54]]);
        TOPAZ_BRACELET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[55]], lllIlIlIllI[34], lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[19], lllIlIlIllI[56], lllIlIlIllI[18], lllIlIlIllI[45], lllIlIlIlIl[lllIlIlIllI[57]]);
        TOPAZ_AMULET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[58]], lllIlIlIllI[36], lllIlIlIllI[49], lllIlIlIllI[24], lllIlIlIllI[14], lllIlIlIllI[59], lllIlIlIllI[18], lllIlIlIllI[40], lllIlIlIlIl[lllIlIlIllI[60]]);
        SAPPHIRE_RING = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[61]], lllIlIlIllI[37], lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[63], lllIlIlIllI[5], lllIlIlIllI[26], lllIlIlIlIl[lllIlIlIllI[64]]);
        SAPPHIRE_NECKLACE = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[65]], lllIlIlIllI[40], lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[66], lllIlIlIllI[5], lllIlIlIllI[48], lllIlIlIlIl[lllIlIlIllI[67]]);
        SAPPHIRE_BRACELET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[68]], lllIlIlIllI[41], lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[69], lllIlIlIllI[5], lllIlIlIllI[70], lllIlIlIlIl[lllIlIlIllI[16]]);
        SAPPHIRE_AMULET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[71]], lllIlIlIllI[32], lllIlIlIllI[62], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[72], lllIlIlIllI[5], lllIlIlIllI[71], lllIlIlIlIl[lllIlIlIllI[73]]);
        EMERALD_RING = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[74]], lllIlIlIllI[43], lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[76], lllIlIlIllI[5], lllIlIlIllI[27], lllIlIlIlIl[lllIlIlIllI[77]]);
        EMERALD_NECKLACE = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[78]], lllIlIlIllI[45], lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[79], lllIlIlIllI[5], lllIlIlIllI[51], lllIlIlIlIl[lllIlIlIllI[80]]);
        EMERALD_BRACELET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[81]], lllIlIlIllI[46], lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[82], lllIlIlIllI[5], lllIlIlIllI[83], lllIlIlIlIl[lllIlIlIllI[84]]);
        EMERALD_AMULET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[85]], lllIlIlIllI[11], lllIlIlIllI[75], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[86], lllIlIlIllI[5], lllIlIlIllI[73], lllIlIlIlIl[lllIlIlIllI[87]]);
        RUBY_RING = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[88]], lllIlIlIllI[48], lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[90], lllIlIlIllI[5], lllIlIlIllI[29], lllIlIlIlIl[lllIlIlIllI[91]]);
        RUBY_NECKLACE = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[21]], lllIlIlIllI[51], lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[92], lllIlIlIllI[5], lllIlIlIllI[52], lllIlIlIlIl[lllIlIlIllI[93]]);
        RUBY_BRACELET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[70]], lllIlIlIllI[52], lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[94], lllIlIlIllI[5], lllIlIlIllI[95], lllIlIlIlIl[lllIlIlIllI[83]]);
        RUBY_AMULET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[95]], lllIlIlIllI[54], lllIlIlIllI[89], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[96], lllIlIlIllI[5], lllIlIlIllI[74], lllIlIlIlIl[lllIlIlIllI[97]]);
        DIAMOND_RING = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[98]], lllIlIlIllI[55], lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[100], lllIlIlIllI[5], lllIlIlIllI[30], lllIlIlIlIl[lllIlIlIllI[101]]);
        DIAMOND_NECKLACE = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[102]], lllIlIlIllI[57], lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[103], lllIlIlIllI[5], lllIlIlIllI[54], lllIlIlIlIl[lllIlIlIllI[104]]);
        DIAMOND_BRACELET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[105]], lllIlIlIllI[58], lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[106], lllIlIlIllI[5], lllIlIlIllI[97], lllIlIlIlIl[lllIlIlIllI[107]]);
        DIAMOND_AMULET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[108]], lllIlIlIllI[60], lllIlIlIllI[99], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[109], lllIlIlIllI[5], lllIlIlIllI[77], lllIlIlIlIl[lllIlIlIllI[110]]);
        DRAGONSTONE_RING = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[111]], lllIlIlIllI[61], lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[113], lllIlIlIllI[5], lllIlIlIllI[33], lllIlIlIlIl[lllIlIlIllI[114]]);
        DRAGONSTONE_NECKLACE = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[115]], lllIlIlIllI[64], lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[116], lllIlIlIllI[5], lllIlIlIllI[55], lllIlIlIlIl[lllIlIlIllI[117]]);
        DRAGONSTONE_BRACELET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[118]], lllIlIlIllI[65], lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[119], lllIlIlIllI[5], lllIlIlIllI[98], lllIlIlIlIl[lllIlIlIllI[120]]);
        DRAGONSTONE_AMULET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[121]], lllIlIlIllI[67], lllIlIlIllI[112], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[122], lllIlIlIllI[5], lllIlIlIllI[78], lllIlIlIlIl[lllIlIlIllI[123]]);
        ONYX_RING = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[124]], lllIlIlIllI[68], lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[126], lllIlIlIllI[5], lllIlIlIllI[34], lllIlIlIlIl[lllIlIlIllI[127]]);
        ONYX_NECKLACE = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[128]], lllIlIlIllI[16], lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[129], lllIlIlIllI[5], lllIlIlIllI[57], lllIlIlIlIl[lllIlIlIllI[130]]);
        ONYX_BRACELET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[131]], lllIlIlIllI[71], lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[132], lllIlIlIllI[5], lllIlIlIllI[101], lllIlIlIlIl[lllIlIlIllI[133]]);
        ONYX_AMULET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[134]], lllIlIlIllI[73], lllIlIlIllI[125], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[135], lllIlIlIllI[5], lllIlIlIllI[80], lllIlIlIlIl[lllIlIlIllI[136]]);
        ZENYTE_RING = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[137]], lllIlIlIllI[74], lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[3], lllIlIlIllI[139], lllIlIlIllI[5], lllIlIlIllI[36], lllIlIlIlIl[lllIlIlIllI[140]]);
        ZENYTE_NECKLACE = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[141]], lllIlIlIllI[77], lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[9], lllIlIlIllI[142], lllIlIlIllI[5], lllIlIlIllI[58], lllIlIlIlIl[lllIlIlIllI[143]]);
        ZENYTE_BRACELET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[144]], lllIlIlIllI[78], lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[19], lllIlIlIllI[145], lllIlIlIllI[5], lllIlIlIllI[102], lllIlIlIlIl[lllIlIlIllI[146]]);
        ZENYTE_AMULET = new EnumC0014o(lllIlIlIlIl[lllIlIlIllI[147]], lllIlIlIllI[80], lllIlIlIllI[138], lllIlIlIllI[2], lllIlIlIllI[14], lllIlIlIllI[148], lllIlIlIllI[5], lllIlIlIllI[81], lllIlIlIlIl[lllIlIlIllI[149]]);
        EnumC0014o[] enumC0014oArr = new EnumC0014o[lllIlIlIllI[81]];
        enumC0014oArr[lllIlIlIllI[1]] = GOLD_RING;
        enumC0014oArr[lllIlIlIllI[7]] = GOLD_NECKLACE;
        enumC0014oArr[lllIlIlIllI[8]] = GOLD_AMULET;
        enumC0014oArr[lllIlIlIllI[12]] = GOLD_BRACELET;
        enumC0014oArr[lllIlIlIllI[13]] = OPAL_RING;
        enumC0014oArr[lllIlIlIllI[17]] = OPAL_NECKLACE;
        enumC0014oArr[lllIlIlIllI[18]] = OPAL_BRACELET;
        enumC0014oArr[lllIlIlIllI[22]] = OPAL_AMULET;
        enumC0014oArr[lllIlIlIllI[6]] = JADE_RING;
        enumC0014oArr[lllIlIlIllI[26]] = JADE_NECKLACE;
        enumC0014oArr[lllIlIlIllI[27]] = JADE_BRACELET;
        enumC0014oArr[lllIlIlIllI[29]] = JADE_AMULET;
        enumC0014oArr[lllIlIlIllI[30]] = TOPAZ_RING;
        enumC0014oArr[lllIlIlIllI[33]] = TOPAZ_NECKLACE;
        enumC0014oArr[lllIlIlIllI[34]] = TOPAZ_BRACELET;
        enumC0014oArr[lllIlIlIllI[36]] = TOPAZ_AMULET;
        enumC0014oArr[lllIlIlIllI[37]] = SAPPHIRE_RING;
        enumC0014oArr[lllIlIlIllI[40]] = SAPPHIRE_NECKLACE;
        enumC0014oArr[lllIlIlIllI[41]] = SAPPHIRE_BRACELET;
        enumC0014oArr[lllIlIlIllI[32]] = SAPPHIRE_AMULET;
        enumC0014oArr[lllIlIlIllI[43]] = EMERALD_RING;
        enumC0014oArr[lllIlIlIllI[45]] = EMERALD_NECKLACE;
        enumC0014oArr[lllIlIlIllI[46]] = EMERALD_BRACELET;
        enumC0014oArr[lllIlIlIllI[11]] = EMERALD_AMULET;
        enumC0014oArr[lllIlIlIllI[48]] = RUBY_RING;
        enumC0014oArr[lllIlIlIllI[51]] = RUBY_NECKLACE;
        enumC0014oArr[lllIlIlIllI[52]] = RUBY_BRACELET;
        enumC0014oArr[lllIlIlIllI[54]] = RUBY_AMULET;
        enumC0014oArr[lllIlIlIllI[55]] = DIAMOND_RING;
        enumC0014oArr[lllIlIlIllI[57]] = DIAMOND_NECKLACE;
        enumC0014oArr[lllIlIlIllI[58]] = DIAMOND_BRACELET;
        enumC0014oArr[lllIlIlIllI[60]] = DIAMOND_AMULET;
        enumC0014oArr[lllIlIlIllI[61]] = DRAGONSTONE_RING;
        enumC0014oArr[lllIlIlIllI[64]] = DRAGONSTONE_NECKLACE;
        enumC0014oArr[lllIlIlIllI[65]] = DRAGONSTONE_BRACELET;
        enumC0014oArr[lllIlIlIllI[67]] = DRAGONSTONE_AMULET;
        enumC0014oArr[lllIlIlIllI[68]] = ONYX_RING;
        enumC0014oArr[lllIlIlIllI[16]] = ONYX_NECKLACE;
        enumC0014oArr[lllIlIlIllI[71]] = ONYX_BRACELET;
        enumC0014oArr[lllIlIlIllI[73]] = ONYX_AMULET;
        enumC0014oArr[lllIlIlIllI[74]] = ZENYTE_RING;
        enumC0014oArr[lllIlIlIllI[77]] = ZENYTE_NECKLACE;
        enumC0014oArr[lllIlIlIllI[78]] = ZENYTE_BRACELET;
        enumC0014oArr[lllIlIlIllI[80]] = ZENYTE_AMULET;
        $VALUES = enumC0014oArr;
    }

    private static String lIlIllllllllIl(String llllllllllllllllIIlIIlIIlIllIllI, String llllllllllllllllIIlIIlIIlIllIlIl) {
        String llllllllllllllllIIlIIlIIlIllIllI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIlIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIIlIllIlII = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIIlIIlIllIlIl.toCharArray();
        int llllllllllllllllIIlIIlIIlIllIIlI = lllIlIlIllI[1];
        char[] charArray2 = llllllllllllllllIIlIIlIIlIllIllI2.toCharArray();
        int length = charArray2.length;
        int i = lllIlIlIllI[1];
        while (lIllIIIIIIIIII(i, length)) {
            char llllllllllllllllIIlIIlIIlIllIlll = charArray2[i];
            llllllllllllllllIIlIIlIIlIllIlII.append((char) (llllllllllllllllIIlIIlIIlIllIlll ^ charArray[llllllllllllllllIIlIIlIIlIllIIlI % charArray.length]));
            "".length();
            llllllllllllllllIIlIIlIIlIllIIlI++;
            i++;
            "".length();
            if ((135 ^ 131) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIIlIIlIllIlII);
    }

    public String L() {
        return this.craftingOption;
    }

    private static void lIlIllllllllll() {
        lllIlIlIllI = new int[151];
        lllIlIlIllI[0] = -" ".length();
        lllIlIlIllI[1] = (74 ^ 82) & ((159 ^ 135) ^ (-1));
        lllIlIlIllI[2] = (-14017) & 16373;
        lllIlIlIllI[3] = (-8515) & 10106;
        lllIlIlIllI[4] = (-2193) & 3827;
        lllIlIlIllI[5] = (-7745) & 8190;
        lllIlIlIllI[6] = (219 ^ 130) ^ (97 ^ 48);
        lllIlIlIllI[7] = " ".length();
        lllIlIlIllI[8] = "  ".length();
        lllIlIlIllI[9] = (-12609) & 14205;
        lllIlIlIllI[10] = (-16513) & 18166;
        lllIlIlIllI[11] = 21 ^ 2;
        lllIlIlIllI[12] = "   ".length();
        lllIlIlIllI[13] = (((36 + 104) - 66) + 112) ^ (((171 + 179) - 254) + 94);
        lllIlIlIllI[14] = (-((-683) & 5099)) & (-26629) & 32639;
        lllIlIlIllI[15] = (-((-2093) & 30767)) & (-2401) & 32747;
        lllIlIlIllI[16] = 80 ^ 117;
        lllIlIlIllI[17] = (41 ^ 118) ^ (244 ^ 174);
        lllIlIlIllI[18] = (93 ^ 42) ^ (220 ^ 173);
        lllIlIlIllI[19] = (-((-11189) & 28663)) & (-4229) & 32767;
        lllIlIlIllI[20] = (-((-31289) & 32379)) & (-20482) & 32639;
        lllIlIlIllI[21] = (123 ^ 46) ^ (235 ^ 140);
        lllIlIlIllI[22] = (137 ^ 185) ^ (146 ^ 165);
        lllIlIlIllI[23] = (-18711) & 20319;
        lllIlIlIllI[24] = (-((-20515) & 30319)) & (-20609) & 32767;
        lllIlIlIllI[25] = (-10273) & 31353;
        lllIlIlIllI[26] = 122 ^ 115;
        lllIlIlIllI[27] = 136 ^ 130;
        lllIlIlIllI[28] = (-3086) & 24175;
        lllIlIlIllI[29] = 89 ^ 82;
        lllIlIlIllI[30] = (((159 + 35) - 124) + 132) ^ (((32 + 128) - 66) + 104);
        lllIlIlIllI[31] = (-11267) & 32383;
        lllIlIlIllI[32] = 176 ^ 163;
        lllIlIlIllI[33] = (2 ^ 28) ^ (70 ^ 85);
        lllIlIlIllI[34] = (((21 + 11) - (-90)) + 18) ^ (((109 + 60) - 139) + 100);
        lllIlIlIllI[35] = (-((-22593) & 32085)) & (-1) & 30591;
        lllIlIlIllI[36] = " ".length() ^ (46 ^ 32);
        lllIlIlIllI[37] = (31 ^ 64) ^ (104 ^ 39);
        lllIlIlIllI[38] = (-((-5197) & 32221)) & (-5) & 28639;
        lllIlIlIllI[39] = (-3361) & 24444;
        lllIlIlIllI[40] = 16 ^ 1;
        lllIlIlIllI[41] = 108 ^ 126;
        lllIlIlIllI[42] = (-9243) & 30335;
        lllIlIlIllI[43] = 145 ^ 133;
        lllIlIlIllI[44] = (-8548) & 29667;
        lllIlIlIllI[45] = 98 ^ 119;
        lllIlIlIllI[46] = (40 ^ 89) ^ (166 ^ 193);
        lllIlIlIllI[47] = (-((-24329) & 32650)) & (-2305) & 31727;
        lllIlIlIllI[48] = (205 ^ 158) ^ (193 ^ 138);
        lllIlIlIllI[49] = (-((-10993) & 31731)) & (-10257) & 32607;
        lllIlIlIllI[50] = (-1313) & 22399;
        lllIlIlIllI[51] = 137 ^ 144;
        lllIlIlIllI[52] = 8 ^ 18;
        lllIlIlIllI[53] = (-((-21170) & 31671)) & (-129) & 31725;
        lllIlIlIllI[54] = (31 ^ 35) ^ (182 ^ 145);
        lllIlIlIllI[55] = 137 ^ 149;
        lllIlIlIllI[56] = (-((-16405) & 25917)) & (-2129) & 32763;
        lllIlIlIllI[57] = 182 ^ 171;
        lllIlIlIllI[58] = (231 ^ 138) ^ (195 ^ 176);
        lllIlIlIllI[59] = (-((-6939) & 16283)) & (-2057) & 32505;
        lllIlIlIllI[60] = "   ".length() ^ (156 ^ 128);
        lllIlIlIllI[61] = (((21 + 80) - 7) + 43) ^ (((54 + 161) - 161) + 115);
        lllIlIlIllI[62] = (-((-4689) & 23537)) & (-12289) & 32743;
        lllIlIlIllI[63] = (-((-13345) & 32179)) & (-9) & 20479;
        lllIlIlIllI[64] = 18 ^ 51;
        lllIlIlIllI[65] = 155 ^ 185;
        lllIlIlIllI[66] = (-((-4625) & 29207)) & (-2306) & 28543;
        lllIlIlIllI[67] = " ".length() ^ (88 ^ 122);
        lllIlIlIllI[68] = 128 ^ 164;
        lllIlIlIllI[69] = (-((-257) & 17857)) & (-4097) & 32767;
        lllIlIlIllI[70] = (165 ^ 154) ^ (94 ^ 85);
        lllIlIlIllI[71] = (68 ^ 103) ^ (138 ^ 143);
        lllIlIlIllI[72] = (-2341) & 4015;
        lllIlIlIllI[73] = (92 ^ 89) ^ (163 ^ 129);
        lllIlIlIllI[74] = 3 ^ 43;
        lllIlIlIllI[75] = (-((-10321) & 14459)) & (-18689) & 24431;
        lllIlIlIllI[76] = (-6417) & 8055;
        lllIlIlIllI[77] = (114 ^ 73) ^ (18 ^ 0);
        lllIlIlIllI[78] = (((6 + 11) - 6) + 156) ^ (((96 + 60) - 127) + 112);
        lllIlIlIllI[79] = (-((-1350) & 30023)) & (-1) & 30331;
        lllIlIlIllI[80] = 165 ^ 142;
        lllIlIlIllI[81] = (233 ^ 138) ^ (46 ^ 97);
        lllIlIlIllI[82] = (-(((104 + 63) - 156) + 119)) & (-1083) & 12287;
        lllIlIlIllI[83] = (34 ^ 117) ^ (202 ^ 168);
        lllIlIlIllI[84] = (111 ^ 69) ^ (45 ^ 42);
        lllIlIlIllI[85] = 53 ^ 27;
        lllIlIlIllI[86] = (-((-18077) & 32415)) & (-16449) & 32463;
        lllIlIlIllI[87] = (134 ^ 184) ^ (152 ^ 137);
        lllIlIlIllI[88] = (42 ^ 103) ^ (38 ^ 91);
        lllIlIlIllI[89] = (-22789) & 24391;
        lllIlIlIllI[90] = (-24855) & 26495;
        lllIlIlIllI[91] = 7 ^ 54;
        lllIlIlIllI[92] = (-30850) & 32509;
        lllIlIlIllI[93] = (243 ^ 191) ^ (((17 + 5) - (-51)) + 54);
        lllIlIlIllI[94] = (-((-8453) & 24855)) & (-1) & 27487;
        lllIlIlIllI[95] = 92 ^ 106;
        lllIlIlIllI[96] = (-((-3651) & 8019)) & (-8225) & 14271;
        lllIlIlIllI[97] = (77 ^ 101) ^ (187 ^ 164);
        lllIlIlIllI[98] = (((34 + 204) - 212) + 225) ^ (((8 + 32) - (-34)) + 121);
        lllIlIlIllI[99] = (-((-321) & 29159)) & (-1) & 30439;
        lllIlIlIllI[100] = (-((-8719) & 29215)) & (-261) & 22399;
        lllIlIlIllI[101] = (26 ^ 118) ^ (149 ^ 192);
        lllIlIlIllI[102] = 187 ^ 129;
        lllIlIlIllI[103] = (-((-13919) & 30687)) & (-8193) & 26622;
        lllIlIlIllI[104] = 167 ^ 156;
        lllIlIlIllI[105] = (198 ^ 187) ^ (245 ^ 180);
        lllIlIlIllI[106] = (-36) & 11127;
        lllIlIlIllI[107] = (((146 + 27) - 93) + 71) ^ (((100 + 42) - 82) + 110);
        lllIlIlIllI[108] = 128 ^ 190;
        lllIlIlIllI[109] = (-101) & 1781;
        lllIlIlIllI[110] = 133 ^ 186;
        lllIlIlIllI[111] = 250 ^ 186;
        lllIlIlIllI[112] = (-((-16897) & 27553)) & (-4113) & 16383;
        lllIlIlIllI[113] = (-8211) & 9855;
        lllIlIlIllI[114] = 76 ^ 13;
        lllIlIlIllI[115] = 89 ^ 27;
        lllIlIlIllI[116] = (-10287) & 11950;
        lllIlIlIllI[117] = 44 ^ 111;
        lllIlIlIllI[118] = (237 ^ 199) ^ (45 ^ 67);
        lllIlIlIllI[119] = (-129) & 11243;
        lllIlIlIllI[120] = (218 ^ 188) ^ (225 ^ 194);
        lllIlIlIllI[121] = (((44 + 198) - 190) + 181) ^ (((59 + 92) - 19) + 43);
        lllIlIlIllI[122] = (-12545) & 14227;
        lllIlIlIllI[123] = (((218 + 204) - 383) + 209) ^ (((70 + 17) - 30) + 134);
        lllIlIlIllI[124] = 213 ^ 157;
        lllIlIlIllI[125] = (-((-29517) & 30557)) & (-8259) & 15871;
        lllIlIlIllI[126] = (-9809) & 16383;
        lllIlIlIllI[127] = 62 ^ 119;
        lllIlIlIllI[128] = 127 ^ 53;
        lllIlIlIllI[129] = (-((-8337) & 9951)) & (-24577) & 32767;
        lllIlIlIllI[130] = (((137 + 131) - 237) + 212) ^ (((135 + 107) - 182) + 124);
        lllIlIlIllI[131] = (226 ^ 161) ^ (183 ^ 184);
        lllIlIlIllI[132] = (-((-17025) & 22150)) & (-1) & 16255;
        lllIlIlIllI[133] = (174 ^ 140) ^ (76 ^ 35);
        lllIlIlIllI[134] = 25 ^ 87;
        lllIlIlIllI[135] = (-1605) & 8183;
        lllIlIlIllI[136] = (52 ^ 34) ^ (123 ^ 34);
        lllIlIlIllI[137] = 146 ^ 194;
        lllIlIlIllI[138] = (-833) & 20325;
        lllIlIlIllI[139] = (-((-17425) & 22454)) & (-1) & 24567;
        lllIlIlIllI[140] = (93 ^ 98) ^ (55 ^ 89);
        lllIlIlIllI[141] = 230 ^ 180;
        lllIlIlIllI[142] = (-4113) & 23647;
        lllIlIlIllI[143] = 192 ^ 147;
        lllIlIlIllI[144] = (((81 + 240) - 217) + 141) ^ (((45 + 143) - 31) + 4);
        lllIlIlIllI[145] = (-9114) & 28605;
        lllIlIlIllI[146] = 236 ^ 185;
        lllIlIlIllI[147] = (89 ^ 17) ^ (157 ^ 131);
        lllIlIlIllI[148] = (-((-2159) & 7167)) & (-8259) & 32767;
        lllIlIlIllI[149] = (93 ^ 18) ^ (88 ^ 64);
        lllIlIlIllI[150] = 95 ^ 7;
    }

    private static boolean lIllIIIIIIIIII(int i, int i2) {
        return i < i2;
    }

    public int E() {
        return this.finishedID;
    }

    public int J() {
        return this.craftingWidgetGroup;
    }

    private EnumC0014o(String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) {
        this.materialID = i2;
        this.secondaryID = lllIlIlIllI[0];
        this.mouldID = i3;
        this.finishedID = i4;
        this.craftingWidgetGroup = i5;
        this.craftingWidgetID = i6;
        this.craftingOption = str2;
    }

    public int I() {
        return this.mouldID;
    }

    private static void lIlIlllllllllI() {
        lllIlIlIlIl = new String[lllIlIlIllI[150]];
        lllIlIlIlIl[lllIlIlIllI[1]] = lIlIlllllllIll("aXD8bNJ3SppgAlSX5pi9nQ==", "wSLIS");
        lllIlIlIlIl[lllIlIlIllI[7]] = lIlIllllllllII("eImCgy6e21k=", "zbLKF");
        lllIlIlIlIl[lllIlIlIllI[8]] = lIlIlllllllIll("XsOHwbClycpJjZYcfdQUHw==", "DvGWd");
        lllIlIlIlIl[lllIlIlIllI[12]] = lIlIllllllllII("3K9DE4F+u4M=", "vyBWb");
        lllIlIlIlIl[lllIlIlIllI[13]] = lIlIllllllllII("vqFuw/tbqEveHJ6XGmwI7Q==", "ycZHz");
        lllIlIlIlIl[lllIlIlIllI[17]] = lIlIlllllllIll("9gjbUcxidKM=", "ccasc");
        lllIlIlIlIl[lllIlIlIllI[18]] = lIlIllllllllIl("LwUWNjoqGBsxICQPDg==", "hJZre");
        lllIlIlIlIl[lllIlIlIllI[22]] = lIlIllllllllIl("GzccPQ==", "VVwXB");
        lllIlIlIlIl[lllIlIlIllI[6]] = lIlIlllllllIll("lGx+o5H+K+n9rVGjwh18FA==", "cTCLT");
        lllIlIlIlIl[lllIlIlIllI[26]] = lIlIllllllllII("e7Oo6UjgRQw=", "LJzIa");
        lllIlIlIlIl[lllIlIlIllI[27]] = lIlIlllllllIll("61LviGXoz7jzd575B6yvBA==", "caDOi");
        lllIlIlIlIl[lllIlIlIllI[29]] = lIlIlllllllIll("IUwzTwxa9xg=", "RvuSj");
        lllIlIlIlIl[lllIlIlIllI[30]] = lIlIllllllllII("QIia4frMjmW1Wibj3wGW4Q==", "EwfXx");
        lllIlIlIlIl[lllIlIlIllI[33]] = lIlIlllllllIll("CkcXBFIZuyI=", "vEYJL");
        lllIlIlIlIl[lllIlIlIllI[34]] = lIlIllllllllII("W47FXuLO9dURJERwcgpdzw==", "Cbjeg");
        lllIlIlIlIl[lllIlIlIllI[36]] = lIlIllllllllII("8ttDP8ps/kA=", "DOayl");
        lllIlIlIlIl[lllIlIlIllI[37]] = lIlIllllllllIl("ITUQKTE5PRor", "ktTln");
        lllIlIlIlIl[lllIlIlIllI[40]] = lIlIllllllllIl("MSQnHx0=", "rVFyi");
        lllIlIlIlIl[lllIlIlIllI[41]] = lIlIllllllllIl("JxM2EDwjFzEeLywRNw==", "mRrUc");
        lllIlIlIlIl[lllIlIlIllI[32]] = lIlIllllllllII("cu/1Zjd2/Wo=", "lyyCk");
        lllIlIlIlIl[lllIlIlIllI[43]] = lIlIllllllllIl("OyYpNCkzNSwyMz0iOQ==", "qgmqv");
        lllIlIlIlIl[lllIlIlIllI[45]] = lIlIlllllllIll("gb64KQJRzLE=", "hfcih");
        lllIlIlIlIl[lllIlIlIllI[46]] = lIlIlllllllIll("AvVS17rggEdJFkTMeyZ/FQ==", "kHyeU");
        lllIlIlIlIl[lllIlIlIllI[11]] = lIlIlllllllIll("WROTWQk/SxE=", "DBUJv");
        lllIlIlIlIl[lllIlIlIllI[48]] = lIlIllllllllIl("PA0GJww3EB8oEQ==", "hBVfV");
        lllIlIlIlIl[lllIlIlIllI[51]] = lIlIlllllllIll("vNY2sQX+VVA=", "mnmWs");
        lllIlIlIlIl[lllIlIlIllI[52]] = lIlIlllllllIll("XyNbjoDDKLJGm1wOQBaq1A==", "ruvzB");
        lllIlIlIlIl[lllIlIlIllI[54]] = lIlIllllllllII("2mlvEgePtC8=", "QEpOF");
        lllIlIlIlIl[lllIlIlIllI[55]] = lIlIllllllllIl("HTolLzcWNycvLgw5MDo=", "Iuunm");
        lllIlIlIlIl[lllIlIlIllI[57]] = lIlIlllllllIll("sq6qnzsXsSY=", "nyxKa");
        lllIlIlIlIl[lllIlIlIllI[58]] = lIlIllllllllII("P69ktefD9i27ebkGgJ+4fA==", "wwqCl");
        lllIlIlIlIl[lllIlIlIllI[60]] = lIlIlllllllIll("C+K/gMJ2i9A=", "TXoSi");
        lllIlIlIlIl[lllIlIlIllI[61]] = lIlIlllllllIll("9hXFgx9DFAr+blTy2MjxEw==", "XqjlQ");
        lllIlIlIlIl[lllIlIlIllI[64]] = lIlIlllllllIll("3VPfBlNFCO0=", "YXrud");
        lllIlIlIlIl[lllIlIlIllI[65]] = lIlIlllllllIll("wQqobklfHPBHxLuKqNBxU80huyMmpuIX", "CwnLi");
        lllIlIlIlIl[lllIlIlIllI[67]] = lIlIlllllllIll("6hFdTmOCfCw=", "UQzhT");
        lllIlIlIlIl[lllIlIlIllI[68]] = lIlIllllllllII("GPRMXWBfbAOSapjVTOKRptE/jd/A0H2D", "NvgSe");
        lllIlIlIlIl[lllIlIlIllI[16]] = lIlIllllllllII("VIGrlDTl4vE=", "uAfpg");
        lllIlIlIlIl[lllIlIlIllI[71]] = lIlIllllllllII("KIB5I7yxgTQANAMUxg9w0w==", "XNbjm");
        lllIlIlIlIl[lllIlIlIllI[73]] = lIlIllllllllIl("DgQaNg==", "CeqSC");
        lllIlIlIlIl[lllIlIlIllI[74]] = lIlIllllllllII("NfALnoqy+BpkPjTHzwmiNg==", "VpqtQ");
        lllIlIlIlIl[lllIlIlIllI[77]] = lIlIllllllllII("EQuBwWJtv9s=", "iOywH");
        lllIlIlIlIl[lllIlIlIllI[78]] = lIlIllllllllII("9IL6bVncQ4ClL9Ac6q++m/BrH2yAihoF", "SpDsm");
        lllIlIlIlIl[lllIlIlIllI[80]] = lIlIllllllllII("A1qthw5q2+Q=", "Dpwqz");
        lllIlIlIlIl[lllIlIlIllI[81]] = lIlIlllllllIll("rqidIL19tjlh/F/zfMXLoDDcYR9DlSFD", "awzjI");
        lllIlIlIlIl[lllIlIlIllI[84]] = lIlIllllllllIl("PiMfDQ==", "sBthX");
        lllIlIlIlIl[lllIlIlIllI[85]] = lIlIllllllllII("0jpvl7ZvuIfzXv/98Z4K1w==", "ceiGm");
        lllIlIlIlIl[lllIlIlIllI[87]] = lIlIllllllllII("TPliX+iEAvA=", "qfsbO");
        lllIlIlIlIl[lllIlIlIllI[88]] = lIlIllllllllIl("GRcsDgYZCyAQ", "KBnWY");
        lllIlIlIlIl[lllIlIlIllI[91]] = lIlIllllllllII("PNW0b6SL2lM=", "JhNzJ");
        lllIlIlIlIl[lllIlIlIllI[21]] = lIlIllllllllII("awde2+9ePotcTB35Hv3VJA==", "mQnZe");
        lllIlIlIlIl[lllIlIlIllI[93]] = lIlIlllllllIll("C1uwEAZyYis=", "VMYOW");
        lllIlIlIlIl[lllIlIlIllI[70]] = lIlIllllllllIl("IR83Ay0xGDQZNz8PIQ==", "sJuZr");
        lllIlIlIlIl[lllIlIlIllI[83]] = lIlIllllllllII("2hKjUtJUfpg=", "LedXR");
        lllIlIlIlIl[lllIlIlIllI[95]] = lIlIllllllllII("BdSGDl405aMb6/G6MxFtMQ==", "cWPVG");
        lllIlIlIlIl[lllIlIlIllI[97]] = lIlIllllllllIl("GRMCAw==", "Trify");
        lllIlIlIlIl[lllIlIlIllI[98]] = lIlIlllllllIll("vXUTOxWEL4KlUX7RjQjt4g==", "VbomP");
        lllIlIlIlIl[lllIlIlIllI[101]] = lIlIlllllllIll("tCRFd3DtFVw=", "fLVZk");
        lllIlIlIlIl[lllIlIlIllI[102]] = lIlIllllllllII("0kgMHiz3DX1FW2AcVu/OenEcaV77skxq", "AYAaw");
        lllIlIlIlIl[lllIlIlIllI[104]] = lIlIllllllllII("gBP1ecb9+5E=", "YJprT");
        lllIlIlIlIl[lllIlIlIllI[105]] = lIlIllllllllII("I8RwGcYjbaPbrjh8xtSMd0t2hrMCt6o7", "MlTMJ");
        lllIlIlIlIl[lllIlIlIllI[107]] = lIlIllllllllII("dlitxXzV56Q=", "Vrbob");
        lllIlIlIlIl[lllIlIlIllI[108]] = lIlIlllllllIll("9YsIPfvOFZ4N1dmve4fxrQ==", "WxNtE");
        lllIlIlIlIl[lllIlIlIllI[110]] = lIlIllllllllII("7qfQhDot1l8=", "BTWrt");
        lllIlIlIlIl[lllIlIlIllI[111]] = lIlIllllllllIl("EyQADjwZJRUGPRIpEwA9EA==", "WvAIs");
        lllIlIlIlIl[lllIlIlIllI[114]] = lIlIlllllllIll("x112cqSe8Ss=", "AKEFW");
        lllIlIlIlIl[lllIlIlIllI[115]] = lIlIlllllllIll("mHpHyz+fLnkQo9QJibtu+bFI+DAw2rZ5", "EznAe");
        lllIlIlIlIl[lllIlIlIllI[117]] = lIlIlllllllIll("DdK5BTuyWQY=", "rdvcn");
        lllIlIlIlIl[lllIlIlIllI[118]] = lIlIllllllllIl("FTE3NSwfMCI9LRQ8NCAiEiY6Nzc=", "Qcvrc");
        lllIlIlIlIl[lllIlIlIllI[120]] = lIlIllllllllII("RfUqmxL51HY=", "QeoKC");
        lllIlIlIlIl[lllIlIlIllI[121]] = lIlIllllllllII("CwaN+ASI9grTDkWnR6zJmmiKAH0t0A5q", "Tontk");
        lllIlIlIlIl[lllIlIlIllI[123]] = lIlIllllllllIl("IQkYIQ==", "lhsDg");
        lllIlIlIlIl[lllIlIlIllI[124]] = lIlIllllllllIl("JxwTFy06GwQI", "hRJOr");
        lllIlIlIlIl[lllIlIlIllI[127]] = lIlIllllllllIl("KCodCw==", "eKvnH");
        lllIlIlIlIl[lllIlIlIllI[128]] = lIlIlllllllIll("0PMIC86T3GqjTj5zPMBS2g==", "DPbce");
        lllIlIlIlIl[lllIlIlIllI[130]] = lIlIllllllllIl("JAsKAw==", "ijafg");
        lllIlIlIlIl[lllIlIlIllI[131]] = lIlIlllllllIll("CIzOSnnLmEVYCwWk9BxSzg==", "RrwSr");
        lllIlIlIlIl[lllIlIlIllI[133]] = lIlIlllllllIll("LdCTyqNsKRU=", "TjkaK");
        lllIlIlIlIl[lllIlIlIllI[134]] = lIlIllllllllII("c5aMQNpKPzDG5OXqWX0rHA==", "YcSYq");
        lllIlIlIlIl[lllIlIlIllI[136]] = lIlIlllllllIll("QZYc9hwBxg4=", "LCDXk");
        lllIlIlIlIl[lllIlIlIllI[137]] = lIlIllllllllIl("LAAkOz8zGjgrJTE=", "vEjbk");
        lllIlIlIlIl[lllIlIlIllI[140]] = lIlIllllllllIl("FykMCg==", "ZHgob");
        lllIlIlIlIl[lllIlIlIllI[141]] = lIlIllllllllII("t6NWwEpmoraOd/2hAX6fKA==", "ycHUt");
        lllIlIlIlIl[lllIlIlIllI[143]] = lIlIllllllllII("MxBW8egqwDA=", "PAINt");
        lllIlIlIlIl[lllIlIlIllI[144]] = lIlIllllllllII("4/DIHjbZQHQ9BY2sNJIz6w==", "AXpIp");
        lllIlIlIlIl[lllIlIlIllI[146]] = lIlIlllllllIll("+sGxJfiPJ6I=", "nYwFS");
        lllIlIlIlIl[lllIlIlIllI[147]] = lIlIllllllllIl("HwIFKCAAGAo8IQkCHw==", "EGKqt");
        lllIlIlIlIl[lllIlIlIllI[149]] = lIlIlllllllIll("j43lAGlnmgM=", "CnhZr");
    }

    public int H() {
        return this.secondaryID;
    }

    private static String lIlIllllllllII(String llllllllllllllllIIlIIlIIlIlIIIIl, String llllllllllllllllIIlIIlIIlIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIIlIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIlIllI[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIIlIlIIIlI) {
            llllllllllllllllIIlIIlIIlIlIIIlI.printStackTrace();
            return null;
        }
    }
}
