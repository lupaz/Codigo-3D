
package Interfaz;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
 
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.Document;
/**
 *
 * @author luis
 */
public class LineasText extends JPanel{
    
  public JTextPane text_pane;
  public JScrollPane scrollPane;
  public String  ruta="";
 
  public LineasText (){
    super ();
    setMinimumSize (new Dimension (30, 30));
    setPreferredSize (new Dimension (30, 30));
    setMinimumSize (new Dimension (30, 30));
    text_pane = new JTextPane (){ // se necesita pintar las lineas en el panel 
      public void paint (Graphics g)
      {
	super.paint (g);
	LineasText.this.repaint ();
      }
    };
    scrollPane = new JScrollPane (text_pane);
  }
 
  @Override
  public void paint (Graphics g){
    super.paint (g);
    int start =
      text_pane.viewToModel (scrollPane.getViewport ().getViewPosition ());
    int end =
      text_pane.viewToModel (new
		   Point (scrollPane.getViewport ().getViewPosition ().x +
			  text_pane.getWidth (),
			  scrollPane.getViewport ().getViewPosition ().y +
			  text_pane.getHeight ()));
    Document doc = text_pane.getDocument ();
    int startline = doc.getDefaultRootElement ().getElementIndex (start);
    int endline = doc.getDefaultRootElement ().getElementIndex (end)+1; //pinta la linea numero 1
    int fontHeight = g.getFontMetrics (text_pane.getFont ()).getHeight ();	// fuente
    
    for (int line = startline, y = 0; line <= endline;line++, y += fontHeight){
	g.drawString (Integer.toString (line), 0, y);
      }
  }
 
}
