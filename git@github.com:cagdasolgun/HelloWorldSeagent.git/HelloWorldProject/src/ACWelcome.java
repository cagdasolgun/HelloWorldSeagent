import javax.swing.JOptionPane;

import tr.edu.ege.seagent.planner.htn.Action;
import tr.edu.ege.seagent.planner.htn.ExecutionMethod;

/**
 * Action class of ACWelcome.
 */
public class ACWelcome extends Action {

	/**
	 * Execution method.
	 */
	@ExecutionMethod
	public void execute() {
		JOptionPane.showMessageDialog(null, "Wake up Neo...", "", 0);
	}
}
