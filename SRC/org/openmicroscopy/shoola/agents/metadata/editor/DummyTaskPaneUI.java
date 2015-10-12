package org.openmicroscopy.shoola.agents.metadata.editor;

import javax.swing.JLabel;

/**
 * An empty {@link AnnotationTaskPaneUI}
 * 
 * @author Dominik Lindner &nbsp;&nbsp;&nbsp;&nbsp; <a
 *         href="mailto:d.lindner@dundee.ac.uk">d.lindner@dundee.ac.uk</a>
 *
 */
public class DummyTaskPaneUI extends AnnotationTaskPaneUI {

    /**
     * Creates a new instance
     * 
     * @param model
     *            Reference to the {@link EditorModel}
     * @param view
     *            Reference to the {@link EditorUI}
     * @param controller
     *            Reference to the {@link EditorControl}r
     */
    public DummyTaskPaneUI(EditorModel model, EditorUI view,
            EditorControl controller) {
        super(model, view, controller);
        add(new JLabel("Not implemented yet"));
    }

    @Override
    void refreshUI() {

    }

}
