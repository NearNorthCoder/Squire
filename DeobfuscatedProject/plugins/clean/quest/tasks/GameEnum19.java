/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 */
package gg.squire.quest.tasks;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;

final class GameEnum19
extends Enum<u> {
    public static final  /* enum */ u PENGUIN_4;
    public static final  /* enum */ u TORTOISE_5;
    public static final  /* enum */ u DRAGON_2;
    public static final  /* enum */ u WYVERN_5;
    public static final  /* enum */ u CAMEL_2;
    public static final  /* enum */ u MOLE_6;
    public static final  /* enum */ u CAMEL_3;
    public static final  /* enum */ u MONKEY_4;
    public static final  /* enum */ u MONKEY_6;
    
    public static final  /* enum */ u SLUG_3;
    public static final  /* enum */ u PENGUIN_5;
    public static final  /* enum */ u SNAKE_1;
    public static final  /* enum */ u LEECH_5;
    public static final  /* enum */ u SNAKE_4;
    public static final  /* enum */ u MONKEY_3;
    public static final  /* enum */ u WYVERN_1;
    public static final  /* enum */ u TORTOISE_1;
    public static final  /* enum */ u SNAIL_4;
    public static final  /* enum */ u SLUG_1;
    public static final  /* enum */ u PENGUIN_3;
    public static final  /* enum */ u MOLE_1;
    public static final  /* enum */ u TERRORBIRD_5;
    public static final  /* enum */ u SNAIL_3;
    public static final  /* enum */ u PENGUIN_1;
    public static final  /* enum */ u SLUG_5;
    public static final  /* enum */ u LEECH_1;
    public static final  /* enum */ u LIZARD_1;
    
    public static final  /* enum */ u MOLE_2;
    public static final  /* enum */ u KALPHITE_4;
    public static final  /* enum */ u PENGUIN_6;
    private static final  Map<String, String> MATCHES;
    public static final  /* enum */ u DRAGON_3;
    public static final  /* enum */ u TERRORBIRD_3;
    public static final  /* enum */ u LEECH_2;
    public static final  /* enum */ u LEECH_3;
    public static final  /* enum */ u SNAIL_2;
    public static final  /* enum */ u MOLE_5;
    public static final  /* enum */ u SNAKE_3;
    public static final  /* enum */ u KALPHITE_1;
    private final  String answer;
    public static final  /* enum */ u MOLE_4;
    public static final  /* enum */ u MONKEY_5;
    public static final  /* enum */ u SNAKE_6;
    private static final  u[] $VALUES;
    public static final  /* enum */ u TORTOISE_3;
    public static final  /* enum */ u MONKEY_1;
    public static final  /* enum */ u MONKEY_2;
    public static final  /* enum */ u CAMEL_1;
    public static final  /* enum */ u KALPHITE_6;
    public static final  /* enum */ u SNAKE_2;
    public static final  /* enum */ u PENGUIN_2;
    public static final  /* enum */ u DRAGON_5;
    public static final  /* enum */ u LIZARD_6;
    public static final  /* enum */ u TORTOISE_2;
    public static final  /* enum */ u SLUG_6;
    public static final  /* enum */ u KALPHITE_3;
    public static final  /* enum */ u KALPHITE_5;
    public static final  /* enum */ u SNAIL_5;
    public static final  /* enum */ u DRAGON_4;
    public static final  /* enum */ u LEECH_4;
    public static final  /* enum */ u CAMEL_5;
    public static final  /* enum */ u CAMEL_4;
    public static final  /* enum */ u LIZARD_2;
    public static final  /* enum */ u WYVERN_6;
    public static final  /* enum */ u LIZARD_3;
    public static final  /* enum */ u LIZARD_5;
    public static final  /* enum */ u TERRORBIRD_1;
    public static final  /* enum */ u DRAGON_6;
    public static final  /* enum */ u SLUG_4;
    public static final  /* enum */ u LEECH_6;
    public static final  /* enum */ u TERRORBIRD_6;
    private final  String question;
    public static final  /* enum */ u WYVERN_3;
    public static final  /* enum */ u SLUG_2;
    public static final  /* enum */ u SNAIL_1;
    public static final  /* enum */ u TORTOISE_6;
    public static final  /* enum */ u CAMEL_6;
    public static final  /* enum */ u TORTOISE_4;
    public static final  /* enum */ u LIZARD_4;
    public static final  /* enum */ u SNAIL_6;
    public static final  /* enum */ u TERRORBIRD_2;
    public static final  /* enum */ u MOLE_3;
    public static final  /* enum */ u DRAGON_1;
    public static final  /* enum */ u KALPHITE_2;
    public static final  /* enum */ u SNAKE_5;
    public static final  /* enum */ u WYVERN_4;
    public static final  /* enum */ u WYVERN_2;
    public static final  /* enum */ u TERRORBIRD_4;

    private static void lIlIIIlIIllIllI() {
        lIIIllIIlllIl = new String[lIIIllIlIIIIl[252]];
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[0]] = "LIZARD_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[1]] = "How does a lizard regulate body heat?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[2]] = "Sunlight.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[3]] = "LIZARD_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[4]] = "Who discovered how to kill lizards?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[5]] = "The Slayer Masters.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[6]] = "LIZARD_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[7]] = "How many eyes does a lizard have?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[8]] = "Three.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[9]] = "LIZARD_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[10]] = "What order do lizards belong to?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[11]] = "Squamata.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[12]] = "LIZARD_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[13]] = "What happens when a lizard becomes cold?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[14]] = "It becomes sleepy.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[15]] = "LIZARD_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[16]] = "Lizard skin is made of the same substance as?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[17]] = "Hair.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[18]] = "TORTOISE_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[19]] = "What is the name of the oldest tortoise ever recorded?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[20]] = "Mibbiwocket.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[21]] = "TORTOISE_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[22]] = "What is a tortoise's favourite food?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[23]] = "Vegetables.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[24]] = "TORTOISE_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[25]] = "Name the explorer who discovered the world's oldest tortoise.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[26]] = "Admiral Bake.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[27]] = "TORTOISE_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[28]] = "How does the tortoise protect itself?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[29]] = "Hard shell.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[30]] = "TORTOISE_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[31]] = "If a tortoise had twenty rings on its shell, how old would it be?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[32]] = "Twenty years.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[33]] = "TORTOISE_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[34]] = "Which race breeds tortoises for battle?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[35]] = "Gnomes.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[36]] = "DRAGON_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[37]] = "What is considered a delicacy by dragons?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[38]] = "Runite.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[39]] = "DRAGON_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[40]] = "What is the best defence against a dragon's attack?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[41]] = "Anti dragon-breath shield.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[42]] = "DRAGON_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[43]] = "How long do dragons live?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[44]] = "Unknown.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[45]] = "DRAGON_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[46]] = "Which of these is not a type of dragon?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[47]] = "Elemental.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[48]] = "DRAGON_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[49]] = "What is the favoured territory of a dragon?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[50]] = "Old battle sites.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[51]] = "DRAGON_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[52]] = "Approximately how many feet tall do dragons stand?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[53]] = "Twelve.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[54]] = "WYVERN_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[55]] = "How did the wyverns die out?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[56]] = "Climate change.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[57]] = "WYVERN_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[58]] = "How many legs does a wyvern have?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[59]] = "Two.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[60]] = "WYVERN_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[61]] = "Where have wyvern bones been found?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[62]] = "Asgarnia.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[63]] = "WYVERN_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[64]] = "Which genus does the wyvern theoretically belong to?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[65]] = "Reptiles.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[66]] = "WYVERN_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[67]] = "What are the wyverns' closest relations?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[68]] = "Dragons.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[69]] = "WYVERN_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[70]] = "What is the ambient temperature of wyvern bones?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[71]] = "Below room temperature.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[72]] = "SNAIL_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[73]] = "What is special about the shell of the giant Morytanian snail?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[74]] = "It is resistant to acid.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[75]] = "SNAIL_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[76]] = "How do Morytanian snails capture their prey?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[77]] = "Spitting acid.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[78]] = "SNAIL_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[79]] = "Which of these is a snail byproduct?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[80]] = "Fireproof oil.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[81]] = "SNAIL_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[82]] = "What does 'Achatina Acidia' mean?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[83]] = "Acid-spitting snail.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[84]] = "SNAIL_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[85]] = "How do snails move?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[86]] = "Contracting and stretching.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[87]] = "SNAIL_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[88]] = "What is the 'trapdoor', which snails use to cover the entrance to their shells called?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[89]] = "An operculum.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[90]] = "SNAKE_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[91]] = "What is snake venom adapted from?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[92]] = "Stomach acid.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[93]] = "SNAKE_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[94]] = "Aside from their noses, what do snakes use to smell?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[95]] = "Tongue.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[96]] = "SNAKE_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[97]] = "If a snake sticks its tongue out at you, what is it doing?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[98]] = "Seeing how you smell.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[99]] = "SNAKE_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[100]] = "If some snakes use venom to kill their prey, what do other snakes use?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[101]] = "Constriction.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[102]] = "SNAKE_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[103]] = "Lizards and snakes belong to the same order - what is it?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[104]] = "Squamata.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[105]] = "SNAKE_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[106]] = "Which habitat do snakes prefer?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[107]] = "Anywhere.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[108]] = "SLUG_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[109]] = "We assume that sea slugs have a stinging organ on their soft skin - what is it called?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[110]] = "Nematocysts.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[111]] = "SLUG_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[112]] = "Why has the museum never examined a live sea slug?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[113]] = "The researchers keep vanishing.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[114]] = "SLUG_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[115]] = "What do we think the sea slug feeds upon?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[116]] = "Seaweed.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[117]] = "SLUG_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[118]] = "What are the two fangs presumed to be used for?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[119]] = "Defense or display.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[120]] = "SLUG_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[121]] = "Off of which coastline would you find sea slugs?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[122]] = "Ardougne.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[123]] = "SLUG_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[124]] = "In what way are sea slugs similar to snails?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[125]] = "They have a hard shell.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[126]] = "MONKEY_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[127]] = "Which type of primates do monkeys belong to?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[128]] = "Simian.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[129]] = "MONKEY_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[130]] = "Which have the lighter colour: Karamjan or Harmless monkeys?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[131]] = "Harmless.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[132]] = "MONKEY_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[133]] = "Monkeys love bananas. What else do they like to eat?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[134]] = "Bitternuts.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[135]] = "MONKEY_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[136]] = "There are two known families of monkeys. One is Karamjan, the other is...?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[137]] = "Harmless.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[138]] = "MONKEY_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[139]] = "What colour mohawk do Karamjan monkeys have?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[140]] = "Red.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[141]] = "MONKEY_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[142]] = "What have Karamjan monkeys taken a deep dislike to?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[143]] = "Seaweed.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[144]] = "KALPHITE_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[145]] = "Kalphites are ruled by a...?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[146]] = "Pasha.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[147]] = "KALPHITE_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[148]] = "What is the lowest caste in kalphite society?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[149]] = "Worker.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[150]] = "KALPHITE_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[151]] = "What are the armoured plates on a kalphite called?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[152]] = "Lamellae.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[153]] = "KALPHITE_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[154]] = "Are kalphites carnivores, herbivores or omnivores?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[155]] = "Carnivores.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[156]] = "KALPHITE_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[157]] = "What are kalphites assumed to have evolved from?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[158]] = "Scarab beetles.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[159]] = "KALPHITE_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[160]] = "Name the prominent figure in kalphite mythology?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[161]] = "Scabaras.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[162]] = "TERRORBIRD_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[163]] = "What is a terrorbird's preferred food?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[164]] = "Anything.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[165]] = "TERRORBIRD_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[166]] = "Who use terrorbirds as mounts?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[167]] = "Gnomes.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[168]] = "TERRORBIRD_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[169]] = "Where do terrorbirds get most of their water?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[170]] = "Eating plants.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[171]] = "TERRORBIRD_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[172]] = "How many claws do terrorbirds have?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[173]] = "Four.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[174]] = "TERRORBIRD_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[175]] = "What do terrorbirds eat to aid digestion?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[176]] = "Stones.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[177]] = "TERRORBIRD_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[178]] = "How many teeth do terrorbirds have?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[179]] = "0.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[180]] = "PENGUIN_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[181]] = "Which sense do penguins rely on when hunting?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[182]] = "Sight.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[183]] = "PENGUIN_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[184]] = "Which skill seems unusual for the penguins to possess?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[185]] = "Planning.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[186]] = "PENGUIN_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[187]] = "How do penguins keep warm?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[188]] = "A layer of fat.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[189]] = "PENGUIN_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[190]] = "What is the preferred climate for penguins?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[191]] = "Cold.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[192]] = "PENGUIN_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[193]] = "Describe the behaviour of penguins?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[194]] = "Social.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[195]] = "PENGUIN_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[196]] = "When do penguins fast?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[197]] = "During breeding.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[198]] = "MOLE_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[199]] = "What habitat do moles prefer?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[200]] = "Subterranean.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[201]] = "MOLE_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[202]] = "Why are moles considered to be an agricultural pest?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[203]] = "They dig holes.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[204]] = "MOLE_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[205]] = "Who discovered giant moles?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[206]] = "Wyson the Gardener.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[207]] = "MOLE_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[208]] = "What would you call a group of young moles?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[209]] = "A labour.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[210]] = "MOLE_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[211]] = "What is a mole's favourite food?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[212]] = "Insects and other invertebrates.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[213]] = "MOLE_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[214]] = "Which family do moles belong to?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[215]] = "The Talpidae family.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[216]] = "CAMEL_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[217]] = "What is produced by feeding chilli to a camel?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[218]] = "Toxic dung.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[219]] = "CAMEL_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[220]] = "If an ugthanki has one, how many does a bactrian have?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[221]] = "Two.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[222]] = "CAMEL_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[223]] = "Camels: herbivore, carnivore or omnivore?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[224]] = "Omnivore.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[225]] = "CAMEL_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[226]] = "What is the usual mood for a camel?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[227]] = "Annoyed.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[228]] = "CAMEL_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[229]] = "Where would you find an ugthanki?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[230]] = "Al Kharid.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[231]] = "CAMEL_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[232]] = "Which camel byproduct is known to be very nutritious?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[233]] = "Milk.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[234]] = "LEECH_1";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[235]] = "What is the favoured habitat of leeches?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[236]] = "Water.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[237]] = "LEECH_2";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[238]] = "What shape is the inside of a leech's mouth?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[239]] = "'Y'-shaped.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[240]] = "LEECH_3";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[241]] = "Which of these is not eaten by leeches?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[242]] = "Apples.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[243]] = "LEECH_4";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[244]] = "What contributed to the giant growth of Morytanian leeches?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[245]] = "Environment.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[246]] = "LEECH_5";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[247]] = "What is special about Morytanian leeches?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[248]] = "They attack by jumping.";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[249]] = "LEECH_6";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[250]] = "How does a leech change when it feeds?";
        u.lIIIllIIlllIl[u.lIIIllIlIIIIl[251]] = "It doubles in size.";
    }

    public static u valueOf(String string) {
        return Enum.valueOf(GameEnum19.class, string);
    }

    public static u[] values() {
        return (u[])$VALUES.clone();
    }

    public String bh() {
        return this.question;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void var1;
            u.lIlIIIlIlIIIIlI();
            u.lIlIIIlIIllIllI();
            LIZARD_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[1]], lIIIllIIlllIl[lIIIllIlIIIIl[2]]);
            LIZARD_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[4]], lIIIllIIlllIl[lIIIllIlIIIIl[5]]);
            LIZARD_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[7]], lIIIllIIlllIl[lIIIllIlIIIIl[8]]);
            LIZARD_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[10]], lIIIllIIlllIl[lIIIllIlIIIIl[11]]);
            LIZARD_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[13]], lIIIllIIlllIl[lIIIllIlIIIIl[14]]);
            LIZARD_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[16]], lIIIllIIlllIl[lIIIllIlIIIIl[17]]);
            TORTOISE_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[19]], lIIIllIIlllIl[lIIIllIlIIIIl[20]]);
            TORTOISE_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[22]], lIIIllIIlllIl[lIIIllIlIIIIl[23]]);
            TORTOISE_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[25]], lIIIllIIlllIl[lIIIllIlIIIIl[26]]);
            TORTOISE_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[28]], lIIIllIIlllIl[lIIIllIlIIIIl[29]]);
            TORTOISE_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[31]], lIIIllIIlllIl[lIIIllIlIIIIl[32]]);
            TORTOISE_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[34]], lIIIllIIlllIl[lIIIllIlIIIIl[35]]);
            DRAGON_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[37]], lIIIllIIlllIl[lIIIllIlIIIIl[38]]);
            DRAGON_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[40]], lIIIllIIlllIl[lIIIllIlIIIIl[41]]);
            DRAGON_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[43]], lIIIllIIlllIl[lIIIllIlIIIIl[44]]);
            DRAGON_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[46]], lIIIllIIlllIl[lIIIllIlIIIIl[47]]);
            DRAGON_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[49]], lIIIllIIlllIl[lIIIllIlIIIIl[50]]);
            DRAGON_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[52]], lIIIllIIlllIl[lIIIllIlIIIIl[53]]);
            WYVERN_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[55]], lIIIllIIlllIl[lIIIllIlIIIIl[56]]);
            WYVERN_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[58]], lIIIllIIlllIl[lIIIllIlIIIIl[59]]);
            WYVERN_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[61]], lIIIllIIlllIl[lIIIllIlIIIIl[62]]);
            WYVERN_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[64]], lIIIllIIlllIl[lIIIllIlIIIIl[65]]);
            WYVERN_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[67]], lIIIllIIlllIl[lIIIllIlIIIIl[68]]);
            WYVERN_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[70]], lIIIllIIlllIl[lIIIllIlIIIIl[71]]);
            SNAIL_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[73]], lIIIllIIlllIl[lIIIllIlIIIIl[74]]);
            SNAIL_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[76]], lIIIllIIlllIl[lIIIllIlIIIIl[77]]);
            SNAIL_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[79]], lIIIllIIlllIl[lIIIllIlIIIIl[80]]);
            SNAIL_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[82]], lIIIllIIlllIl[lIIIllIlIIIIl[83]]);
            SNAIL_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[85]], lIIIllIIlllIl[lIIIllIlIIIIl[86]]);
            SNAIL_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[88]], lIIIllIIlllIl[lIIIllIlIIIIl[89]]);
            SNAKE_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[91]], lIIIllIIlllIl[lIIIllIlIIIIl[92]]);
            SNAKE_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[94]], lIIIllIIlllIl[lIIIllIlIIIIl[95]]);
            SNAKE_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[97]], lIIIllIIlllIl[lIIIllIlIIIIl[98]]);
            SNAKE_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[100]], lIIIllIIlllIl[lIIIllIlIIIIl[101]]);
            SNAKE_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[103]], lIIIllIIlllIl[lIIIllIlIIIIl[104]]);
            SNAKE_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[106]], lIIIllIIlllIl[lIIIllIlIIIIl[107]]);
            SLUG_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[109]], lIIIllIIlllIl[lIIIllIlIIIIl[110]]);
            SLUG_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[112]], lIIIllIIlllIl[lIIIllIlIIIIl[113]]);
            SLUG_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[115]], lIIIllIIlllIl[lIIIllIlIIIIl[116]]);
            SLUG_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[118]], lIIIllIIlllIl[lIIIllIlIIIIl[119]]);
            SLUG_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[121]], lIIIllIIlllIl[lIIIllIlIIIIl[122]]);
            SLUG_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[124]], lIIIllIIlllIl[lIIIllIlIIIIl[125]]);
            MONKEY_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[127]], lIIIllIIlllIl[lIIIllIlIIIIl[128]]);
            MONKEY_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[130]], lIIIllIIlllIl[lIIIllIlIIIIl[131]]);
            MONKEY_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[133]], lIIIllIIlllIl[lIIIllIlIIIIl[134]]);
            MONKEY_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[136]], lIIIllIIlllIl[lIIIllIlIIIIl[137]]);
            MONKEY_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[139]], lIIIllIIlllIl[lIIIllIlIIIIl[140]]);
            MONKEY_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[142]], lIIIllIIlllIl[lIIIllIlIIIIl[143]]);
            KALPHITE_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[145]], lIIIllIIlllIl[lIIIllIlIIIIl[146]]);
            KALPHITE_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[148]], lIIIllIIlllIl[lIIIllIlIIIIl[149]]);
            KALPHITE_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[151]], lIIIllIIlllIl[lIIIllIlIIIIl[152]]);
            KALPHITE_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[154]], lIIIllIIlllIl[lIIIllIlIIIIl[155]]);
            KALPHITE_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[157]], lIIIllIIlllIl[lIIIllIlIIIIl[158]]);
            KALPHITE_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[160]], lIIIllIIlllIl[lIIIllIlIIIIl[161]]);
            TERRORBIRD_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[163]], lIIIllIIlllIl[lIIIllIlIIIIl[164]]);
            TERRORBIRD_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[166]], lIIIllIIlllIl[lIIIllIlIIIIl[167]]);
            TERRORBIRD_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[169]], lIIIllIIlllIl[lIIIllIlIIIIl[170]]);
            TERRORBIRD_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[172]], lIIIllIIlllIl[lIIIllIlIIIIl[173]]);
            TERRORBIRD_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[175]], lIIIllIIlllIl[lIIIllIlIIIIl[176]]);
            TERRORBIRD_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[178]], lIIIllIIlllIl[lIIIllIlIIIIl[179]]);
            PENGUIN_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[181]], lIIIllIIlllIl[lIIIllIlIIIIl[182]]);
            PENGUIN_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[184]], lIIIllIIlllIl[lIIIllIlIIIIl[185]]);
            PENGUIN_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[187]], lIIIllIIlllIl[lIIIllIlIIIIl[188]]);
            PENGUIN_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[190]], lIIIllIIlllIl[lIIIllIlIIIIl[191]]);
            PENGUIN_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[193]], lIIIllIIlllIl[lIIIllIlIIIIl[194]]);
            PENGUIN_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[196]], lIIIllIIlllIl[lIIIllIlIIIIl[197]]);
            MOLE_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[199]], lIIIllIIlllIl[lIIIllIlIIIIl[200]]);
            MOLE_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[202]], lIIIllIIlllIl[lIIIllIlIIIIl[203]]);
            MOLE_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[205]], lIIIllIIlllIl[lIIIllIlIIIIl[206]]);
            MOLE_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[208]], lIIIllIIlllIl[lIIIllIlIIIIl[209]]);
            MOLE_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[211]], lIIIllIIlllIl[lIIIllIlIIIIl[212]]);
            MOLE_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[214]], lIIIllIIlllIl[lIIIllIlIIIIl[215]]);
            CAMEL_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[217]], lIIIllIIlllIl[lIIIllIlIIIIl[218]]);
            CAMEL_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[220]], lIIIllIIlllIl[lIIIllIlIIIIl[221]]);
            CAMEL_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[223]], lIIIllIIlllIl[lIIIllIlIIIIl[224]]);
            CAMEL_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[226]], lIIIllIIlllIl[lIIIllIlIIIIl[227]]);
            CAMEL_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[229]], lIIIllIIlllIl[lIIIllIlIIIIl[230]]);
            CAMEL_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[232]], lIIIllIIlllIl[lIIIllIlIIIIl[233]]);
            LEECH_1 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[235]], lIIIllIIlllIl[lIIIllIlIIIIl[236]]);
            LEECH_2 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[238]], lIIIllIIlllIl[lIIIllIlIIIIl[239]]);
            LEECH_3 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[241]], lIIIllIIlllIl[lIIIllIlIIIIl[242]]);
            LEECH_4 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[244]], lIIIllIIlllIl[lIIIllIlIIIIl[245]]);
            LEECH_5 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[247]], lIIIllIIlllIl[lIIIllIlIIIIl[248]]);
            LEECH_6 = new GameEnum19(lIIIllIIlllIl[lIIIllIlIIIIl[250]], lIIIllIIlllIl[lIIIllIlIIIIl[251]]);
            u[] uArray = new u[lIIIllIlIIIIl[84]];
            uArray[u.lIIIllIlIIIIl[0]] = LIZARD_1;
            uArray[u.lIIIllIlIIIIl[1]] = LIZARD_2;
            uArray[u.lIIIllIlIIIIl[2]] = LIZARD_3;
            uArray[u.lIIIllIlIIIIl[3]] = LIZARD_4;
            uArray[u.lIIIllIlIIIIl[4]] = LIZARD_5;
            uArray[u.lIIIllIlIIIIl[5]] = LIZARD_6;
            uArray[u.lIIIllIlIIIIl[6]] = TORTOISE_1;
            uArray[u.lIIIllIlIIIIl[7]] = TORTOISE_2;
            uArray[u.lIIIllIlIIIIl[8]] = TORTOISE_3;
            uArray[u.lIIIllIlIIIIl[9]] = TORTOISE_4;
            uArray[u.lIIIllIlIIIIl[10]] = TORTOISE_5;
            uArray[u.lIIIllIlIIIIl[11]] = TORTOISE_6;
            uArray[u.lIIIllIlIIIIl[12]] = DRAGON_1;
            uArray[u.lIIIllIlIIIIl[13]] = DRAGON_2;
            uArray[u.lIIIllIlIIIIl[14]] = DRAGON_3;
            uArray[u.lIIIllIlIIIIl[15]] = DRAGON_4;
            uArray[u.lIIIllIlIIIIl[16]] = DRAGON_5;
            uArray[u.lIIIllIlIIIIl[17]] = DRAGON_6;
            uArray[u.lIIIllIlIIIIl[18]] = WYVERN_1;
            uArray[u.lIIIllIlIIIIl[19]] = WYVERN_2;
            uArray[u.lIIIllIlIIIIl[20]] = WYVERN_3;
            uArray[u.lIIIllIlIIIIl[21]] = WYVERN_4;
            uArray[u.lIIIllIlIIIIl[22]] = WYVERN_5;
            uArray[u.lIIIllIlIIIIl[23]] = WYVERN_6;
            uArray[u.lIIIllIlIIIIl[24]] = SNAIL_1;
            uArray[u.lIIIllIlIIIIl[25]] = SNAIL_2;
            uArray[u.lIIIllIlIIIIl[26]] = SNAIL_3;
            uArray[u.lIIIllIlIIIIl[27]] = SNAIL_4;
            uArray[u.lIIIllIlIIIIl[28]] = SNAIL_5;
            uArray[u.lIIIllIlIIIIl[29]] = SNAIL_6;
            uArray[u.lIIIllIlIIIIl[30]] = SNAKE_1;
            uArray[u.lIIIllIlIIIIl[31]] = SNAKE_2;
            uArray[u.lIIIllIlIIIIl[32]] = SNAKE_3;
            uArray[u.lIIIllIlIIIIl[33]] = SNAKE_4;
            uArray[u.lIIIllIlIIIIl[34]] = SNAKE_5;
            uArray[u.lIIIllIlIIIIl[35]] = SNAKE_6;
            uArray[u.lIIIllIlIIIIl[36]] = SLUG_1;
            uArray[u.lIIIllIlIIIIl[37]] = SLUG_2;
            uArray[u.lIIIllIlIIIIl[38]] = SLUG_3;
            uArray[u.lIIIllIlIIIIl[39]] = SLUG_4;
            uArray[u.lIIIllIlIIIIl[40]] = SLUG_5;
            uArray[u.lIIIllIlIIIIl[41]] = SLUG_6;
            uArray[u.lIIIllIlIIIIl[42]] = MONKEY_1;
            uArray[u.lIIIllIlIIIIl[43]] = MONKEY_2;
            uArray[u.lIIIllIlIIIIl[44]] = MONKEY_3;
            uArray[u.lIIIllIlIIIIl[45]] = MONKEY_4;
            uArray[u.lIIIllIlIIIIl[46]] = MONKEY_5;
            uArray[u.lIIIllIlIIIIl[47]] = MONKEY_6;
            uArray[u.lIIIllIlIIIIl[48]] = KALPHITE_1;
            uArray[u.lIIIllIlIIIIl[49]] = KALPHITE_2;
            uArray[u.lIIIllIlIIIIl[50]] = KALPHITE_3;
            uArray[u.lIIIllIlIIIIl[51]] = KALPHITE_4;
            uArray[u.lIIIllIlIIIIl[52]] = KALPHITE_5;
            uArray[u.lIIIllIlIIIIl[53]] = KALPHITE_6;
            uArray[u.lIIIllIlIIIIl[54]] = TERRORBIRD_1;
            uArray[u.lIIIllIlIIIIl[55]] = TERRORBIRD_2;
            uArray[u.lIIIllIlIIIIl[56]] = TERRORBIRD_3;
            uArray[u.lIIIllIlIIIIl[57]] = TERRORBIRD_4;
            uArray[u.lIIIllIlIIIIl[58]] = TERRORBIRD_5;
            uArray[u.lIIIllIlIIIIl[59]] = TERRORBIRD_6;
            uArray[u.lIIIllIlIIIIl[60]] = PENGUIN_1;
            uArray[u.lIIIllIlIIIIl[61]] = PENGUIN_2;
            uArray[u.lIIIllIlIIIIl[62]] = PENGUIN_3;
            uArray[u.lIIIllIlIIIIl[63]] = PENGUIN_4;
            uArray[u.lIIIllIlIIIIl[64]] = PENGUIN_5;
            uArray[u.lIIIllIlIIIIl[65]] = PENGUIN_6;
            uArray[u.lIIIllIlIIIIl[66]] = MOLE_1;
            uArray[u.lIIIllIlIIIIl[67]] = MOLE_2;
            uArray[u.lIIIllIlIIIIl[68]] = MOLE_3;
            uArray[u.lIIIllIlIIIIl[69]] = MOLE_4;
            uArray[u.lIIIllIlIIIIl[70]] = MOLE_5;
            uArray[u.lIIIllIlIIIIl[71]] = MOLE_6;
            uArray[u.lIIIllIlIIIIl[72]] = CAMEL_1;
            uArray[u.lIIIllIlIIIIl[73]] = CAMEL_2;
            uArray[u.lIIIllIlIIIIl[74]] = CAMEL_3;
            uArray[u.lIIIllIlIIIIl[75]] = CAMEL_4;
            uArray[u.lIIIllIlIIIIl[76]] = CAMEL_5;
            uArray[u.lIIIllIlIIIIl[77]] = CAMEL_6;
            uArray[u.lIIIllIlIIIIl[78]] = LEECH_1;
            uArray[u.lIIIllIlIIIIl[79]] = LEECH_2;
            uArray[u.lIIIllIlIIIIl[80]] = LEECH_3;
            uArray[u.lIIIllIlIIIIl[81]] = LEECH_4;
            uArray[u.lIIIllIlIIIIl[82]] = LEECH_5;
            uArray[u.lIIIllIlIIIIl[83]] = LEECH_6;
            $VALUES = uArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            u[] uArray2 = u.values();
            int n2 = uArray2.length;
            int var2 = lIIIllIlIIIIl[0];
            while (u.lIlIIIlIlIIIIll(var2, (int)var1)) {
                void var3;
                void var4;
                void var5 = var4[var2];
                var3.put((Object)var5.question, (Object)var5.answer);

                ++var2;

                if (3 <= (0x7F ^ 0x7B)) continue;
                break block1;
            }
            MATCHES = builder.build();
        }
    }

        return String.valueOf(var6);
    }

    public String bi() {
        return this.answer;
    }

    private static boolean lIlIIIlIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    static Widget a(Client client, String string, int ... nArray) {
        void var7;
        String string2 = MATCHES.get(string);
        int[] nArray2 = nArray;
        int n2 = nArray.length;
        int var8 = lIIIllIlIIIIl[0];
        while (u.lIlIIIlIlIIIIll(var8, (int)var7)) {
            void var9;
            Client var10;
            void var11;
            void var12 = var11[var8];
            Widget var13 = var10.getWidget((int)var12);
            if (u.lIlIIIlIlIIIlII(var13) && u.lIlIIIlIlIIIlIl(var13.getText().equals(var9) ? 1 : 0)) {
                return var13;
            }
            ++var8;

            if (2 >= 0) continue;
            return null;
        }
        return null;
    }

    private static boolean lIlIIIlIlIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIlIIIlII(Object object) {
        return object != null;
    }

    private GameEnum19(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

}

