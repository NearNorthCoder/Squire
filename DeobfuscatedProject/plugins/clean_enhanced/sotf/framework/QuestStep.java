/*
 * Deobfuscated from interface 'ac' in package o.c.k.i.-.l.o.f.-.n.c.t.e.s
 *
 * QuestStep is the core interface that all quest steps implement.
 * The SotfQuestManager maintains a list of QuestStep implementations
 * and executes them in sequence.
 *
 * Original obfuscated methods:
 *   ae() -> arePrerequisitesMet()
 *   af() -> execute()
 *   ag() -> getName()
 *   ah() -> isComplete()
 *   ez() -> isEnabled() (default true)
 */
package gg.squire.sotf.framework;

/**
 * Interface for quest step implementations in the SOTF plugin.
 * Each step represents a discrete portion of a quest that can be
 * checked for completion and executed.
 */
public interface QuestStep {

    /**
     * Check if prerequisites for this step are met.
     * This includes skill requirements, item requirements, and quest state.
     * Original obfuscated method: ae()
     *
     * @return true if all prerequisites are met and step can be started
     */
    boolean arePrerequisitesMet();

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use arePrerequisitesMet() instead
     */
    @Deprecated
    default boolean ae() {
        return arePrerequisitesMet();
    }

    /**
     * Execute this quest step.
     * Performs the actions needed to progress through this step.
     * Original obfuscated method: af()
     *
     * @return Sleep duration in milliseconds before next execution
     */
    int execute();

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use execute() instead
     */
    @Deprecated
    default int af() {
        return execute();
    }

    /**
     * Get the human-readable name of this quest step.
     * Used for logging and UI display.
     * Original obfuscated method: ag()
     *
     * @return The step name
     */
    String getName();

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use getName() instead
     */
    @Deprecated
    default String ag() {
        return getName();
    }

    /**
     * Check if this quest step is complete.
     * When complete, the manager moves to the next step.
     * Original obfuscated method: ah()
     *
     * @return true if step is complete
     */
    boolean isComplete();

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use isComplete() instead
     */
    @Deprecated
    default boolean ah() {
        return isComplete();
    }

    /**
     * Check if this step is enabled and should be executed.
     * Can be overridden to conditionally skip steps.
     * Original obfuscated method: ez()
     *
     * @return true if step should be executed (default: true)
     */
    default boolean isEnabled() {
        return true;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use isEnabled() instead
     */
    @Deprecated
    default boolean ez() {
        return isEnabled();
    }
}
