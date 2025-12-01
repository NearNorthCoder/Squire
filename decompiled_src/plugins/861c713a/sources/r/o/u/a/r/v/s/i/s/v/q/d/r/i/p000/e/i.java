package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.i  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/i.class */
public final class i {
    public static final /* synthetic */ i MELEE_DRAGON_WARHAMMER_SPEC;
    public static final /* synthetic */ i MELEE_2H_CRUSH;
    public static final /* synthetic */ i RANGED_DARTS;
    public static final /* synthetic */ i MELEE_AHRIMS_STAFF_CRUSH;
    public final /* synthetic */ int baseSpellDamage;
    public static final /* synthetic */ i RANGED_RUNE_CROSSBOW;
    public static final /* synthetic */ i RANGED_DRAGON_KNIFE_SPEC;
    public static final /* synthetic */ i MELEE_INQUISITORS_MACE;
    public static final /* synthetic */ i MELEE_ZAMORAK_GODSWORD_SPEC;
    public static final /* synthetic */ i MAGIC_STANDARD_WAVE_STAFF;
    public static final /* synthetic */ i RANGED_CROSSBOW_PVP;
    public static final /* synthetic */ i MELEE_SPEAR_CRUSH;
    public static final /* synthetic */ i RANGED_SHORTBOW;
    public static final /* synthetic */ i RANGED_CHINCHOMPA;
    public static final /* synthetic */ i MAGIC_STANDARD_BIND_STAFF;
    public static final /* synthetic */ i MELEE_ABYSSAL_BLUDGEON_CRUSH;
    public static final /* synthetic */ i MELEE_ABYSSAL_DAGGER_STAB;
    public static final /* synthetic */ i MELEE_SCYTHE;
    public static final /* synthetic */ i MELEE_VLS_SPEC;
    public static final /* synthetic */ i MELEE_BATTLEAXE_CRUSH;
    public static final /* synthetic */ i RANGED_BLOWPIPE;
    public static final /* synthetic */ i RANGED_RUNE_KNIFE;
    public static final /* synthetic */ i MELEE_VIGGORAS_CHAINMACE;
    public static final /* synthetic */ i MELEE_SWORD_STAB;
    public static final /* synthetic */ i MELEE_GODSWORD_DEFENSIVE;
    public static final /* synthetic */ i MELEE_DAGGER_SLASH;
    public static final /* synthetic */ i MELEE_BATTLEAXE_SLASH;
    public static final /* synthetic */ i RANGED_ZARYTE_CROSSBOW;
    public static final /* synthetic */ i MELEE_KICK;
    public static final /* synthetic */ i MELEE_STAFF_CRUSH_3;
    public static final /* synthetic */ i MELEE_PUNCH;
    public static final /* synthetic */ i MELEE_ARMADYL_GODSWORD_SPEC;
    public static final /* synthetic */ i MELEE_SCIM_SLASH;
    private static final /* synthetic */ Map<Integer, i> DATA;
    public static final /* synthetic */ i MAGIC_STANDARD_SURGE_STAFF;
    public static final /* synthetic */ i MELEE_ARMADYL_GODSWORD_OR_SPEC;
    public static final /* synthetic */ i MELEE_ZAMORAK_GODSWORD_OR_SPEC;
    public final /* synthetic */ boolean isSpecial;
    public static final /* synthetic */ i RANGED_BALLISTA;
    public static final /* synthetic */ i MELEE_LEAF_BLADED_BATTLEAXE_CRUSH;
    public static final /* synthetic */ i MAGIC_STANDARD_BIND;
    public static final /* synthetic */ i MELEE_GRANITE_MAUL_SPEC;
    public static final /* synthetic */ i MELEE_DRAGON_CLAWS_SPEC;
    public static final /* synthetic */ i MELEE_FANG_SPEC;
    private static /* synthetic */ String[] lIlIlIIIlIlII;
    public static final /* synthetic */ i RANGED_ZARYTE_CROSSBOW_PVP;
    public static final /* synthetic */ i MELEE_SARADOMIN_GODSWORD_SPEC;
    public static final /* synthetic */ i MELEE_MACE_STAB;
    public final /* synthetic */ int animationId;
    public static final /* synthetic */ i MAGIC_TUMEKENS_SHADOW;
    public static final /* synthetic */ i MELEE_ABYSSAL_WHIP;
    public static final /* synthetic */ i RANGED_DRAGON_KNIFE;
    public static final /* synthetic */ i MAGIC_ANCIENT_MULTI_TARGET;
    public static final /* synthetic */ i MELEE_GENERIC_SLASH;
    public static final /* synthetic */ i MELEE_LANCE_SLASH;
    public static final /* synthetic */ i MAGIC_STANDARD_STRIKE_BOLT_BLAST;
    public static final /* synthetic */ i MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC;
    public static final /* synthetic */ i MELEE_SPEAR_STAB;
    public static final /* synthetic */ i MELEE_GODSWORD_CRUSH;
    public static final /* synthetic */ i RANGED_MAGIC_SHORTBOW_SPEC;
    public static final /* synthetic */ i MELEE_LEAF_BLADED_BATTLEAXE_SLASH;
    public static final /* synthetic */ i MELEE_2H_SLASH;
    public static final /* synthetic */ i RANGED_BALLISTA_2;
    public static final /* synthetic */ i MELEE_SARADOMIN_GODSWORD_OR_SPEC;
    public static final /* synthetic */ i MELEE_OBBY_MAUL_CRUSH;
    private static final /* synthetic */ i[] $VALUES;
    public static final /* synthetic */ i MELEE_CRYSTAL_HALBERD_SPEC;
    public static final /* synthetic */ i RANGED_DRAGON_KNIFE_POISONED;
    public static final /* synthetic */ i MELEE_DLONG_SPEC;
    public static final /* synthetic */ i MELEE_GHAZI_RAPIER_STAB;
    public static final /* synthetic */ i MELEE_GRANITE_MAUL;
    public static final /* synthetic */ i MELEE_DHAROKS_GREATAXE_SLASH;
    public static final /* synthetic */ i RANGED_DRAGON_THROWNAXE_SPEC;
    public static final /* synthetic */ i MELEE_LANCE_STAB;
    public static final /* synthetic */ i MELEE_ANCIENT_GODSWORD_SPEC;
    public static final /* synthetic */ i MELEE_ELDER_MAUL;
    public static final /* synthetic */ i MELEE_LANCE_CRUSH;
    public static final /* synthetic */ i MELEE_STAFF_SLASH;
    public static final /* synthetic */ i MELEE_STAFF_CRUSH_2;
    public static final /* synthetic */ i MELEE_FANG_STAB;
    public static final /* synthetic */ i MELEE_DRAGON_MACE_SPEC;
    public final /* synthetic */ j attackStyle;
    public static final /* synthetic */ i MELEE_BANDOS_GODSWORD_SPEC;
    public static final /* synthetic */ i MELEE_STAFF_STAB;
    public static final /* synthetic */ i MELEE_GODSWORD_SLASH;
    public static final /* synthetic */ i MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF;
    public static final /* synthetic */ i MELEE_STAFF_CRUSH;
    private static /* synthetic */ int[] lIlIlIIIlllII;
    public static final /* synthetic */ i RANGED_RUNE_KNIFE_PVP;
    public static final /* synthetic */ i MAGIC_ANCIENT_SINGLE_TARGET;
    public static final /* synthetic */ i MELEE_BARRELCHEST_ANCHOR_CRUSH;
    public static final /* synthetic */ i MELEE_DHAROKS_GREATAXE_CRUSH;
    public static final /* synthetic */ i MELEE_DRAGON_DAGGER_SPEC;
    public static final /* synthetic */ i MELEE_BANDOS_GODSWORD_OR_SPEC;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    static {
        lIllllIllIIllIl();
        lIllllIllIIllII();
        MELEE_VIGGORAS_CHAINMACE = new i(lIlIlIIIlIlII[lIlIlIIIlllII[5]], lIlIlIIIlllII[0], lIlIlIIIlllII[6], j.CRUSH);
        MELEE_DAGGER_SLASH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[7]], lIlIlIIIlllII[1], lIlIlIIIlllII[8], j.SLASH);
        MELEE_SPEAR_STAB = new i(lIlIlIIIlIlII[lIlIlIIIlllII[9]], lIlIlIIIlllII[2], lIlIlIIIlllII[10], j.STAB);
        MELEE_SWORD_STAB = new i(lIlIlIIIlIlII[lIlIlIIIlllII[11]], lIlIlIIIlllII[3], lIlIlIIIlllII[12], j.STAB);
        MELEE_SCIM_SLASH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[13]], lIlIlIIIlllII[4], lIlIlIIIlllII[14], j.SLASH);
        MELEE_LANCE_STAB = new i(lIlIlIIIlIlII[lIlIlIIIlllII[15]], lIlIlIIIlllII[5], lIlIlIIIlllII[16], j.STAB);
        MELEE_LANCE_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[17]], lIlIlIIIlllII[7], lIlIlIIIlllII[18], j.CRUSH);
        MELEE_LANCE_SLASH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[19]], lIlIlIIIlllII[9], lIlIlIIIlllII[20], j.SLASH);
        MELEE_FANG_STAB = new i(lIlIlIIIlIlII[lIlIlIIIlllII[21]], lIlIlIIIlllII[11], lIlIlIIIlllII[22], j.STAB);
        MELEE_FANG_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[23]], lIlIlIIIlllII[13], lIlIlIIIlllII[24], j.STAB, (boolean) lIlIlIIIlllII[1]);
        MELEE_GENERIC_SLASH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[25]], lIlIlIIIlllII[15], lIlIlIIIlllII[26], j.SLASH);
        MELEE_STAFF_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[27]], lIlIlIIIlllII[17], lIlIlIIIlllII[0], j.SLASH);
        MELEE_BATTLEAXE_SLASH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[28]], lIlIlIIIlllII[19], lIlIlIIIlllII[29], j.SLASH);
        MELEE_MACE_STAB = new i(lIlIlIIIlIlII[lIlIlIIIlllII[30]], lIlIlIIIlllII[21], lIlIlIIIlllII[31], j.STAB);
        MELEE_BATTLEAXE_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[32]], lIlIlIIIlllII[23], lIlIlIIIlllII[33], j.CRUSH);
        MELEE_2H_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[34]], lIlIlIIIlllII[25], lIlIlIIIlllII[35], j.CRUSH);
        MELEE_2H_SLASH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[36]], lIlIlIIIlllII[27], lIlIlIIIlllII[37], j.SLASH);
        MELEE_STAFF_CRUSH_2 = new i(lIlIlIIIlIlII[lIlIlIIIlllII[38]], lIlIlIIIlllII[28], lIlIlIIIlllII[39], j.CRUSH);
        MELEE_STAFF_CRUSH_3 = new i(lIlIlIIIlIlII[lIlIlIIIlllII[40]], lIlIlIIIlllII[30], lIlIlIIIlllII[41], j.CRUSH);
        MELEE_PUNCH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[42]], lIlIlIIIlllII[32], lIlIlIIIlllII[43], j.CRUSH);
        MELEE_KICK = new i(lIlIlIIIlIlII[lIlIlIIIlllII[44]], lIlIlIIIlllII[34], lIlIlIIIlllII[45], j.CRUSH);
        MELEE_STAFF_STAB = new i(lIlIlIIIlIlII[lIlIlIIIlllII[46]], lIlIlIIIlllII[36], lIlIlIIIlllII[47], j.STAB);
        MELEE_SPEAR_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[48]], lIlIlIIIlllII[38], lIlIlIIIlllII[49], j.CRUSH);
        MELEE_STAFF_SLASH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[50]], lIlIlIIIlllII[40], lIlIlIIIlllII[51], j.SLASH);
        MELEE_DLONG_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[52]], lIlIlIIIlllII[42], lIlIlIIIlllII[53], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_DRAGON_MACE_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[54]], lIlIlIIIlllII[44], lIlIlIIIlllII[55], j.CRUSH, (boolean) lIlIlIIIlllII[1]);
        MELEE_DRAGON_DAGGER_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[56]], lIlIlIIIlllII[46], lIlIlIIIlllII[57], j.STAB, (boolean) lIlIlIIIlllII[1]);
        MELEE_DRAGON_WARHAMMER_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[58]], lIlIlIIIlllII[48], lIlIlIIIlllII[59], j.CRUSH, (boolean) lIlIlIIIlllII[1]);
        MELEE_ABYSSAL_WHIP = new i(lIlIlIIIlIlII[lIlIlIIIlllII[60]], lIlIlIIIlllII[50], lIlIlIIIlllII[61], j.SLASH);
        MELEE_GRANITE_MAUL = new i(lIlIlIIIlIlII[lIlIlIIIlllII[62]], lIlIlIIIlllII[52], lIlIlIIIlllII[63], j.CRUSH);
        MELEE_GRANITE_MAUL_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[64]], lIlIlIIIlllII[54], lIlIlIIIlllII[65], j.CRUSH, (boolean) lIlIlIIIlllII[1]);
        MELEE_DHAROKS_GREATAXE_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[66]], lIlIlIIIlllII[56], lIlIlIIIlllII[67], j.CRUSH);
        MELEE_DHAROKS_GREATAXE_SLASH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[68]], lIlIlIIIlllII[58], lIlIlIIIlllII[69], j.SLASH);
        MELEE_AHRIMS_STAFF_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[70]], lIlIlIIIlllII[60], lIlIlIIIlllII[71], j.CRUSH);
        MELEE_OBBY_MAUL_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[72]], lIlIlIIIlllII[62], lIlIlIIIlllII[73], j.CRUSH);
        MELEE_ABYSSAL_DAGGER_STAB = new i(lIlIlIIIlIlII[lIlIlIIIlllII[74]], lIlIlIIIlllII[64], lIlIlIIIlllII[75], j.STAB);
        MELEE_ABYSSAL_BLUDGEON_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[76]], lIlIlIIIlllII[66], lIlIlIIIlllII[77], j.CRUSH);
        MELEE_LEAF_BLADED_BATTLEAXE_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[78]], lIlIlIIIlllII[68], lIlIlIIIlllII[79], j.CRUSH);
        MELEE_INQUISITORS_MACE = new i(lIlIlIIIlIlII[lIlIlIIIlllII[80]], lIlIlIIIlllII[70], lIlIlIIIlllII[81], j.CRUSH);
        MELEE_BARRELCHEST_ANCHOR_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[82]], lIlIlIIIlllII[72], lIlIlIIIlllII[83], j.CRUSH);
        MELEE_LEAF_BLADED_BATTLEAXE_SLASH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[84]], lIlIlIIIlllII[74], lIlIlIIIlllII[85], j.SLASH);
        MELEE_GODSWORD_SLASH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[86]], lIlIlIIIlllII[76], lIlIlIIIlllII[87], j.SLASH);
        MELEE_GODSWORD_CRUSH = new i(lIlIlIIIlIlII[lIlIlIIIlllII[88]], lIlIlIIIlllII[78], lIlIlIIIlllII[89], j.CRUSH);
        MELEE_GODSWORD_DEFENSIVE = new i(lIlIlIIIlIlII[lIlIlIIIlllII[90]], lIlIlIIIlllII[80], lIlIlIIIlllII[91], j.SLASH);
        MELEE_DRAGON_CLAWS_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[92]], lIlIlIIIlllII[82], lIlIlIIIlllII[93], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_VLS_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[94]], lIlIlIIIlllII[84], lIlIlIIIlllII[95], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_ELDER_MAUL = new i(lIlIlIIIlIlII[lIlIlIIIlllII[96]], lIlIlIIIlllII[86], lIlIlIIIlllII[97], j.CRUSH);
        MELEE_ZAMORAK_GODSWORD_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[98]], lIlIlIIIlllII[88], lIlIlIIIlllII[99], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_ZAMORAK_GODSWORD_OR_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[100]], lIlIlIIIlllII[90], lIlIlIIIlllII[101], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_SARADOMIN_GODSWORD_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[102]], lIlIlIIIlllII[92], lIlIlIIIlllII[103], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_SARADOMIN_GODSWORD_OR_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[104]], lIlIlIIIlllII[94], lIlIlIIIlllII[105], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_BANDOS_GODSWORD_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[106]], lIlIlIIIlllII[96], lIlIlIIIlllII[107], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_BANDOS_GODSWORD_OR_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[108]], lIlIlIIIlllII[98], lIlIlIIIlllII[109], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_ARMADYL_GODSWORD_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[110]], lIlIlIIIlllII[100], lIlIlIIIlllII[111], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_ARMADYL_GODSWORD_OR_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[112]], lIlIlIIIlllII[102], lIlIlIIIlllII[113], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_SCYTHE = new i(lIlIlIIIlIlII[lIlIlIIIlllII[114]], lIlIlIIIlllII[104], lIlIlIIIlllII[115], j.SLASH);
        MELEE_GHAZI_RAPIER_STAB = new i(lIlIlIIIlIlII[lIlIlIIIlllII[116]], lIlIlIIIlllII[106], lIlIlIIIlllII[117], j.STAB);
        MELEE_ANCIENT_GODSWORD_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[118]], lIlIlIIIlllII[108], lIlIlIIIlllII[119], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        MELEE_CRYSTAL_HALBERD_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[120]], lIlIlIIIlllII[110], lIlIlIIIlllII[121], j.SLASH, (boolean) lIlIlIIIlllII[1]);
        RANGED_CHINCHOMPA = new i(lIlIlIIIlIlII[lIlIlIIIlllII[122]], lIlIlIIIlllII[112], lIlIlIIIlllII[123], j.RANGED);
        RANGED_SHORTBOW = new i(lIlIlIIIlIlII[lIlIlIIIlllII[124]], lIlIlIIIlllII[114], lIlIlIIIlllII[125], j.RANGED);
        RANGED_RUNE_KNIFE_PVP = new i(lIlIlIIIlIlII[lIlIlIIIlllII[126]], lIlIlIIIlllII[116], lIlIlIIIlllII[127], j.RANGED);
        RANGED_MAGIC_SHORTBOW_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[128]], lIlIlIIIlllII[118], lIlIlIIIlllII[129], j.RANGED, (boolean) lIlIlIIIlllII[1]);
        RANGED_CROSSBOW_PVP = new i(lIlIlIIIlIlII[lIlIlIIIlllII[130]], lIlIlIIIlllII[120], lIlIlIIIlllII[131], j.RANGED);
        RANGED_BLOWPIPE = new i(lIlIlIIIlIlII[lIlIlIIIlllII[132]], lIlIlIIIlllII[122], lIlIlIIIlllII[133], j.RANGED);
        RANGED_DARTS = new i(lIlIlIIIlIlII[lIlIlIIIlllII[134]], lIlIlIIIlllII[124], lIlIlIIIlllII[135], j.RANGED);
        RANGED_BALLISTA = new i(lIlIlIIIlIlII[lIlIlIIIlllII[136]], lIlIlIIIlllII[126], lIlIlIIIlllII[137], j.RANGED);
        RANGED_DRAGON_THROWNAXE_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[138]], lIlIlIIIlllII[128], lIlIlIIIlllII[139], j.RANGED, (boolean) lIlIlIIIlllII[1]);
        RANGED_RUNE_CROSSBOW = new i(lIlIlIIIlIlII[lIlIlIIIlllII[140]], lIlIlIIIlllII[130], lIlIlIIIlllII[141], j.RANGED);
        RANGED_BALLISTA_2 = new i(lIlIlIIIlIlII[lIlIlIIIlllII[142]], lIlIlIIIlllII[132], lIlIlIIIlllII[143], j.RANGED);
        RANGED_RUNE_KNIFE = new i(lIlIlIIIlIlII[lIlIlIIIlllII[144]], lIlIlIIIlllII[134], lIlIlIIIlllII[145], j.RANGED);
        RANGED_DRAGON_KNIFE = new i(lIlIlIIIlIlII[lIlIlIIIlllII[146]], lIlIlIIIlllII[136], lIlIlIIIlllII[147], j.RANGED);
        RANGED_DRAGON_KNIFE_POISONED = new i(lIlIlIIIlIlII[lIlIlIIIlllII[148]], lIlIlIIIlllII[138], lIlIlIIIlllII[149], j.RANGED);
        RANGED_DRAGON_KNIFE_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[150]], lIlIlIIIlllII[140], lIlIlIIIlllII[151], j.RANGED, (boolean) lIlIlIIIlllII[1]);
        RANGED_ZARYTE_CROSSBOW = new i(lIlIlIIIlIlII[lIlIlIIIlllII[152]], lIlIlIIIlllII[142], lIlIlIIIlllII[153], j.RANGED);
        RANGED_ZARYTE_CROSSBOW_PVP = new i(lIlIlIIIlIlII[lIlIlIIIlllII[154]], lIlIlIIIlllII[144], lIlIlIIIlllII[155], j.RANGED);
        MAGIC_STANDARD_BIND = new i(lIlIlIIIlIlII[lIlIlIIIlllII[156]], lIlIlIIIlllII[146], lIlIlIIIlllII[157], j.MAGIC);
        MAGIC_STANDARD_STRIKE_BOLT_BLAST = new i(lIlIlIIIlIlII[lIlIlIIIlllII[158]], lIlIlIIIlllII[148], lIlIlIIIlllII[159], j.MAGIC, lIlIlIIIlllII[27]);
        MAGIC_STANDARD_BIND_STAFF = new i(lIlIlIIIlIlII[lIlIlIIIlllII[160]], lIlIlIIIlllII[150], lIlIlIIIlllII[161], j.MAGIC);
        MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF = new i(lIlIlIIIlIlII[lIlIlIIIlllII[162]], lIlIlIIIlllII[152], lIlIlIIIlllII[163], j.MAGIC, lIlIlIIIlllII[27]);
        MAGIC_STANDARD_WAVE_STAFF = new i(lIlIlIIIlIlII[lIlIlIIIlllII[164]], lIlIlIIIlllII[154], lIlIlIIIlllII[165], j.MAGIC, lIlIlIIIlllII[34]);
        MAGIC_STANDARD_SURGE_STAFF = new i(lIlIlIIIlIlII[lIlIlIIIlllII[166]], lIlIlIIIlllII[156], lIlIlIIIlllII[167], j.MAGIC, lIlIlIIIlllII[42]);
        MAGIC_ANCIENT_SINGLE_TARGET = new i(lIlIlIIIlIlII[lIlIlIIIlllII[168]], lIlIlIIIlllII[158], lIlIlIIIlllII[169], j.MAGIC, lIlIlIIIlllII[46]);
        MAGIC_ANCIENT_MULTI_TARGET = new i(lIlIlIIIlIlII[lIlIlIIIlllII[170]], lIlIlIIIlllII[160], lIlIlIIIlllII[171], j.MAGIC, lIlIlIIIlllII[54]);
        MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC = new i(lIlIlIIIlIlII[lIlIlIIIlllII[172]], lIlIlIIIlllII[162], lIlIlIIIlllII[173], j.MAGIC, lIlIlIIIlllII[126]);
        MAGIC_TUMEKENS_SHADOW = new i(lIlIlIIIlIlII[lIlIlIIIlllII[174]], lIlIlIIIlllII[164], lIlIlIIIlllII[175], j.MAGIC);
        i[] iVarArr = new i[lIlIlIIIlllII[166]];
        iVarArr[lIlIlIIIlllII[0]] = MELEE_VIGGORAS_CHAINMACE;
        iVarArr[lIlIlIIIlllII[1]] = MELEE_DAGGER_SLASH;
        iVarArr[lIlIlIIIlllII[2]] = MELEE_SPEAR_STAB;
        iVarArr[lIlIlIIIlllII[3]] = MELEE_SWORD_STAB;
        iVarArr[lIlIlIIIlllII[4]] = MELEE_SCIM_SLASH;
        iVarArr[lIlIlIIIlllII[5]] = MELEE_LANCE_STAB;
        iVarArr[lIlIlIIIlllII[7]] = MELEE_LANCE_CRUSH;
        iVarArr[lIlIlIIIlllII[9]] = MELEE_LANCE_SLASH;
        iVarArr[lIlIlIIIlllII[11]] = MELEE_FANG_STAB;
        iVarArr[lIlIlIIIlllII[13]] = MELEE_FANG_SPEC;
        iVarArr[lIlIlIIIlllII[15]] = MELEE_GENERIC_SLASH;
        iVarArr[lIlIlIIIlllII[17]] = MELEE_STAFF_CRUSH;
        iVarArr[lIlIlIIIlllII[19]] = MELEE_BATTLEAXE_SLASH;
        iVarArr[lIlIlIIIlllII[21]] = MELEE_MACE_STAB;
        iVarArr[lIlIlIIIlllII[23]] = MELEE_BATTLEAXE_CRUSH;
        iVarArr[lIlIlIIIlllII[25]] = MELEE_2H_CRUSH;
        iVarArr[lIlIlIIIlllII[27]] = MELEE_2H_SLASH;
        iVarArr[lIlIlIIIlllII[28]] = MELEE_STAFF_CRUSH_2;
        iVarArr[lIlIlIIIlllII[30]] = MELEE_STAFF_CRUSH_3;
        iVarArr[lIlIlIIIlllII[32]] = MELEE_PUNCH;
        iVarArr[lIlIlIIIlllII[34]] = MELEE_KICK;
        iVarArr[lIlIlIIIlllII[36]] = MELEE_STAFF_STAB;
        iVarArr[lIlIlIIIlllII[38]] = MELEE_SPEAR_CRUSH;
        iVarArr[lIlIlIIIlllII[40]] = MELEE_STAFF_SLASH;
        iVarArr[lIlIlIIIlllII[42]] = MELEE_DLONG_SPEC;
        iVarArr[lIlIlIIIlllII[44]] = MELEE_DRAGON_MACE_SPEC;
        iVarArr[lIlIlIIIlllII[46]] = MELEE_DRAGON_DAGGER_SPEC;
        iVarArr[lIlIlIIIlllII[48]] = MELEE_DRAGON_WARHAMMER_SPEC;
        iVarArr[lIlIlIIIlllII[50]] = MELEE_ABYSSAL_WHIP;
        iVarArr[lIlIlIIIlllII[52]] = MELEE_GRANITE_MAUL;
        iVarArr[lIlIlIIIlllII[54]] = MELEE_GRANITE_MAUL_SPEC;
        iVarArr[lIlIlIIIlllII[56]] = MELEE_DHAROKS_GREATAXE_CRUSH;
        iVarArr[lIlIlIIIlllII[58]] = MELEE_DHAROKS_GREATAXE_SLASH;
        iVarArr[lIlIlIIIlllII[60]] = MELEE_AHRIMS_STAFF_CRUSH;
        iVarArr[lIlIlIIIlllII[62]] = MELEE_OBBY_MAUL_CRUSH;
        iVarArr[lIlIlIIIlllII[64]] = MELEE_ABYSSAL_DAGGER_STAB;
        iVarArr[lIlIlIIIlllII[66]] = MELEE_ABYSSAL_BLUDGEON_CRUSH;
        iVarArr[lIlIlIIIlllII[68]] = MELEE_LEAF_BLADED_BATTLEAXE_CRUSH;
        iVarArr[lIlIlIIIlllII[70]] = MELEE_INQUISITORS_MACE;
        iVarArr[lIlIlIIIlllII[72]] = MELEE_BARRELCHEST_ANCHOR_CRUSH;
        iVarArr[lIlIlIIIlllII[74]] = MELEE_LEAF_BLADED_BATTLEAXE_SLASH;
        iVarArr[lIlIlIIIlllII[76]] = MELEE_GODSWORD_SLASH;
        iVarArr[lIlIlIIIlllII[78]] = MELEE_GODSWORD_CRUSH;
        iVarArr[lIlIlIIIlllII[80]] = MELEE_GODSWORD_DEFENSIVE;
        iVarArr[lIlIlIIIlllII[82]] = MELEE_DRAGON_CLAWS_SPEC;
        iVarArr[lIlIlIIIlllII[84]] = MELEE_VLS_SPEC;
        iVarArr[lIlIlIIIlllII[86]] = MELEE_ELDER_MAUL;
        iVarArr[lIlIlIIIlllII[88]] = MELEE_ZAMORAK_GODSWORD_SPEC;
        iVarArr[lIlIlIIIlllII[90]] = MELEE_ZAMORAK_GODSWORD_OR_SPEC;
        iVarArr[lIlIlIIIlllII[92]] = MELEE_SARADOMIN_GODSWORD_SPEC;
        iVarArr[lIlIlIIIlllII[94]] = MELEE_SARADOMIN_GODSWORD_OR_SPEC;
        iVarArr[lIlIlIIIlllII[96]] = MELEE_BANDOS_GODSWORD_SPEC;
        iVarArr[lIlIlIIIlllII[98]] = MELEE_BANDOS_GODSWORD_OR_SPEC;
        iVarArr[lIlIlIIIlllII[100]] = MELEE_ARMADYL_GODSWORD_SPEC;
        iVarArr[lIlIlIIIlllII[102]] = MELEE_ARMADYL_GODSWORD_OR_SPEC;
        iVarArr[lIlIlIIIlllII[104]] = MELEE_SCYTHE;
        iVarArr[lIlIlIIIlllII[106]] = MELEE_GHAZI_RAPIER_STAB;
        iVarArr[lIlIlIIIlllII[108]] = MELEE_ANCIENT_GODSWORD_SPEC;
        iVarArr[lIlIlIIIlllII[110]] = MELEE_CRYSTAL_HALBERD_SPEC;
        iVarArr[lIlIlIIIlllII[112]] = RANGED_CHINCHOMPA;
        iVarArr[lIlIlIIIlllII[114]] = RANGED_SHORTBOW;
        iVarArr[lIlIlIIIlllII[116]] = RANGED_RUNE_KNIFE_PVP;
        iVarArr[lIlIlIIIlllII[118]] = RANGED_MAGIC_SHORTBOW_SPEC;
        iVarArr[lIlIlIIIlllII[120]] = RANGED_CROSSBOW_PVP;
        iVarArr[lIlIlIIIlllII[122]] = RANGED_BLOWPIPE;
        iVarArr[lIlIlIIIlllII[124]] = RANGED_DARTS;
        iVarArr[lIlIlIIIlllII[126]] = RANGED_BALLISTA;
        iVarArr[lIlIlIIIlllII[128]] = RANGED_DRAGON_THROWNAXE_SPEC;
        iVarArr[lIlIlIIIlllII[130]] = RANGED_RUNE_CROSSBOW;
        iVarArr[lIlIlIIIlllII[132]] = RANGED_BALLISTA_2;
        iVarArr[lIlIlIIIlllII[134]] = RANGED_RUNE_KNIFE;
        iVarArr[lIlIlIIIlllII[136]] = RANGED_DRAGON_KNIFE;
        iVarArr[lIlIlIIIlllII[138]] = RANGED_DRAGON_KNIFE_POISONED;
        iVarArr[lIlIlIIIlllII[140]] = RANGED_DRAGON_KNIFE_SPEC;
        iVarArr[lIlIlIIIlllII[142]] = RANGED_ZARYTE_CROSSBOW;
        iVarArr[lIlIlIIIlllII[144]] = RANGED_ZARYTE_CROSSBOW_PVP;
        iVarArr[lIlIlIIIlllII[146]] = MAGIC_STANDARD_BIND;
        iVarArr[lIlIlIIIlllII[148]] = MAGIC_STANDARD_STRIKE_BOLT_BLAST;
        iVarArr[lIlIlIIIlllII[150]] = MAGIC_STANDARD_BIND_STAFF;
        iVarArr[lIlIlIIIlllII[152]] = MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF;
        iVarArr[lIlIlIIIlllII[154]] = MAGIC_STANDARD_WAVE_STAFF;
        iVarArr[lIlIlIIIlllII[156]] = MAGIC_STANDARD_SURGE_STAFF;
        iVarArr[lIlIlIIIlllII[158]] = MAGIC_ANCIENT_SINGLE_TARGET;
        iVarArr[lIlIlIIIlllII[160]] = MAGIC_ANCIENT_MULTI_TARGET;
        iVarArr[lIlIlIIIlllII[162]] = MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC;
        iVarArr[lIlIlIIIlllII[164]] = MAGIC_TUMEKENS_SHADOW;
        $VALUES = iVarArr;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        i[] values = values();
        int length = values.length;
        int i = lIlIlIIIlllII[0];
        while (lIllllIllIlIIIl(i, length)) {
            i iVar = values[i];
            if (lIllllIllIlIIlI(iVar.animationId)) {
                "".length();
                if (0 != 0) {
                    return;
                }
            } else {
                builder.put(Integer.valueOf(iVar.animationId), iVar);
                "".length();
            }
            i++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
        DATA = builder.build();
    }

    private static String lIllllIlIllIlII(String llllllllllllllIllIllIIIIlIIIlIII, String llllllllllllllIllIllIIIIlIIIIlll) {
        String llllllllllllllIllIllIIIIlIIIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIllIIIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIllIIIIlIIIIllI = new StringBuilder();
        char[] llllllllllllllIllIllIIIIlIIIIlIl = llllllllllllllIllIllIIIIlIIIIlll.toCharArray();
        int llllllllllllllIllIllIIIIlIIIIlII = lIlIlIIIlllII[0];
        char[] charArray = llllllllllllllIllIllIIIIlIIIlIII2.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIIlllII[0];
        while (lIllllIllIlIIIl(i, length)) {
            llllllllllllllIllIllIIIIlIIIIllI.append((char) (charArray[i] ^ llllllllllllllIllIllIIIIlIIIIlIl[llllllllllllllIllIllIIIIlIIIIlII % llllllllllllllIllIllIIIIlIIIIlIl.length]));
            "".length();
            llllllllllllllIllIllIIIIlIIIIlII++;
            i++;
            "".length();
            if ((101 ^ 97) > (168 ^ 172)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIllIIIIlIIIIllI);
    }

    private static boolean lIllllIllIIlllI(Object obj) {
        return obj == null;
    }

    private static void lIllllIllIIllIl() {
        lIlIlIIIlllII = new int[177];
        lIlIlIIIlllII[0] = (201 ^ 195) & ((137 ^ 131) ^ (-1));
        lIlIlIIIlllII[1] = " ".length();
        lIlIlIIIlllII[2] = "  ".length();
        lIlIlIIIlllII[3] = "   ".length();
        lIlIlIIIlllII[4] = (((114 + 107) - 111) + 24) ^ (((21 + 83) - 47) + 73);
        lIlIlIIIlllII[5] = (((109 + 108) - 216) + 146) ^ (((25 + 46) - (-68)) + 11);
        lIlIlIIIlllII[6] = ((16 + 139) - 56) + 146;
        lIlIlIIIlllII[7] = (43 ^ 7) ^ (140 ^ 166);
        lIlIlIIIlllII[8] = (-1025) & 1400;
        lIlIlIIIlllII[9] = (((74 + 177) - 201) + 133) ^ (((37 + 62) - 97) + 174);
        lIlIlIIIlllII[10] = (-((-3349) & 16151)) & (-18561) & 31743;
        lIlIlIIIlllII[11] = (((32 + 78) - 84) + 154) ^ (((73 + 94) - 152) + 173);
        lIlIlIIIlllII[12] = (-26705) & 27090;
        lIlIlIIIlllII[13] = 148 ^ 157;
        lIlIlIIIlllII[14] = (-9242) & 9631;
        lIlIlIIIlllII[15] = 41 ^ 35;
        lIlIlIIIlllII[16] = (-((-2243) & 20423)) & (-2066) & 28533;
        lIlIlIIIlllII[17] = (153 ^ 144) ^ "  ".length();
        lIlIlIIIlllII[18] = (-((-8193) & 15518)) & (-257) & 15871;
        lIlIlIIIlllII[19] = (223 ^ 149) ^ (42 ^ 108);
        lIlIlIIIlllII[20] = (-((-25221) & 31647)) & (-16897) & 31611;
        lIlIlIIIlllII[21] = 42 ^ 39;
        lIlIlIIIlllII[22] = (-6145) & 15615;
        lIlIlIIIlllII[23] = (22 ^ 12) ^ (167 ^ 179);
        lIlIlIIIlllII[24] = (-16386) & 22503;
        lIlIlIIIlllII[25] = 150 ^ 153;
        lIlIlIIIlllII[26] = (-((-2457) & 31195)) & (-1557) & 30687;
        lIlIlIIIlllII[27] = 170 ^ 186;
        lIlIlIIIlllII[28] = ((46 ^ 60) & ((191 ^ 173) ^ (-1))) ^ (27 ^ 10);
        lIlIlIIIlllII[29] = (-((-9161) & 32761)) & (-1) & 23995;
        lIlIlIIIlllII[30] = (60 ^ 9) ^ (163 ^ 132);
        lIlIlIIIlllII[31] = (-((-21147) & 31487)) & (-4609) & 15348;
        lIlIlIIIlllII[32] = 210 ^ 193;
        lIlIlIIIlllII[33] = (-((-1369) & 32125)) & (-1545) & 32701;
        lIlIlIIIlllII[34] = 56 ^ 44;
        lIlIlIIIlllII[35] = (-((-18949) & 28269)) & (-2) & 9727;
        lIlIlIIIlllII[36] = (68 ^ 4) ^ (13 ^ 88);
        lIlIlIIIlllII[37] = (-12873) & 13279;
        lIlIlIIIlllII[38] = (87 ^ 26) ^ (0 ^ 91);
        lIlIlIIIlllII[39] = (-((-19481) & 28281)) & (-20482) & 29695;
        lIlIlIIIlllII[40] = 42 ^ 61;
        lIlIlIIIlllII[41] = (-((-4353) & 23873)) & (-4613) & 24551;
        lIlIlIIIlllII[42] = (((88 + 72) - 142) + 110) ^ (((40 + 120) - 129) + 121);
        lIlIlIIIlllII[43] = (-23577) & 23998;
        lIlIlIIIlllII[44] = (((80 + 147) - 67) + 13) ^ (((54 + 123) - 145) + 148);
        lIlIlIIIlllII[45] = (-21513) & 21935;
        lIlIlIIIlllII[46] = (146 ^ 166) ^ (178 ^ 156);
        lIlIlIIIlllII[47] = (-((-13409) & 15971)) & (-8273) & 11262;
        lIlIlIIIlllII[48] = 135 ^ 156;
        lIlIlIIIlllII[49] = (-((-16423) & 28279)) & (-16385) & 28669;
        lIlIlIIIlllII[50] = (65 ^ 121) ^ (227 ^ 199);
        lIlIlIIIlllII[51] = (-16901) & 17340;
        lIlIlIIIlllII[52] = 11 ^ 22;
        lIlIlIIIlllII[53] = (-((-8193) & 24917)) & (-2562) & 20343;
        lIlIlIIIlllII[54] = (110 ^ 75) ^ (82 ^ 105);
        lIlIlIIIlllII[55] = (-6793) & 7852;
        lIlIlIIIlllII[56] = (((147 + 85) - 96) + 30) ^ (((60 + 133) - 96) + 88);
        lIlIlIIIlllII[57] = (-((-17447) & 32183)) & (-16905) & 32702;
        lIlIlIIIlllII[58] = 108 ^ 76;
        lIlIlIIIlllII[59] = (-4610) & 5987;
        lIlIlIIIlllII[60] = 48 ^ 17;
        lIlIlIIIlllII[61] = (-((-22098) & 32727)) & (-4097) & 16383;
        lIlIlIIIlllII[62] = (10 ^ 23) ^ (155 ^ 164);
        lIlIlIIIlllII[63] = (-18449) & 20113;
        lIlIlIIIlllII[64] = 184 ^ 155;
        lIlIlIIIlllII[65] = (-((-1673) & 12285)) & (-20489) & 32767;
        lIlIlIIIlllII[66] = (((149 + 2) - 128) + 131) ^ (((0 + 68) - (-18)) + 104);
        lIlIlIIIlllII[67] = (-((-18497) & 27622)) & (-5193) & 16383;
        lIlIlIIIlllII[68] = (55 ^ 57) ^ (138 ^ 161);
        lIlIlIIIlllII[69] = (-1381) & 3447;
        lIlIlIIIlllII[70] = (32 ^ 18) ^ (162 ^ 182);
        lIlIlIIIlllII[71] = (-((-3225) & 11738)) & (-16513) & 27103;
        lIlIlIIIlllII[72] = (9 ^ 34) ^ (84 ^ 88);
        lIlIlIIIlllII[73] = (-17793) & 20453;
        lIlIlIIIlllII[74] = 1 ^ 41;
        lIlIlIIIlllII[75] = (-13075) & 16371;
        lIlIlIIIlllII[76] = 51 ^ 26;
        lIlIlIIIlllII[77] = (-21022) & 24319;
        lIlIlIIIlllII[78] = 8 ^ 34;
        lIlIlIIIlllII[79] = (-(((119 + 30) - 47) + 125)) & (-8210) & 12287;
        lIlIlIIIlllII[80] = 4 ^ 47;
        lIlIlIIIlllII[81] = (-26657) & 31159;
        lIlIlIIIlllII[82] = (((21 + 78) - (-7)) + 21) ^ (20 ^ 71);
        lIlIlIIIlllII[83] = (-19) & 5883;
        lIlIlIIIlllII[84] = (197 ^ 166) ^ (201 ^ 135);
        lIlIlIIIlllII[85] = (-((-23122) & 31475)) & (-16385) & 31741;
        lIlIlIIIlllII[86] = 109 ^ 67;
        lIlIlIIIlllII[87] = (-((-22925) & 32253)) & (-9) & 16381;
        lIlIlIIIlllII[88] = 145 ^ 190;
        lIlIlIIIlllII[89] = (-((-2437) & 11765)) & (-16385) & 32766;
        lIlIlIIIlllII[90] = (((90 + 140) - 116) + 31) ^ (((46 + 6) - 27) + 136);
        lIlIlIIIlllII[91] = (-((-18979) & 28211)) & (-65) & 16351;
        lIlIlIIIlllII[92] = 31 ^ 46;
        lIlIlIIIlllII[93] = (-((-21845) & 22518)) & (-16389) & 24575;
        lIlIlIIIlllII[94] = 176 ^ 130;
        lIlIlIIIlllII[95] = (-16549) & 24063;
        lIlIlIIIlllII[96] = (193 ^ 170) ^ (43 ^ 115);
        lIlIlIIIlllII[97] = (-((-2122) & 27373)) & (-1) & 32767;
        lIlIlIIIlllII[98] = 188 ^ 136;
        lIlIlIIIlllII[99] = (-((-25738) & 26251)) & (-8233) & 16383;
        lIlIlIIIlllII[100] = 52 ^ 1;
        lIlIlIIIlllII[101] = (-((-4689) & 21105)) & (-8201) & 32255;
        lIlIlIIIlllII[102] = (120 ^ 124) ^ (92 ^ 110);
        lIlIlIIIlllII[103] = (-((-24021) & 32727)) & (-16417) & 32762;
        lIlIlIIIlllII[104] = (((2 + 82) - 25) + 79) ^ (((134 + 117) - 201) + 139);
        lIlIlIIIlllII[105] = (-551) & 8191;
        lIlIlIIIlllII[106] = (((54 + 12) - 60) + 153) ^ (((127 + 112) - 94) + 22);
        lIlIlIIIlllII[107] = (-8194) & 15835;
        lIlIlIIIlllII[108] = (((0 + 116) - 16) + 56) ^ (((2 + 157) - 137) + 143);
        lIlIlIIIlllII[109] = (-((-3347) & 28435)) & (-33) & 32763;
        lIlIlIIIlllII[110] = (((64 + 45) - (-11)) + 10) ^ (((72 + 172) - 235) + 175);
        lIlIlIIIlllII[111] = (-((-7305) & 32427)) & (-2) & 32767;
        lIlIlIIIlllII[112] = (((126 + 98) - 129) + 62) ^ (((85 + 23) - 89) + 147);
        lIlIlIIIlllII[113] = (-8195) & 15839;
        lIlIlIIIlllII[114] = (206 ^ 154) ^ (209 ^ 185);
        lIlIlIIIlllII[115] = (-7) & 8062;
        lIlIlIIIlllII[116] = (((96 + 4) - 50) + 93) ^ (((157 + 155) - 168) + 34);
        lIlIlIIIlllII[117] = (-((-6345) & 30955)) & (-9) & 32763;
        lIlIlIIIlllII[118] = 113 ^ 79;
        lIlIlIIIlllII[119] = (-23593) & 32763;
        lIlIlIIIlllII[120] = (150 ^ 160) ^ (66 ^ 75);
        lIlIlIIIlllII[121] = (-((-8323) & 27079)) & (-12289) & 32247;
        lIlIlIIIlllII[122] = 74 ^ 10;
        lIlIlIIIlllII[123] = (-25141) & 32758;
        lIlIlIIIlllII[124] = 38 ^ 103;
        lIlIlIIIlllII[125] = (-((-4361) & 29518)) & (-5137) & 30719;
        lIlIlIIIlllII[126] = (((78 + 151) - 114) + 92) ^ (((34 + 118) - 97) + 86);
        lIlIlIIIlllII[127] = (-23643) & 24571;
        lIlIlIIIlllII[128] = (23 ^ 18) ^ (13 ^ 75);
        lIlIlIIIlllII[129] = (-((-29985) & 32686)) & (-16385) & 20159;
        lIlIlIIIlllII[130] = (101 ^ 44) ^ (106 ^ 103);
        lIlIlIIIlllII[131] = (-8521) & 12750;
        lIlIlIIIlllII[132] = (14 ^ 34) ^ (248 ^ 145);
        lIlIlIIIlllII[133] = (-3129) & 8189;
        lIlIlIIIlllII[134] = 248 ^ 190;
        lIlIlIIIlllII[135] = (-26113) & 32712;
        lIlIlIIIlllII[136] = 118 ^ 49;
        lIlIlIIIlllII[137] = (-25293) & 32510;
        lIlIlIIIlllII[138] = (((160 + 66) - 106) + 79) ^ (((134 + 110) - 181) + 80);
        lIlIlIIIlllII[139] = (-16397) & 23917;
        lIlIlIIIlllII[140] = (((57 + 29) - 69) + 181) ^ (((96 + 8) - (-27)) + 12);
        lIlIlIIIlllII[141] = (-546) & 8097;
        lIlIlIIIlllII[142] = 97 ^ 43;
        lIlIlIIIlllII[143] = (-8829) & 16383;
        lIlIlIIIlllII[144] = 136 ^ 195;
        lIlIlIIIlllII[145] = (-8741) & 16357;
        lIlIlIIIlllII[146] = (53 ^ 89) ^ (129 ^ 161);
        lIlIlIIIlllII[147] = (-((-3586) & 8119)) & (-2121) & 14847;
        lIlIlIIIlllII[148] = (((47 + 76) - 13) + 104) ^ (((120 + 103) - 111) + 43);
        lIlIlIIIlllII[149] = (-901) & 9095;
        lIlIlIIIlllII[150] = 65 ^ 15;
        lIlIlIIIlllII[151] = (-((-4115) & 24467)) & (-4107) & 32750;
        lIlIlIIIlllII[152] = 54 ^ 121;
        lIlIlIIIlllII[153] = (-((-9060) & 32623)) & (-37) & 32767;
        lIlIlIIIlllII[154] = (((130 + 59) - 182) + 142) ^ (((96 + 141) - 123) + 83);
        lIlIlIIIlllII[155] = (-1) & 9166;
        lIlIlIIIlllII[156] = (((89 + 89) - 78) + 124) ^ (((110 + 22) - 126) + 171);
        lIlIlIIIlllII[157] = (-5402) & 6111;
        lIlIlIIIlllII[158] = (((40 + 40) - (-76)) + 87) ^ (((114 + 142) - 120) + 25);
        lIlIlIIIlllII[159] = (-((-16385) & 31745)) & (-41) & 16111;
        lIlIlIIIlllII[160] = 194 ^ 145;
        lIlIlIIIlllII[161] = (-19027) & 20187;
        lIlIlIIIlllII[162] = 1 ^ 85;
        lIlIlIIIlllII[163] = (-14853) & 16014;
        lIlIlIIIlllII[164] = 82 ^ 7;
        lIlIlIIIlllII[165] = (-8737) & 9903;
        lIlIlIIIlllII[166] = 117 ^ 35;
        lIlIlIIIlllII[167] = (-((-2179) & 2515)) & (-1) & 8191;
        lIlIlIIIlllII[168] = (177 ^ 183) ^ (16 ^ 65);
        lIlIlIIIlllII[169] = (-((-1851) & 28479)) & (-4161) & 32766;
        lIlIlIIIlllII[170] = 241 ^ 169;
        lIlIlIIIlllII[171] = (-10309) & 12287;
        lIlIlIIIlllII[172] = (162 ^ 150) ^ (55 ^ 90);
        lIlIlIIIlllII[173] = (-18572) & 27103;
        lIlIlIIIlllII[174] = 52 ^ 110;
        lIlIlIIIlllII[175] = (-16969) & 26461;
        lIlIlIIIlllII[176] = (((89 + 6) - (-55)) + 2) ^ (((80 + 126) - 71) + 60);
    }

    @Override // java.lang.Enum
    public String toString() {
        String[] split = super.toString().toLowerCase().split(lIlIlIIIlIlII[lIlIlIIIlllII[3]]);
        ((List) Arrays.stream(split).collect(Collectors.toList())).toArray(split);
        "".length();
        return String.join(lIlIlIIIlIlII[lIlIlIIIlllII[4]], split);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    private static boolean lIllllIllIIllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    private static String lIllllIlIllIIll(String llllllllllllllIllIllIIIIIllIIllI, String llllllllllllllIllIllIIIIIllIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlllII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIlllII[2], llllllllllllllIllIllIIIIIllIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIIIllIIlll) {
            llllllllllllllIllIllIIIIIllIIlll.printStackTrace();
            return null;
        }
    }

    private i(String str, int i, int i2, j jVar, boolean z) {
        if (lIllllIllIIlllI(jVar)) {
            throw new InvalidParameterException(lIlIlIIIlIlII[lIlIlIIIlllII[1]]);
        }
        this.animationId = i2;
        this.attackStyle = jVar;
        this.isSpecial = z;
        this.baseSpellDamage = lIlIlIIIlllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public static boolean b(i iVar) {
        if (lIllllIllIIllll(iVar, MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF) && lIllllIllIIllll(iVar, MAGIC_STANDARD_STRIKE_BOLT_BLAST) && lIllllIllIIllll(iVar, MAGIC_STANDARD_WAVE_STAFF) && !lIllllIllIlIIII(iVar, MAGIC_STANDARD_SURGE_STAFF)) {
            return lIlIlIIIlllII[0];
        }
        ?? r0 = lIlIlIIIlllII[1];
        "".length();
        return ((184 ^ 188) & ((128 ^ 132) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static void lIllllIllIIllII() {
        lIlIlIIIlIlII = new String[lIlIlIIIlllII[176]];
        lIlIlIIIlIlII[lIlIlIIIlllII[0]] = lIllllIlIllIIll("UqGRYo9bs/T9FhScZmwN89+Fe/km6br8qnaFDw8ieWN+Q6DjfmXAzINMJs4OOgJ7", "eMkFC");
        lIlIlIIIlIlII[lIlIlIIIlllII[1]] = lIllllIlIllIlII("FDYGNgk+YiEjEzknUjofJjZSNQ91NBM7AzFiFDgYdQMcPgc0Nhs4BBEjBjY=", "UBrWj");
        lIlIlIIIlIlII[lIlIlIIIlllII[2]] = lIllllIlIllIIll("Nu4etTyIHDsV3PrZ397rKW5cse/jwLamCFABckuyTuTDKScBqdxQOaYwfKDXL0Apx+hFH325p76ocQiv9BOVNg==", "Wtxsj");
        lIlIlIIIlIlII[lIlIlIIIlllII[3]] = lIllllIlIllIIll("FjGPnyt9FTk=", "OksXp");
        lIlIlIIIlIlII[lIlIlIIIlllII[4]] = lIllllIlIllIlIl("MFD/z6jQrIo=", "ZgTvc");
        lIlIlIIIlIlII[lIlIlIIIlllII[5]] = lIllllIlIllIIll("S90SUXnA+yee6DBgQJYS2O7UOJc+92yjY42moMMvnNA=", "MAPTb");
        lIlIlIIIlIlII[lIlIlIIIlllII[7]] = lIllllIlIllIlIl("wuf6reFRqI1IcTrNJ+5hF8/VSFiHykrP", "QmIqZ");
        lIlIlIIIlIlII[lIlIlIIIlllII[9]] = lIllllIlIllIlII("CC8lPCkaOTk8LRc1Oi0tBw==", "Ejiyl");
        lIlIlIIIlIlII[lIlIlIIIlllII[11]] = lIllllIlIllIIll("hMIg1W0QOmHIUOKW/+Jiv7h9wEE/Rn4o", "nrbbj");
        lIlIlIIIlIlII[lIlIlIIIlllII[13]] = lIllllIlIllIIll("Q13lxK/KMJR7nMR8HY+cPCdnp2wrMp90", "OgxyA");
        lIlIlIIIlIlII[lIlIlIIIlllII[15]] = lIllllIlIllIlII("IT0lKw8zNCggCSknOjoLLg==", "lxinJ");
        lIlIlIIIlIlII[lIlIlIIIlllII[17]] = lIllllIlIllIlII("IisPAw4wIgIICCoxABQePCY=", "onCFK");
        lIlIlIIIlIlII[lIlIlIIIlllII[19]] = lIllllIlIllIlII("JhIeDzY0GxMEMC4IAQYyOB8=", "kWRJs");
        lIlIlIIIlIlII[lIlIlIIIlllII[21]] = lIllllIlIllIIll("odjWV/q8HKhNBldWMa0Idg==", "QWWaY");
        lIlIlIIIlIlII[lIlIlIIIlllII[23]] = lIllllIlIllIIll("Y7H57G3iRm91wqsqJcWKZQ==", "zeqHq");
        lIlIlIIIlIlII[lIlIlIIIlllII[25]] = lIllllIlIllIlIl("MpSVKozHZdGGzOWab8yWJa/687SNbYoH", "cQgJd");
        lIlIlIIIlIlII[lIlIlIIIlllII[27]] = lIllllIlIllIIll("a0LAef/lpj/D3F4nooaqgPyR17wXgoYx", "UFPGh");
        lIlIlIIIlIlII[lIlIlIIIlllII[28]] = lIllllIlIllIIll("p6JrHeDaxda7PCwa7PaqAhBNlA5UotiB", "IVaiq");
        lIlIlIIIlIlII[lIlIlIIIlllII[30]] = lIllllIlIllIlIl("514N1WLabS+gejbbCZHijg==", "qWHlc");
        lIlIlIIIlIlII[lIlIlIIIlllII[32]] = lIllllIlIllIIll("VJqWqp10PIvcXHJG4qP/D3khsMb+hc2J", "CUCNH");
        lIlIlIIIlIlII[lIlIlIIIlllII[34]] = lIllllIlIllIIll("VntFNP8qLFm9M4+Z2XXryQ==", "Ndrbu");
        lIlIlIIIlIlII[lIlIlIIIlllII[36]] = lIllllIlIllIlII("FBI8Ai4GZTgYOBUWIw8=", "YWpGk");
        lIlIlIIIlIlII[lIlIlIIIlllII[38]] = lIllllIlIllIlII("KwMBLhU5FRkqFiAZDjkFNQ4SWQ==", "fFMkP");
        lIlIlIIIlIlII[lIlIlIIIlllII[40]] = lIllllIlIllIIll("hc2M3/JIXliUsXeFsYcEDf2M8gPWREel", "QRUuF");
        lIlIlIIIlIlII[lIlIlIIIlllII[42]] = lIllllIlIllIlIl("3NoJDDN66JyWGzkreOyzJw==", "hhMVg");
        lIlIlIIIlIlII[lIlIlIIIlllII[44]] = lIllllIlIllIIll("DyrJOVzgUgpmudBYutr6dg==", "KOthv");
        lIlIlIIIlIlII[lIlIlIIIlllII[46]] = lIllllIlIllIlIl("Mz3tFxB92xooq0BRrdMfguZOlDQNHAtn", "Eyvni");
        lIlIlIIIlIlII[lIlIlIIIlllII[48]] = lIllllIlIllIlII("DjIHCyAcJBsLJBEoCBwwED8=", "CwKNe");
        lIlIlIIIlIlII[lIlIlIIIlllII[50]] = lIllllIlIllIlII("PiEoCyQsNzAPJzU7NwIgICw=", "sddNa");
        lIlIlIIIlIlII[lIlIlIIIlllII[52]] = lIllllIlIllIlIl("JLQ4Ly/S0FaKbt46UXZ5rjI4tiatIMTh", "waqap");
        lIlIlIIIlIlII[lIlIlIIIlllII[54]] = lIllllIlIllIlIl("3ASP3l8TuIblioUS2gskvBC2jIsVYe3m", "sGbWB");
        lIlIlIIIlIlII[lIlIlIIIlllII[56]] = lIllllIlIllIIll("GstKM+vmzfU3hLzIaeXtVTkIgrG1ppi/nAyS5LUCK68=", "JsPxz");
        lIlIlIIIlIlII[lIlIlIIIlllII[58]] = lIllllIlIllIlII("CgE7LioYACUqKAgKKDwuFQw2JiICFig4PwIH", "GDwko");
        lIlIlIIIlIlII[lIlIlIIIlllII[60]] = lIllllIlIllIlIl("T9ODnxx4SFyGYWoXzmT2p/bLNbD9nB9I", "JsNgA");
        lIlIlIIIlIlII[lIlIlIIIlllII[62]] = lIllllIlIllIIll("W/nq29FtbEtpZ/8rbT+qhjvjhPm0ynI3", "xjGOI");
        lIlIlIIIlIlII[lIlIlIIIlllII[64]] = lIllllIlIllIIll("J3qeHUkLvEIZRKrEkcW7RTmvpg1MBYCo", "xnaEt");
        lIlIlIIIlIlII[lIlIlIIIlllII[66]] = lIllllIlIllIlIl("xol80lrl4WnAD/j6yOQISRnFkMwKhhzZ2GBpFwqAEsQ=", "MtEMh");
        lIlIlIIIlIlII[lIlIlIIIlllII[68]] = lIllllIlIllIlIl("VynvKJjFwPkyiMTZeX/6glkEp29bK6s386EKSwHAwtU=", "aFXdT");
        lIlIlIIIlIlII[lIlIlIIIlllII[70]] = lIllllIlIllIlII("PQciHxYvAyYIGj0RMQkHMQQoBRAiFz0S", "pBnZS");
        lIlIlIIIlIlII[lIlIlIIIlllII[72]] = lIllllIlIllIlII("Kys1Fgc5ITsRGzkjOAYOOS0rBhEu", "fnySB");
        lIlIlIIIlIlII[lIlIlIIIlllII[74]] = lIllllIlIllIIll("/SgDbJWr0XZfVFBp+2W/rQjZfV04yqg+jo2qaZr1EXI=", "IVyHK");
        lIlIlIIIlIlII[lIlIlIIIlllII[76]] = lIllllIlIllIIll("64vVlTx6R5TcEJ5py7+iOtbvcmQA2+L+TZK6/m9p24A=", "ELHKb");
        lIlIlIIIlIlII[lIlIlIIIlllII[78]] = lIllllIlIllIlIl("Ytgbccmju2R2CYY8/vzCA+841LqIYQz11aB5EtzvHzl3BgyaVLflrA==", "vFBeF");
        lIlIlIIIlIlII[lIlIlIIIlllII[80]] = lIllllIlIllIIll("jfGGJjw2lOeNMT9ariJro2hJ6XMwwqWc", "RVhmO");
        lIlIlIIIlIlII[lIlIlIIIlllII[82]] = lIllllIlIllIlII("FRcjAhIHEC4VBR0eLA8SCwYwBhkbGiAVCBsAOhQf", "XRoGW");
        lIlIlIIIlIlII[lIlIlIIIlllII[84]] = lIllllIlIllIIll("WbmmivSXK36ux26csAXYnd86AKsZRrqpZtrjSCJBbh4qV6ROVA7YEw==", "zywAM");
        lIlIlIIIlIlII[lIlIlIIIlllII[86]] = lIllllIlIllIlIl("OYFP+J/RknUgkCSwPB9HZHiASe8dGdh+", "dZOcQ");
        lIlIlIIIlIlII[lIlIlIIIlllII[88]] = lIllllIlIllIIll("YU3O3cZVXaKTeoPoZcvYZ8G0zL2P5+Ss", "dHYqW");
        lIlIlIIIlIlII[lIlIlIIIlllII[90]] = lIllllIlIllIlII("Fy4LKxwFLAgqCg0kFSoGHi4BKxcJIhEr", "ZkGnY");
        lIlIlIIIlIlII[lIlIlIIIlllII[92]] = lIllllIlIllIlII("GzEHJj0JMBkiPxk6FCA0FyMYPCsGMQg=", "VtKcx");
        lIlIlIIIlIlII[lIlIlIIIlllII[94]] = lIllllIlIllIlIl("7xUDH1RMpFt5tv54J4bYxA==", "MmWxV");
        lIlIlIIIlIlII[lIlIlIIIlllII[96]] = lIllllIlIllIlII("IjIrJzAwMismMD0oKiMgIw==", "owgbu");
        lIlIlIIIlIlII[lIlIlIIIlllII[98]] = lIllllIlIllIlII("ICw+IQAyMzMpCj8oOTsCIi0hMwo/LS03FSgq", "mirdE");
        lIlIlIIIlIlII[lIlIlIIIlllII[100]] = lIllllIlIllIlIl("t+fyR6XNEOPtJg2wi77+XevmKRYTIM9Ub6NSOPEAsEU=", "KCstO");
        lIlIlIIIlIlII[lIlIlIIIlllII[102]] = lIllllIlIllIlIl("sLzbtGNPToxrijp7jdj3oXHZDwkHmak+nBdlEGPH6z0=", "dhmOg");
        lIlIlIIIlIlII[lIlIlIIIlllII[104]] = lIllllIlIllIlIl("ClO8x82Tvl/vmiIIBFv6wNyO5lrNXPWYjOBjP/w2exqVRKLiw9IQow==", "ihsmQ");
        lIlIlIIIlIlII[lIlIlIIIlllII[106]] = lIllllIlIllIlII("PC8cMCMuKBE7Ij45DzIpNTkHOjQ1NQMlIzI=", "qjPuf");
        lIlIlIIIlIlII[lIlIlIIIlllII[108]] = lIllllIlIllIIll("v0aPOqzjL/FxUpr4JK3QKhnrvlPuGZCbcSmfBbjw3Jw=", "ZsZxn");
        lIlIlIIIlIlII[lIlIlIIIlllII[110]] = lIllllIlIllIlII("DA85IS8eCycpKwUTOTstDg4mMyUTDio3OgQJ", "AJudj");
        lIlIlIIIlIlII[lIlIlIIIlllII[112]] = lIllllIlIllIIll("hhr5BkAppe4B44DG4WSi74Ojmvg13pxdZpJfyLUa/I8=", "vqUfF");
        lIlIlIIIlIlII[lIlIlIIIlllII[114]] = lIllllIlIllIIll("xh3HYLFHdTKNrLA0Nt2mcQ==", "HyIEQ");
        lIlIlIIIlIlII[lIlIlIIIlllII[116]] = lIllllIlIllIlIl("ag/Y8oghpsULAR9x2E/z1G3Nmw3DYw9n", "wntbt");
        lIlIlIIIlIlII[lIlIlIIIlllII[118]] = lIllllIlIllIlII("FBwpDicGGCsIKxwXMRQlFh02HC0LHToYMhwa", "YYeKb");
        lIlIlIIIlIlII[lIlIlIIIlllII[120]] = lIllllIlIllIIll("GHUcU8KuvPed4E+4+6PkeoDpdp6zdc4rlf+B0Z4s4Oo=", "ZfRgU");
        lIlIlIIIlIlII[lIlIlIIIlllII[122]] = lIllllIlIllIlIl("rjOsf4UlF/ZWpWh6sIsZ2xYe+IwDts6n", "lVGAH");
        lIlIlIIIlIlII[lIlIlIIIlllII[124]] = lIllllIlIllIlII("OwUULz0tGwkgNzsQGCcv", "iDZhx");
        lIlIlIIIlIlII[lIlIlIIIlllII[126]] = lIllllIlIllIlIl("ugDJVqdxglEUBqdRtq2z2OgOyZG+PzX9", "kEOXL");
        lIlIlIIIlIlII[lIlIlIIIlllII[128]] = lIllllIlIllIIll("5Q8wvMlgOPyFJAJwV9bTEouPNeViJMxGR5rY5Zajv7o=", "TremW");
        lIlIlIIIlIlII[lIlIlIIIlllII[130]] = lIllllIlIllIlIl("hSCjlHWcan98U6B5BLIYyptPnwqnKPtP", "WliAf");
        lIlIlIIIlIlII[lIlIlIIIlllII[132]] = lIllllIlIllIIll("+ylbJIufhg4yHreKEiwQRw==", "ipMWq");
        lIlIlIIIlIlII[lIlIlIIIlllII[134]] = lIllllIlIllIlIl("rLC+JTkwy3793jKfZLQesQ==", "uNgxG");
        lIlIlIIIlIlII[lIlIlIIIlllII[136]] = lIllllIlIllIIll("05lgS68pkJKdFFnX3PJz0A==", "wvXBx");
        lIlIlIIIlIlII[lIlIlIIIlllII[138]] = lIllllIlIllIIll("neMDJaRmj5DMZRTdu82SqewyL9JdI8zo7d09FBLcTEk=", "TucAF");
        lIlIlIIIlIlII[lIlIlIIIlllII[140]] = lIllllIlIllIlII("FiAeCyoAPgIZIQE+Ex4gFzISAzg=", "DaPLo");
        lIlIlIIIlIlII[lIlIlIIIlllII[142]] = lIllllIlIllIIll("YEmVBKHWSduE9NxA73Z094ZRG2+KTDST", "RGspR");
        lIlIlIIIlIlII[lIlIlIIIlllII[144]] = lIllllIlIllIlII("Jy8PLCMxMRM+KDAxCiUvMys=", "unAkf");
        lIlIlIIIlIlII[lIlIlIIIlllII[146]] = lIllllIlIllIlIl("uf99zfpuYSf2ftkCFPYl+EmRH3WJQ4+9", "vuKUu");
        lIlIlIIIlIlII[lIlIlIIIlllII[148]] = lIllllIlIllIlIl("qh8/+Wh0NyaTPLNYvOhqgl2j6Xvq0UDPUH7jYGODsD8=", "TxxGt");
        lIlIlIIIlIlII[lIlIlIIIlllII[150]] = lIllllIlIllIlII("Ow82EAktETwFDS4BNggHJwc+EhM6Hj0U", "iNxWL");
        lIlIlIIIlIlII[lIlIlIIIlllII[152]] = lIllllIlIllIIll("3sPIaHvkQpO4MoZIAcic6T6yPVQ6NSJs", "CNQgX");
        lIlIlIIIlIlII[lIlIlIIIlllII[154]] = lIllllIlIllIlIl("uPkwfn1lMnVibTIs8H4t36iCIRkgCPdHA48YSvDf+JA=", "cEYYa");
        lIlIlIIIlIlII[lIlIlIIIlllII[156]] = lIllllIlIllIlII("BRMJGxcXARoTGgwTHBYLChsAFg==", "HRNRT");
        lIlIlIIIlIlII[lIlIlIIIlllII[158]] = lIllllIlIllIlII("CDUhMSwaJzI5IQE1NDwwFiA0MSQAKyQ3IxErJDQuFiA=", "Etfxo");
        lIlIlIIIlIlII[lIlIlIIIlllII[160]] = lIllllIlIllIlIl("kG9HIhUjSLz+yT2x2xR0Nts099pD+OJrF5cBttLOY9w=", "aaonO");
        lIlIlIIIlIlII[lIlIlIIIlllII[162]] = lIllllIlIllIlIl("xxhM6lBpzU209O4fqvFbAUP4jqp9FQe96Y0w9gZj0SPRn56ZZTJHhQ==", "VcSAc");
        lIlIlIIIlIlII[lIlIlIIIlllII[164]] = lIllllIlIllIIll("v7eFl7cdhU4CHMhyzgJBdLHMvSe/CMcMgx5JFKuqLf0=", "SRChg");
        lIlIlIIIlIlII[lIlIlIIIlllII[166]] = lIllllIlIllIlII("HisQJygMOQMvJRcrBSo0AD8FKS4MOQMvLRU=", "SjWnk");
        lIlIlIIIlIlII[lIlIlIIIlllII[168]] = lIllllIlIllIIll("3SF8OfddWToxyBZuE9pqz/iEWB1fGc3+aEBacEjTtcc=", "ZioVt");
        lIlIlIIIlIlII[lIlIlIIIlllII[170]] = lIllllIlIllIIll("TnI3uqmozJg/gFSr43hPtPhhFKnlWqd0iD9NVyYpb74=", "BwuvR");
        lIlIlIIIlIlII[lIlIlIIIlllII[172]] = lIllllIlIllIlII("Cy8jBiEZOCsDIxInKAo9CCcjBzYLLzYKPRU6JQkkGT00CiE=", "FndOb");
        lIlIlIIIlIlII[lIlIlIIIlllII[174]] = lIllllIlIllIlII("OAAhDAYqFTMIAD4EKBYaJgknAQoi", "uAfEE");
    }

    private static boolean lIllllIllIlIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    private i(String str, int i, int i2, j jVar, int i3) {
        if (lIllllIllIIlllI(jVar)) {
            throw new InvalidParameterException(lIlIlIIIlIlII[lIlIlIIIlllII[2]]);
        }
        this.animationId = i2;
        this.attackStyle = jVar;
        this.isSpecial = lIlIlIIIlllII[0];
        this.baseSpellDamage = i3;
    }

    public static i d(int i) {
        return DATA.get(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public static boolean a(i iVar) {
        if (lIllllIllIIllll(iVar, MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF) && lIllllIllIIllll(iVar, MAGIC_STANDARD_WAVE_STAFF) && !lIllllIllIlIIII(iVar, MAGIC_STANDARD_SURGE_STAFF)) {
            return lIlIlIIIlllII[0];
        }
        ?? r0 = lIlIlIIIlllII[1];
        "".length();
        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static String lIllllIlIllIlIl(String llllllllllllllIllIllIIIIIlllIIll, String llllllllllllllIllIllIIIIIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIIIIlllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIIIIlllIlIl.init(lIlIlIIIlllII[2], secretKeySpec);
            return new String(llllllllllllllIllIllIIIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllIIIIIlllIlII) {
            llllllllllllllIllIllIIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIllIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllllIllIlIIlI(int i) {
        return i <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    private i(String str, int i, int i2, j jVar) {
        if (lIllllIllIIlllI(jVar)) {
            throw new InvalidParameterException(lIlIlIIIlIlII[lIlIlIIIlllII[0]]);
        }
        this.animationId = i2;
        this.attackStyle = jVar;
        this.isSpecial = lIlIlIIIlllII[0];
        this.baseSpellDamage = lIlIlIIIlllII[0];
    }
}
