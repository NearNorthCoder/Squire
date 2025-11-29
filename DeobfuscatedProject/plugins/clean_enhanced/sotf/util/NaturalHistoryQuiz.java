package gg.squire.sotf.util;

import com.google.common.collect.ImmutableMap;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.widgets.Widgets;

import java.util.Map;

/**
 * Enum representing all questions and answers for the Natural History Quiz in the Varrock Museum.
 *
 * <p>This quiz is part of the RuneScape quest system and tests knowledge about
 * various creatures in the game world.
 */
public enum NaturalHistoryQuiz {

    // Lizard questions
    LIZARD_1("How does a lizard regulate body heat?", "Sunlight."),
    LIZARD_2("Who discovered how to kill lizards?", "The Slayer Masters."),
    LIZARD_3("How many eyes does a lizard have?", "Three."),
    LIZARD_4("What order do lizards belong to?", "Squamata."),
    LIZARD_5("What happens when a lizard becomes cold?", "It becomes sleepy."),
    LIZARD_6("Lizard skin is made of the same substance as?", "Hair."),

    // Tortoise questions
    TORTOISE_1("What is the name of the oldest tortoise ever recorded?", "Mibbiwocket."),
    TORTOISE_2("What is a tortoise's favourite food?", "Vegetables."),
    TORTOISE_3("Name the explorer who discovered the world's oldest tortoise.", "Admiral Bake."),
    TORTOISE_4("How does the tortoise protect itself?", "Hard shell."),
    TORTOISE_5("If a tortoise had twenty rings on its shell, how old would it be?", "Twenty years."),
    TORTOISE_6("Which race breeds tortoises for battle?", "Gnomes."),

    // Dragon questions
    DRAGON_1("What is considered a delicacy by dragons?", "Runite."),
    DRAGON_2("What is the best defence against a dragon's attack?", "Anti dragon-breath shield."),
    DRAGON_3("How long do dragons live?", "Unknown."),
    DRAGON_4("Which of these is not a type of dragon?", "Elemental."),
    DRAGON_5("What is the favoured territory of a dragon?", "Old battle sites."),
    DRAGON_6("Approximately how many feet tall do dragons stand?", "Twelve."),

    // Wyvern questions
    WYVERN_1("How did the wyverns die out?", "Climate change."),
    WYVERN_2("How many legs does a wyvern have?", "Two."),
    WYVERN_3("Where have wyvern bones been found?", "Asgarnia."),
    WYVERN_4("Which genus does the wyvern theoretically belong to?", "Reptiles."),
    WYVERN_5("What are the wyverns' closest relations?", "Dragons."),
    WYVERN_6("What is the ambient temperature of wyvern bones?", "Below room temperature."),

    // Snail questions
    SNAIL_1("What is special about the shell of the giant Morytanian snail?", "It is resistant to acid."),
    SNAIL_2("How do Morytanian snails capture their prey?", "Spitting acid."),
    SNAIL_3("Which of these is a snail byproduct?", "Fireproof oil."),
    SNAIL_4("What does 'Achatina Acidia' mean?", "Acid-spitting snail."),
    SNAIL_5("How do snails move?", "Contracting and stretching."),
    SNAIL_6("What is the 'trapdoor', which snails use to cover the entrance to their shells called?", "An operculum."),

    // Snake questions
    SNAKE_1("What is snake venom adapted from?", "Stomach acid."),
    SNAKE_2("Aside from their noses, what do snakes use to smell?", "Tongue."),
    SNAKE_3("If a snake sticks its tongue out at you, what is it doing?", "Seeing how you smell."),
    SNAKE_4("If some snakes use venom to kill their prey, what do other snakes use?", "Constriction."),
    SNAKE_5("Lizards and snakes belong to the same order - what is it?", "Squamata."),
    SNAKE_6("Which habitat do snakes prefer?", "Anywhere."),

    // Slug questions
    SLUG_1("We assume that sea slugs have a stinging organ on their soft skin - what is it called?", "Nematocysts."),
    SLUG_2("Why has the museum never examined a live sea slug?", "The researchers keep vanishing."),
    SLUG_3("What do we think the sea slug feeds upon?", "Seaweed."),
    SLUG_4("What are the two fangs presumed to be used for?", "Defense or display."),
    SLUG_5("Off of which coastline would you find sea slugs?", "Ardougne."),
    SLUG_6("In what way are sea slugs similar to snails?", "They have a hard shell."),

    // Monkey questions
    MONKEY_1("Which type of primates do monkeys belong to?", "Simian."),
    MONKEY_2("Which have the lighter colour: Karamjan or Harmless monkeys?", "Harmless."),
    MONKEY_3("Monkeys love bananas. What else do they like to eat?", "Bitternuts."),
    MONKEY_4("There are two known families of monkeys. One is Karamjan, the other is...?", "Harmless."),
    MONKEY_5("What colour mohawk do Karamjan monkeys have?", "Red."),
    MONKEY_6("What have Karamjan monkeys taken a deep dislike to?", "Seaweed."),

    // Kalphite questions
    KALPHITE_1("Kalphites are ruled by a...?", "Pasha."),
    KALPHITE_2("What is the lowest caste in kalphite society?", "Worker."),
    KALPHITE_3("What are the armoured plates on a kalphite called?", "Lamellae."),
    KALPHITE_4("Are kalphites carnivores, herbivores or omnivores?", "Carnivores."),
    KALPHITE_5("What are kalphites assumed to have evolved from?", "Scarab beetles."),
    KALPHITE_6("Name the prominent figure in kalphite mythology?", "Scabaras."),

    // Terrorbird questions
    TERRORBIRD_1("What is a terrorbird's preferred food?", "Anything."),
    TERRORBIRD_2("Who use terrorbirds as mounts?", "Gnomes."),
    TERRORBIRD_3("Where do terrorbirds get most of their water?", "Eating plants."),
    TERRORBIRD_4("How many claws do terrorbirds have?", "Four."),
    TERRORBIRD_5("What do terrorbirds eat to aid digestion?", "Stones."),
    TERRORBIRD_6("How many teeth do terrorbirds have?", "0."),

    // Penguin questions
    PENGUIN_1("Which sense do penguins rely on when hunting?", "Sight."),
    PENGUIN_2("Which skill seems unusual for the penguins to possess?", "Planning."),
    PENGUIN_3("How do penguins keep warm?", "A layer of fat."),
    PENGUIN_4("What is the preferred climate for penguins?", "Cold."),
    PENGUIN_5("Describe the behaviour of penguins?", "Social."),
    PENGUIN_6("When do penguins fast?", "During breeding."),

    // Mole questions
    MOLE_1("What habitat do moles prefer?", "Subterranean."),
    MOLE_2("Why are moles considered to be an agricultural pest?", "They dig holes."),
    MOLE_3("Who discovered giant moles?", "Wyson the Gardener."),
    MOLE_4("What would you call a group of young moles?", "A labour."),
    MOLE_5("What is a mole's favourite food?", "Insects and other invertebrates."),
    MOLE_6("Which family do moles belong to?", "The Talpidae family."),

    // Camel questions
    CAMEL_1("What is produced by feeding chilli to a camel?", "Toxic dung."),
    CAMEL_2("If an ugthanki has one, how many does a bactrian have?", "Two."),
    CAMEL_3("Camels: herbivore, carnivore or omnivore?", "Omnivore."),
    CAMEL_4("What is the usual mood for a camel?", "Annoyed."),
    CAMEL_5("Where would you find an ugthanki?", "Al Kharid."),
    CAMEL_6("Which camel byproduct is known to be very nutritious?", "Milk."),

    // Leech questions
    LEECH_1("What is the favoured habitat of leeches?", "Water."),
    LEECH_2("What shape is the inside of a leech's mouth?", "'Y'-shaped."),
    LEECH_3("Which of these is not eaten by leeches?", "Apples."),
    LEECH_4("What contributed to the giant growth of Morytanian leeches?", "Environment."),
    LEECH_5("What is special about Morytanian leeches?", "They attack by jumping."),
    LEECH_6("How does a leech change when it feeds?", "It doubles in size.");

    /** Map matching questions to their correct answers */
    private static final Map<String, String> MATCHES;

    static {
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        for (NaturalHistoryQuiz quiz : values()) {
            builder.put(quiz.question, quiz.answer);
        }
        MATCHES = builder.build();
    }

    private final String question;
    private final String answer;

    /**
     * Creates a new quiz entry.
     *
     * @param question The quiz question
     * @param answer The correct answer
     */
    NaturalHistoryQuiz(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    /**
     * Gets the question text.
     *
     * @return The question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Gets the answer text.
     *
     * @return The answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Finds the correct answer for a given question.
     *
     * @param question The question to find an answer for
     * @return The correct answer, or null if not found
     */
    public static String findAnswer(String question) {
        return MATCHES.get(question);
    }

    /**
     * Checks if the current quiz widget is visible.
     *
     * @return true if a quiz question is being displayed
     */
    public static boolean isQuizActive() {
        Widget quizWidget = Widgets.get(WidgetInfo.DIALOG_NPC_TEXT);
        return quizWidget != null && !quizWidget.isHidden();
    }
}
