/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Injector
 *  org.fife.ui.autocomplete.AutoCompletion
 *  org.fife.ui.autocomplete.CompletionProvider
 *  org.fife.ui.rsyntaxtextarea.RSyntaxTextArea
 *  org.fife.ui.rsyntaxtextarea.Theme
 *  org.fife.ui.rtextarea.RTextArea
 *  org.fife.ui.rtextarea.RTextScrollPane
 */
package net.runelite.jshell;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Injector;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.Segment;
import jdk.jshell.DeclarationSnippet;
import jdk.jshell.Diag;
import jdk.jshell.JShell;
import jdk.jshell.Snippet;
import jdk.jshell.SnippetEvent;
import jdk.jshell.SourceCodeAnalysis;
import net.runelite.jshell.JShellAutocompleteProvider;
import net.runelite.jshell.RLShellExecutionControl;
import net.runelite.jshell.RemappingThrowable;
import net.runelite.jshell.TeeLogger;
import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.Theme;
import org.fife.ui.rtextarea.RTextArea;
import org.fife.ui.rtextarea.RTextScrollPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ShellPanel
extends JPanel {
    private static final Logger log = LoggerFactory.getLogger(ShellPanel.class);
    private final ScheduledExecutorService executor;
    private final RSyntaxTextArea textArea;
    private final JTextArea console = new JTextArea();
    private final Logger shellLogger;
    private final List<Runnable> cleanup = new ArrayList<Runnable>();
    private RLShellExecutionControl exec;
    private JShell shell;
    private Set<Snippet> prelude;
    private Injector injector;
    private AutoCompletion autoCompletion;
    public static ShellPanel INSTANCE;

    public ShellPanel(ScheduledExecutorService executor) {
        this.executor = executor;
        Font codeFont = Stream.of("Source code pro", "DejaVu Sans Code", "Consolas", "Monospaced").map(name -> new Font((String)name, 0, 12)).filter(f -> !"Dialog.plain".equals(f.getFontName())).findFirst().get();
        this.setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(2));
        JButton run = new JButton("\u2bc8");
        run.setToolTipText("Run");
        run.addActionListener(ev -> this.run());
        topPanel.add(run);
        JButton clear = new JButton("\ud83d\uddd1");
        clear.setToolTipText("Clear console");
        clear.addActionListener(ev -> this.console.setText(""));
        topPanel.add(clear);
        this.add((Component)topPanel, "North");
        this.textArea = new RSyntaxTextArea();
        try {
            HashMap<RenderingHints.Key, Object> map = new HashMap<RenderingHints.Key, Object>();
            map.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            Field f2 = RSyntaxTextArea.class.getDeclaredField("aaHints");
            f2.setAccessible(true);
            f2.set(this.textArea, map);
        }
        catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
        this.textArea.setFont(codeFont);
        this.textArea.setSyntaxEditingStyle("text/java");
        this.textArea.setAutoIndentEnabled(true);
        this.textArea.setPaintTabLines(true);
        this.textArea.setShowMatchedBracketPopup(true);
        this.textArea.setCloseCurlyBraces(false);
        this.textArea.setTabSize(2);
        this.textArea.setMarkOccurrences(true);
        this.textArea.setMarkOccurrencesDelay(200);
        this.textArea.addKeyListener((KeyListener)new KeyAdapter(){

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 82 && (e.getModifiersEx() & 0x80) != 0) {
                    ShellPanel.this.run();
                    e.consume();
                }
                if (e.getKeyCode() == 121) {
                    ShellPanel.this.run();
                    e.consume();
                }
            }
        });
        RTextScrollPane textScrollArea = new RTextScrollPane((RTextArea)this.textArea);
        try {
            Theme.load((InputStream)ShellPanel.class.getResourceAsStream("darcula.xml"), (Font)codeFont).apply(this.textArea);
            try (InputStream is = ShellPanel.class.getResourceAsStream("default.jsh");){
                this.textArea.setText(new String(is.readAllBytes(), StandardCharsets.UTF_8));
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.console.setFont(codeFont);
        this.console.setEditable(false);
        this.console.setOpaque(false);
        JSplitPane split = new JSplitPane(0, (Component)textScrollArea, new JScrollPane(this.console));
        split.setResizeWeight(0.8);
        split.setPreferredSize(new Dimension(800, 800));
        this.add((Component)split, "Center");
        this.shellLogger = new TeeLogger(LoggerFactory.getLogger("Shell"), this::logToConsole);
        INSTANCE = this;
        JShell.builder();
    }

    public void switchContext(Injector injector) {
        String preludeStr;
        this.freeContext();
        this.injector = injector;
        this.exec = new RLShellExecutionControl(){

            @Override
            protected String invoke(Method doitMethod) throws Exception {
                AtomicReference result = new AtomicReference();
                Semaphore sema = new Semaphore(0);
                ShellPanel.this.invokeOnClientThread(() -> {
                    try {
                        result.set(super.invoke(doitMethod));
                    }
                    catch (Exception e) {
                        result.set(e);
                    }
                    finally {
                        sema.release();
                    }
                });
                sema.acquire();
                if (result.get() instanceof String) {
                    return (String)result.get();
                }
                throw (Exception)result.get();
            }
        };
        this.shell = JShell.builder().executionEngine(this.exec, null).build();
        try (InputStream is = ShellPanel.class.getResourceAsStream("prelude.jsh");){
            preludeStr = new String(is.readAllBytes(), StandardCharsets.UTF_8);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.prelude = ImmutableSet.copyOf(this.eval(preludeStr, false));
        JShellAutocompleteProvider cp = new JShellAutocompleteProvider(this.shell);
        this.autoCompletion = new AutoCompletion((CompletionProvider)cp);
        this.autoCompletion.setAutoActivationDelay(200);
        this.autoCompletion.setAutoActivationEnabled(true);
        this.autoCompletion.setAutoCompleteSingleChoices(false);
        this.autoCompletion.install((JTextComponent)this.textArea);
    }

    public void logToConsole(String message) {
        SwingUtilities.invokeLater(() -> {
            try {
                Document doc = this.console.getDocument();
                if (doc.getLength() > 100000) {
                    int i;
                    Segment seg = new Segment();
                    for (i = doc.getLength() - 75000; i < doc.getLength(); ++i) {
                        doc.getText(i, 1, seg);
                        if (seg.array[0] == '\n') break;
                    }
                    doc.remove(0, i);
                }
                doc.insertString(doc.getLength(), message + "\n", null);
                this.console.setCaretPosition(doc.getLength());
            }
            catch (BadLocationException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private List<Snippet> eval(String src, boolean isUserCode) {
        ArrayList<Snippet> out = new ArrayList<Snippet>();
        HashMap<String, Integer> offsets = new HashMap<String, Integer>();
        String output = null;
        int offset = 0;
        block0: while (offset < src.length()) {
            while (src.charAt(offset) == '\n') {
                ++offset;
            }
            SourceCodeAnalysis.CompletionInfo ci = this.shell.sourceCodeAnalysis().analyzeCompletion(src.substring(offset));
            int thisOffset = offset;
            offset = src.length() - ci.remaining().length();
            if (ci.completeness() == SourceCodeAnalysis.Completeness.EMPTY) break;
            List<SnippetEvent> evs = this.shell.eval(ci.source());
            for (SnippetEvent ev : evs) {
                Snippet snip = ev.snippet();
                offsets.put("#" + snip.id(), thisOffset);
                if (ev.status() != Snippet.Status.VALID) {
                    boolean handled = false;
                    List diags = this.shell.diagnostics(snip).collect(Collectors.toList());
                    for (Diag diag : diags) {
                        handled = true;
                        String msg = this.toStringDiagnostic(src, thisOffset, diag);
                        if (isUserCode) {
                            this.logToConsole(msg);
                            continue;
                        }
                        throw new RuntimeException("prelude error: " + msg);
                    }
                    if (snip instanceof DeclarationSnippet) {
                        List unresolved = this.shell.unresolvedDependencies((DeclarationSnippet)snip).collect(Collectors.toList());
                        for (String ident : unresolved) {
                            handled = true;
                            this.logToConsole("Unresolved symbol: " + ident);
                        }
                    }
                    if (!handled) {
                        this.logToConsole("bad snippet" + String.valueOf((Object)ev.status()));
                    }
                    if (ev.status() != Snippet.Status.RECOVERABLE_DEFINED) break block0;
                }
                if (ev.exception() != null) {
                    if (isUserCode) {
                        this.shellLogger.error("", new RemappingThrowable(src, offsets, ev.exception()));
                    } else {
                        throw new RuntimeException("prelude error", ev.exception());
                    }
                }
                output = ev.value();
                out.add(snip);
            }
        }
        if (isUserCode && !Strings.isNullOrEmpty(output)) {
            this.logToConsole("[OUTPUT] " + output);
        }
        return out;
    }

    private String toStringDiagnostic(String source, int offset, Diag diag) {
        int line = 1;
        int column = 1;
        offset += (int)diag.getPosition();
        for (int i = 0; i < offset && i < source.length(); ++i) {
            if (source.charAt(i) == '\n') {
                ++line;
                column = 1;
                continue;
            }
            ++column;
        }
        return line + ":" + column + ": " + diag.getMessage(Locale.getDefault());
    }

    protected void run() {
        String text = this.textArea.getText();
        this.executor.submit(() -> {
            this.shell.snippets().filter(v -> !this.prelude.contains(v)).forEach(this.shell::drop);
            this.cleanup();
            this.eval(text, true);
        });
    }

    public void freeContext() {
        this.cleanup();
        this.exec = null;
        this.shell = null;
        this.prelude = null;
        this.injector = null;
        if (this.autoCompletion != null) {
            this.autoCompletion.uninstall();
        }
        this.autoCompletion = null;
        this.console.setText("");
    }

    private void cleanup() {
        ArrayList<Runnable> todo = new ArrayList<Runnable>(this.cleanup);
        this.cleanup.clear();
        this.invokeOnClientThread(() -> {
            for (Runnable c : todo) {
                try {
                    c.run();
                }
                catch (Exception e) {
                    this.shellLogger.error("Cleanup threw:", e);
                }
            }
        });
    }

    protected abstract void invokeOnClientThread(Runnable var1);

    public <T> T inject(Class<T> clazz) {
        return (T)this.injector.getInstance(clazz);
    }

    public void cleanup(Runnable r) {
        this.cleanup.add(r);
    }

    public Logger getShellLogger() {
        return this.shellLogger;
    }
}

