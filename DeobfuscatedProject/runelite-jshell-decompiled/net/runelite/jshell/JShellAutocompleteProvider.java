/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.fife.ui.autocomplete.BasicCompletion
 *  org.fife.ui.autocomplete.Completion
 *  org.fife.ui.autocomplete.CompletionProvider
 *  org.fife.ui.autocomplete.CompletionProviderBase
 *  org.fife.ui.autocomplete.ParameterizedCompletion
 */
package net.runelite.jshell;

import java.awt.Point;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.text.JTextComponent;
import jdk.jshell.JShell;
import jdk.jshell.SourceCodeAnalysis;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.Completion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.CompletionProviderBase;
import org.fife.ui.autocomplete.ParameterizedCompletion;

public class JShellAutocompleteProvider
extends CompletionProviderBase {
    private final JShell shell;
    private String anchorText;
    private List<Completion> completions;

    protected List<Completion> getCompletionsImpl(JTextComponent comp) {
        return this.completions;
    }

    public String getAlreadyEnteredText(JTextComponent comp) {
        this.complete(comp);
        return this.anchorText;
    }

    private void complete(JTextComponent comp) {
        this.completions = Collections.emptyList();
        String src = comp.getText();
        int cursor = comp.getCaretPosition();
        int offset = 0;
        while (offset < src.length() && cursor >= offset) {
            boolean mayHaveMore;
            String snipSrc = src.substring(offset);
            int thisOffset = offset;
            SourceCodeAnalysis.CompletionInfo ci = this.shell.sourceCodeAnalysis().analyzeCompletion(snipSrc);
            offset = src.length() - ci.remaining().length();
            boolean bl = mayHaveMore = ci.completeness() == SourceCodeAnalysis.Completeness.COMPLETE_WITH_SEMI || ci.completeness() == SourceCodeAnalysis.Completeness.COMPLETE;
            if (cursor > offset && mayHaveMore) continue;
            int[] anchor = new int[1];
            this.completions = this.shell.sourceCodeAnalysis().completionSuggestions(snipSrc, cursor - thisOffset, anchor).stream().filter(v -> !v.continuation().startsWith("$")).map(s -> new BasicCompletion((CompletionProvider)this, s.continuation())).collect(Collectors.toList());
            this.anchorText = snipSrc.substring(anchor[0], cursor - thisOffset);
            break;
        }
        if (this.completions.isEmpty()) {
            this.anchorText = null;
        }
    }

    public List<Completion> getCompletionsAt(JTextComponent comp, Point p) {
        return Collections.emptyList();
    }

    public boolean isAutoActivateOkay(JTextComponent comp) {
        String text = comp.getText();
        for (int i = comp.getCaretPosition(); i >= 0; --i) {
            char c = text.charAt(i);
            if (Character.isJavaIdentifierPart(c) || c == '.' || c == '(') {
                return true;
            }
            if (Character.isWhitespace(c)) continue;
            return false;
        }
        return false;
    }

    public List<ParameterizedCompletion> getParameterizedCompletions(JTextComponent tc) {
        return Collections.emptyList();
    }

    public JShellAutocompleteProvider(JShell shell) {
        this.shell = shell;
    }
}

