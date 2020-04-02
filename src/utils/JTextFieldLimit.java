/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import javax.print.attribute.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author solution
 */
public class JTextFieldLimit extends PlainDocument{
    private int limit;
    public JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }

    public JTextFieldLimit(int limit, boolean upper) {
        super();
        this.limit = limit;
    }

    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
    if (str == null)
        return;

        if ((getLength() + str.length()) <= limit) {
          super.insertString(offset, str, (javax.swing.text.AttributeSet) attr);
        }
    }
}
