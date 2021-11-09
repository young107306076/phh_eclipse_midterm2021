package org.eclipse.swt.snippets;

/*
 * Label example snippet: create a label (with an image)
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 */
import org.eclipse.swt.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.*;

public class Midterm {

public static void main (String[] args) {
	Display display = new Display();
	Image image = new Image (display, 50, 50);
	Color color = display.getSystemColor (SWT.COLOR_RED);
	GC gc = new GC (image);
	gc.setBackground (color);
	gc.fillRectangle (image.getBounds ());
	gc.dispose ();
	Shell shell = new Shell (display);
	shell.setText("Snippet 34");
	Label label = new Label (shell, SWT.BORDER);
	Rectangle clientArea = shell.getClientArea ();
	label.setLocation (clientArea.x, clientArea.y);
	label.setImage (image);
	label.setText("Hello It's Young");
	label.pack ();
	shell.pack ();
	shell.open ();
	while (!shell.isDisposed ()) {
		if (!display.readAndDispatch ()) display.sleep ();
	}
	image.dispose ();
	display.dispose ();
}

}