package grammar.parser;

import com.core.*;
import com.core.type.Intent;
import com.core.type.PendingIntent;
import com.core.type.__MuOutputStream;
import com.utils.Env;
import grammar.SmaliParser;
import grammar.SmaliParserListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Parser implements SmaliParserListener {

	@Override
	public void enterRegisterIdentifier(SmaliParser.RegisterIdentifierContext ctx) {

	}

	@Override
	public void exitRegisterIdentifier(SmaliParser.RegisterIdentifierContext ctx) {

	}

	@Override
	public void enterStringLiteral(SmaliParser.StringLiteralContext ctx) {

	}

	@Override
	public void exitStringLiteral(SmaliParser.StringLiteralContext ctx) {

	}

	@Override
	public void enterNegativeNumericLiteral(SmaliParser.NegativeNumericLiteralContext ctx) {

	}

	@Override
	public void exitNegativeNumericLiteral(SmaliParser.NegativeNumericLiteralContext ctx) {

	}

	@Override
	public void enterDecimalNumericLiteral(SmaliParser.DecimalNumericLiteralContext ctx) {

	}

	@Override
	public void exitDecimalNumericLiteral(SmaliParser.DecimalNumericLiteralContext ctx) {

	}

	@Override
	public void enterHexNumericLiteral(SmaliParser.HexNumericLiteralContext ctx) {

	}

	@Override
	public void exitHexNumericLiteral(SmaliParser.HexNumericLiteralContext ctx) {

	}

	@Override
	public void enterOctNumericLiteral(SmaliParser.OctNumericLiteralContext ctx) {

	}

	@Override
	public void exitOctNumericLiteral(SmaliParser.OctNumericLiteralContext ctx) {

	}

	@Override
	public void enterBinaryNumericLiteral(SmaliParser.BinaryNumericLiteralContext ctx) {

	}

	@Override
	public void exitBinaryNumericLiteral(SmaliParser.BinaryNumericLiteralContext ctx) {

	}

	@Override
	public void enterFloatNumericLiteral(SmaliParser.FloatNumericLiteralContext ctx) {

	}

	@Override
	public void exitFloatNumericLiteral(SmaliParser.FloatNumericLiteralContext ctx) {

	}

	@Override
	public void enterHexFloatLiteral(SmaliParser.HexFloatLiteralContext ctx) {

	}

	@Override
	public void exitHexFloatLiteral(SmaliParser.HexFloatLiteralContext ctx) {

	}

	@Override
	public void enterPositiveNumericLiteral(SmaliParser.PositiveNumericLiteralContext ctx) {

	}

	@Override
	public void exitPositiveNumericLiteral(SmaliParser.PositiveNumericLiteralContext ctx) {

	}

	@Override
	public void enterNumericLiteral(SmaliParser.NumericLiteralContext ctx) {

	}

	@Override
	public void exitNumericLiteral(SmaliParser.NumericLiteralContext ctx) {

	}

	@Override
	public void enterIdentifier(SmaliParser.IdentifierContext ctx) {

	}

	@Override
	public void exitIdentifier(SmaliParser.IdentifierContext ctx) {

	}

	@Override
	public void enterReferenceType(SmaliParser.ReferenceTypeContext ctx) {

	}

	@Override
	public void exitReferenceType(SmaliParser.ReferenceTypeContext ctx) {

	}

	@Override
	public void enterVoidType(SmaliParser.VoidTypeContext ctx) {

	}

	@Override
	public void exitVoidType(SmaliParser.VoidTypeContext ctx) {

	}

	@Override
	public void enterBooleanType(SmaliParser.BooleanTypeContext ctx) {

	}

	@Override
	public void exitBooleanType(SmaliParser.BooleanTypeContext ctx) {

	}

	@Override
	public void enterByteType(SmaliParser.ByteTypeContext ctx) {

	}

	@Override
	public void exitByteType(SmaliParser.ByteTypeContext ctx) {

	}

	@Override
	public void enterShortType(SmaliParser.ShortTypeContext ctx) {

	}

	@Override
	public void exitShortType(SmaliParser.ShortTypeContext ctx) {

	}

	@Override
	public void enterCharType(SmaliParser.CharTypeContext ctx) {

	}

	@Override
	public void exitCharType(SmaliParser.CharTypeContext ctx) {

	}

	@Override
	public void enterIntType(SmaliParser.IntTypeContext ctx) {

	}

	@Override
	public void exitIntType(SmaliParser.IntTypeContext ctx) {

	}

	@Override
	public void enterLongType(SmaliParser.LongTypeContext ctx) {

	}

	@Override
	public void exitLongType(SmaliParser.LongTypeContext ctx) {

	}

	@Override
	public void enterFloatType(SmaliParser.FloatTypeContext ctx) {

	}

	@Override
	public void exitFloatType(SmaliParser.FloatTypeContext ctx) {

	}

	@Override
	public void enterDoubleType(SmaliParser.DoubleTypeContext ctx) {

	}

	@Override
	public void exitDoubleType(SmaliParser.DoubleTypeContext ctx) {

	}

	@Override
	public void enterPrimitiveType(SmaliParser.PrimitiveTypeContext ctx) {

	}

	@Override
	public void exitPrimitiveType(SmaliParser.PrimitiveTypeContext ctx) {

	}

	@Override
	public void enterNonArrayType(SmaliParser.NonArrayTypeContext ctx) {

	}

	@Override
	public void exitNonArrayType(SmaliParser.NonArrayTypeContext ctx) {

	}

	@Override
	public void enterMethodParameterLiteral(SmaliParser.MethodParameterLiteralContext ctx) {

	}

	@Override
	public void exitMethodParameterLiteral(SmaliParser.MethodParameterLiteralContext ctx) {

	}

	@Override
	public void enterArrayType(SmaliParser.ArrayTypeContext ctx) {

	}

	@Override
	public void exitArrayType(SmaliParser.ArrayTypeContext ctx) {

	}

	@Override
	public void enterReferenceOrArrayType(SmaliParser.ReferenceOrArrayTypeContext ctx) {

	}

	@Override
	public void exitReferenceOrArrayType(SmaliParser.ReferenceOrArrayTypeContext ctx) {

	}

	@Override
	public void enterNonVoidType(SmaliParser.NonVoidTypeContext ctx) {

	}

	@Override
	public void exitNonVoidType(SmaliParser.NonVoidTypeContext ctx) {

	}

	@Override
	public void enterAnyType(SmaliParser.AnyTypeContext ctx) {

	}

	@Override
	public void exitAnyType(SmaliParser.AnyTypeContext ctx) {

	}

	@Override
	public void enterNullLiteral(SmaliParser.NullLiteralContext ctx) {

	}

	@Override
	public void exitNullLiteral(SmaliParser.NullLiteralContext ctx) {

	}

	@Override
	public void enterBooleanLiteral(SmaliParser.BooleanLiteralContext ctx) {

	}

	@Override
	public void exitBooleanLiteral(SmaliParser.BooleanLiteralContext ctx) {

	}

	@Override
	public void enterAssignableValue(SmaliParser.AssignableValueContext ctx) {

	}

	@Override
	public void exitAssignableValue(SmaliParser.AssignableValueContext ctx) {

	}

	@Override
	public void enterAssignableValueCLS(SmaliParser.AssignableValueCLSContext ctx) {

	}

	@Override
	public void exitAssignableValueCLS(SmaliParser.AssignableValueCLSContext ctx) {

	}

	@Override
	public void enterAnyTypeCLS(SmaliParser.AnyTypeCLSContext ctx) {

	}

	@Override
	public void exitAnyTypeCLS(SmaliParser.AnyTypeCLSContext ctx) {

	}

	@Override
	public void enterMethodSignatureCLS(SmaliParser.MethodSignatureCLSContext ctx) {

	}

	@Override
	public void exitMethodSignatureCLS(SmaliParser.MethodSignatureCLSContext ctx) {

	}

	@Override
	public void enterMethodReturnTypeCLS(SmaliParser.MethodReturnTypeCLSContext ctx) {

	}

	@Override
	public void exitMethodReturnTypeCLS(SmaliParser.MethodReturnTypeCLSContext ctx) {

	}

	@Override
	public void enterClassModifier(SmaliParser.ClassModifierContext ctx) {
		Env.r.getCls().setClassModifiers(ctx.getText());
	}

	@Override
	public void exitClassModifier(SmaliParser.ClassModifierContext ctx) {

	}

	@Override
	public void enterMethodModifier(SmaliParser.MethodModifierContext ctx) {
		Env.r.getMethod().setModifier(ctx.getText());
	}

	@Override
	public void exitMethodModifier(SmaliParser.MethodModifierContext ctx) {

	}

	@Override
	public void enterFieldModifier(SmaliParser.FieldModifierContext ctx) {

	}

	@Override
	public void exitFieldModifier(SmaliParser.FieldModifierContext ctx) {

	}

	@Override
	public void enterLabelName(SmaliParser.LabelNameContext ctx) {

	}

	@Override
	public void exitLabelName(SmaliParser.LabelNameContext ctx) {

	}

	@Override
	public void enterLabel(SmaliParser.LabelContext ctx) {

	}

	@Override
	public void exitLabel(SmaliParser.LabelContext ctx) {

	}

	@Override
	public void enterLeftRegister(SmaliParser.LeftRegisterContext ctx) {

	}

	@Override
	public void exitLeftRegister(SmaliParser.LeftRegisterContext ctx) {

	}

	@Override
	public void enterRightRegister(SmaliParser.RightRegisterContext ctx) {

	}

	@Override
	public void exitRightRegister(SmaliParser.RightRegisterContext ctx) {

	}

	@Override
	public void enterRegisterListRegisters(SmaliParser.RegisterListRegistersContext ctx) {

	}

	@Override
	public void exitRegisterListRegisters(SmaliParser.RegisterListRegistersContext ctx) {

	}

	@Override
	public void enterRegisterRange(SmaliParser.RegisterRangeContext ctx) {

	}

	@Override
	public void exitRegisterRange(SmaliParser.RegisterRangeContext ctx) {

	}

	@Override
	public void enterRegisterList(SmaliParser.RegisterListContext ctx) {

	}

	@Override
	public void exitRegisterList(SmaliParser.RegisterListContext ctx) {

	}

	@Override
	public void enterGotoInstruction(SmaliParser.GotoInstructionContext ctx) {

	}

	@Override
	public void exitGotoInstruction(SmaliParser.GotoInstructionContext ctx) {

	}

	@Override
	public void enterGoto16Instruction(SmaliParser.Goto16InstructionContext ctx) {

	}

	@Override
	public void exitGoto16Instruction(SmaliParser.Goto16InstructionContext ctx) {

	}

	@Override
	public void enterGoto32Instruction(SmaliParser.Goto32InstructionContext ctx) {

	}

	@Override
	public void exitGoto32Instruction(SmaliParser.Goto32InstructionContext ctx) {

	}

	@Override
	public void enterMoveResultInstruction(SmaliParser.MoveResultInstructionContext ctx) {
		if (needToMonitorMoveResult) {
			String registryid = ctx.registerIdentifier().getText();
			CELL cell = Env.r.getMethod().getRegistry(registryid);

			if (cell == null) {
				cell = new CELL(registryid);
				Env.r.getMethod().setRegistry(registryid, cell);
			}

			if (recentCellID != null) {
				if (!recentCellID.isEmpty()) {
					CELL source = Env.r.getMethod().getRegistry(recentCellID);
					if (cell != null)
						cell.setCell(source);
					// Env.r.getMethod().setRegistry(registryid, source);
				}
			}
			cell.setCurrent_descriptions(invokeResultValue);
			if (invokeParams != null) {
				for (CELL c : invokeParams) {
					c.getCurrent_descriptions().setPointsTo(cell.getCellId());
					cell.getCurrent_descriptions().setPointsFrom(c.getCellId());
				}
			}
			invokeParams = null;
			invokeResultValue = null;
			needToMonitorMoveResult = false;
			needToMoveAndAssign = null;
		} else if (recentCellID != null) {
			if (!recentCellID.isEmpty()) {
				String targetID = ctx.registerIdentifier().getText();
				CELL cell = Env.r.getMethod().getRegistry(recentCellID);
				CELL target = Env.r.getMethod().getRegistry(targetID);
				if (target == null)
					target = new CELL(targetID);
				Env.r.getMethod().setRegistry(targetID, target);
				if (!target.isVulnerable())
					target.setCell(cell);
				// Env.r.getMethod().setRegistry(targetID, cell);
			}
		}
	}

	@Override
	public void exitMoveResultInstruction(SmaliParser.MoveResultInstructionContext ctx) {

	}

	@Override
	public void enterMoveResultWideInstruction(SmaliParser.MoveResultWideInstructionContext ctx) {
		if (needToMonitorMoveResult) {
			String registryid = ctx.registerIdentifier().getText();
			CELL cell = Env.r.getMethod().getRegistry(registryid);

			if (cell == null) {
				cell = new CELL(registryid);
				Env.r.getMethod().setRegistry(registryid, cell);
			}

			if (recentCellID != null) {
				if (!recentCellID.isEmpty()) {
					CELL source = Env.r.getMethod().getRegistry(recentCellID);
					if (cell != null) {
						cell.setCell(source);
					}

					// Env.r.getMethod().setRegistry(registryid, source);
				}
			}

			cell.setCurrent_descriptions(invokeResultValue);
			if (invokeParams != null) {
				for (CELL c : invokeParams) {
					c.getCurrent_descriptions().setPointsTo(cell.getCellId());
					cell.getCurrent_descriptions().setPointsFrom(c.getCellId());
				}
			}
			invokeParams = null;
			invokeResultValue = null;
			needToMonitorMoveResult = false;
			needToMoveAndAssign = null;
		} else if (recentCellID != null) {
			if (!recentCellID.isEmpty()) {
				String targetID = ctx.registerIdentifier().getText();
				CELL source = Env.r.getMethod().getRegistry(recentCellID);
				CELL targetCell = Env.r.getMethod().getRegistry(targetID);
				if (targetCell == null)
					targetCell = new CELL(targetID);
				Env.r.getMethod().setRegistry(targetID, targetCell);
				if (targetCell != null)
					targetCell.setCell(source);

				// Env.r.getMethod().setRegistry(targetID, source);
			}
		}
	}

	@Override
	public void exitMoveResultWideInstruction(SmaliParser.MoveResultWideInstructionContext ctx) {

	}

	@Override
	public void enterMoveResultObjectInstruction(SmaliParser.MoveResultObjectInstructionContext ctx) {
		// //System.out.println("INTO enterMoveResultObjectInstruction>>>
		// "+Env.activeSmaliFileName);
		// //System.out.println("recentCellID>>>> "+recentCellID + ":>>
		// "+needToMonitorMoveResult);

		if (needToMonitorMoveResult) {
			String registryid = ctx.registerIdentifier().getText();
			// CELL_DESCRIPTION cell_description = new CELL_DESCRIPTION();
			// cell_description.setRhs(needToMoveAndAssign);
			CELL targetCell = Env.r.getMethod().getRegistry(registryid);
			// ////////////System.out.println("ERRROR STATE>>>>>>>>>>>>>>>>>>>>>>
			// "+Env.r.getCls().getClassname());
			// ////////////System.out.println("ERRROR STATE>>>>>>>>>>>>>>>>>>>>>>
			// "+registryid);
			// ////////////System.out.println(">>>>>>>>>>>>>>>>>>> "+invokeMethodDetails);

			if (targetCell == null) {
				targetCell = new CELL(registryid);
				Env.r.getMethod().setRegistry(registryid, targetCell);
			}
			if (recentCellID != null) {
				if (!recentCellID.isEmpty()) {
					CELL source = Env.r.getMethod().getRegistry(recentCellID);
					if (targetCell != null)
						targetCell.setCell(source);
				}
			}

			targetCell.setCurrent_descriptions(invokeResultValue);
			targetCell.setDeclaredVariableType(invokeResultValue.getClsType());
			targetCell.setPresentVariableType(invokeResultValue.getClsType());
			// ////System.out.println("INVOKE RESULT VALUE>>> ");
			// ////System.out.println(invokeResultValue.toString());
			// String ps = registryid + "==+ ";
			// for (CELL c : invokeParams) {
			// ps += c.getCellId() +", ";
			// }
			//////////// ////System.out.println("-------------------------->> "+ps);
			//////////// ////System.out.println(needToMoveAndAssign);
			if (invokeParams != null) {
				//////////// ////System.out.println(">>"+invokeParams);
				//////////// ////System.out.println(">>1 "+cell);
				//////////// ////System.out.println(">>2 "+cell.getCellId());

				for (CELL c : invokeParams) {
					//////////// ////System.out.println(">>3 "+c.getCellId());
					//////////// ////System.out.println(">>3 "+c.getCurrent_descriptions());
					c.getCurrent_descriptions().setPointsTo(targetCell.getCellId());
					targetCell.getCurrent_descriptions().setPointsFrom(c.getCellId());
				}
			}
			invokeParams = null;
			invokeResultValue = null;
			needToMonitorMoveResult = false;
			needToMoveAndAssign = null;
		} else if (recentCellID != null) {
			if (!recentCellID.isEmpty()) {
				String targetID = ctx.registerIdentifier().getText();
				CELL source = Env.r.getMethod().getRegistry(recentCellID);
				CELL targetCell = Env.r.getMethod().getRegistry(targetID);
				if (targetCell == null)
					targetCell = new CELL(targetID);
				Env.r.getMethod().setRegistry(targetID, targetCell);
				if (targetCell != null)
					targetCell.setCell(source);

				// Env.r.getMethod().setRegistry(targetID, source);
			}
		}
	}

	@Override
	public void exitMoveResultObjectInstruction(SmaliParser.MoveResultObjectInstructionContext ctx) {

	}

	@Override
	public void enterMoveExceptionInstruction(SmaliParser.MoveExceptionInstructionContext ctx) {
		if (needToMonitorMoveResult) {
			String registryid = ctx.registerIdentifier().getText();
			// CELL_DESCRIPTION cell_description = new CELL_DESCRIPTION();
			// cell_description.setRhs(needToMoveAndAssign);
			CELL cell = Env.r.getMethod().getRegistry(registryid);
			// ////////////System.out.println("ERRROR STATE>>>>>>>>>>>>>>>>>>>>>>
			// "+Env.r.getCls().getClassname());
			// ////////////System.out.println("ERRROR STATE>>>>>>>>>>>>>>>>>>>>>>
			// "+registryid);
			// ////////////System.out.println(">>>>>>>>>>>>>>>>>>> "+invokeMethodDetails);

			if (cell == null) {
				cell = new CELL(registryid);
				Env.r.getMethod().setRegistry(registryid, cell);
			}

			cell.setCurrent_descriptions(invokeResultValue);
			// String ps = registryid + "==+ ";
			// for (CELL c : invokeParams) {
			// ps += c.getCellId() +", ";
			// }
			//////////// ////System.out.println("-------------------------->> "+ps);
			//////////// ////System.out.println(needToMoveAndAssign);
			if (invokeParams != null) {
				//////////// ////System.out.println(">>"+invokeParams);
				//////////// ////System.out.println(">>1 "+cell);
				//////////// ////System.out.println(">>2 "+cell.getCellId());

				for (CELL c : invokeParams) {
					//////////// ////System.out.println(">>3 "+c.getCellId());
					//////////// ////System.out.println(">>3 "+c.getCurrent_descriptions());
					c.getCurrent_descriptions().setPointsTo(cell.getCellId());
					cell.getCurrent_descriptions().setPointsFrom(c.getCellId());
				}
			}
			invokeParams = null;
			invokeResultValue = null;
			needToMonitorMoveResult = false;
			needToMoveAndAssign = null;
		}
	}

	@Override
	public void exitMoveExceptionInstruction(SmaliParser.MoveExceptionInstructionContext ctx) {

	}

	@Override
	public void enterReturnInstruction(SmaliParser.ReturnInstructionContext ctx) {
		if (needToMonitorMoveResult) {
			String registryid = ctx.registerIdentifier().getText();
			// CELL_DESCRIPTION cell_description = new CELL_DESCRIPTION();
			// cell_description.setRhs(needToMoveAndAssign);
			CELL cell = Env.r.getMethod().getRegistry(registryid);
			// ////////////System.out.println("ERRROR STATE>>>>>>>>>>>>>>>>>>>>>>
			// "+Env.r.getCls().getClassname());
			// ////////////System.out.println("ERRROR STATE>>>>>>>>>>>>>>>>>>>>>>
			// "+registryid);
			// ////////////System.out.println(">>>>>>>>>>>>>>>>>>> "+invokeMethodDetails);

			if (cell == null) {
				cell = new CELL(registryid);
				Env.r.getMethod().setRegistry(registryid, cell);
			}

			cell.setCurrent_descriptions(invokeResultValue);
			// String ps = registryid + "==+ ";
			// for (CELL c : invokeParams) {
			// ps += c.getCellId() +", ";
			// }
			//////////// ////System.out.println("-------------------------->> "+ps);
			//////////// ////System.out.println(needToMoveAndAssign);
			if (invokeParams != null) {
				//////////// ////System.out.println(">>"+invokeParams);
				//////////// ////System.out.println(">>1 "+cell);
				//////////// ////System.out.println(">>2 "+cell.getCellId());

				for (CELL c : invokeParams) {
					//////////// ////System.out.println(">>3 "+c.getCellId());
					//////////// ////System.out.println(">>3 "+c.getCurrent_descriptions());
					c.getCurrent_descriptions().setPointsTo(cell.getCellId());
					cell.getCurrent_descriptions().setPointsFrom(c.getCellId());
				}
			}
			invokeParams = null;
			invokeResultValue = null;
			needToMonitorMoveResult = false;
			needToMoveAndAssign = null;
		}
	}

	@Override
	public void exitReturnInstruction(SmaliParser.ReturnInstructionContext ctx) {

	}

	@Override
	public void enterReturnWideInstruction(SmaliParser.ReturnWideInstructionContext ctx) {

	}

	@Override
	public void exitReturnWideInstruction(SmaliParser.ReturnWideInstructionContext ctx) {

	}

	@Override
	public void enterReturnObjectInstruction(SmaliParser.ReturnObjectInstructionContext ctx) {

	}

	@Override
	public void exitReturnObjectInstruction(SmaliParser.ReturnObjectInstructionContext ctx) {

	}

	@Override
	public void enterMonitorEnterInstruction(SmaliParser.MonitorEnterInstructionContext ctx) {

	}

	@Override
	public void exitMonitorEnterInstruction(SmaliParser.MonitorEnterInstructionContext ctx) {

	}

	@Override
	public void enterMonitorExitInstruction(SmaliParser.MonitorExitInstructionContext ctx) {

	}

	@Override
	public void exitMonitorExitInstruction(SmaliParser.MonitorExitInstructionContext ctx) {

	}

	@Override
	public void enterThrowInstruction(SmaliParser.ThrowInstructionContext ctx) {

	}

	@Override
	public void exitThrowInstruction(SmaliParser.ThrowInstructionContext ctx) {

	}

	@Override
	public void enterReturnVoidInstruction(SmaliParser.ReturnVoidInstructionContext ctx) {

	}

	@Override
	public void exitReturnVoidInstruction(SmaliParser.ReturnVoidInstructionContext ctx) {

	}

	@Override
	public void enterNopInstruction(SmaliParser.NopInstructionContext ctx) {

	}

	@Override
	public void exitNopInstruction(SmaliParser.NopInstructionContext ctx) {

	}

	@Override
	public void enterMoveInstruction(SmaliParser.MoveInstructionContext ctx) {

	}

	@Override
	public void exitMoveInstruction(SmaliParser.MoveInstructionContext ctx) {

	}

	@Override
	public void enterMoveFrom16Instruction(SmaliParser.MoveFrom16InstructionContext ctx) {

	}

	@Override
	public void exitMoveFrom16Instruction(SmaliParser.MoveFrom16InstructionContext ctx) {

	}

	@Override
	public void enterMove16Instruction(SmaliParser.Move16InstructionContext ctx) {

	}

	@Override
	public void exitMove16Instruction(SmaliParser.Move16InstructionContext ctx) {

	}

	@Override
	public void enterMoveWideInstruction(SmaliParser.MoveWideInstructionContext ctx) {

	}

	@Override
	public void exitMoveWideInstruction(SmaliParser.MoveWideInstructionContext ctx) {

	}

	@Override
	public void enterMoveWideFrom16Instruction(SmaliParser.MoveWideFrom16InstructionContext ctx) {

	}

	@Override
	public void exitMoveWideFrom16Instruction(SmaliParser.MoveWideFrom16InstructionContext ctx) {

	}

	@Override
	public void enterMoveWide16Instruction(SmaliParser.MoveWide16InstructionContext ctx) {

	}

	@Override
	public void exitMoveWide16Instruction(SmaliParser.MoveWide16InstructionContext ctx) {

	}

	@Override
	public void enterMoveObjectInstruction(SmaliParser.MoveObjectInstructionContext ctx) {
		// //System.out.println("INTO MOVE OBJECT INSTRUCTION STATIC>>>
		// "+Env.activeSmaliFileName);
		// //System.out.println("recentCellID>>>> "+recentCellID);

	}

	@Override
	public void exitMoveObjectInstruction(SmaliParser.MoveObjectInstructionContext ctx) {

	}

	@Override
	public void enterMoveObjectFrom16Instruction(SmaliParser.MoveObjectFrom16InstructionContext ctx) {

	}

	@Override
	public void exitMoveObjectFrom16Instruction(SmaliParser.MoveObjectFrom16InstructionContext ctx) {

	}

	@Override
	public void enterMoveObject16Instruction(SmaliParser.MoveObject16InstructionContext ctx) {

	}

	@Override
	public void exitMoveObject16Instruction(SmaliParser.MoveObject16InstructionContext ctx) {

	}

	@Override
	public void enterConstInstruction(SmaliParser.ConstInstructionContext ctx) {
		String number = "0";
		////// ////System.out.println(ctx.toString());
		if (ctx.numericLiteral() != null) {
			if (ctx.numericLiteral().negativeNumericLiteral() != null) {
				if (ctx.numericLiteral().getText().length() >= 3)
					number = ctx.numericLiteral().getText().substring(3);
			}
			if (ctx.numericLiteral().positiveNumericLiteral() != null) {
				if (ctx.numericLiteral().getText().length() >= 2)
					number = ctx.numericLiteral().getText().substring(2);
			}
			// int decimal = Integer.parseInt(number, 16);
			String registryid = ctx.registerIdentifier().getText();
			CELL cell = Env.r.getMethod().getRegistry(registryid);
			if (cell == null) {
				cell = new CELL(registryid, number, CELL_DESCRIPTION.T_NUMERIC);
				Env.r.getMethod().setRegistry(registryid, cell);
			} else {
				cell.getCurrent_descriptions().setInitValue(number);
				cell.getCurrent_descriptions().setDescType(CELL_DESCRIPTION.T_NUMERIC);
			}
		}
		// Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitConstInstruction(SmaliParser.ConstInstructionContext ctx) {

	}

	@Override
	public void enterConst4Instruction(SmaliParser.Const4InstructionContext ctx) {
		String number = "0";
		if (ctx.numericLiteral().negativeNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 3)
				number = ctx.numericLiteral().getText().substring(3);
		}
		if (ctx.numericLiteral().positiveNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 2)
				number = ctx.numericLiteral().getText().substring(2);
		}
		// //////////System.out.println("num>> "+number);
		// int decimal = Integer.parseInt(number, 16);
		String registryid = ctx.registerIdentifier().getText();
		CELL cell = Env.r.getMethod().getRegistry(registryid);
		if (cell == null) {
			cell = new CELL(registryid, number, CELL_DESCRIPTION.T_NUMERIC);
			Env.r.getMethod().setRegistry(registryid, cell);
		} else {
			cell.getCurrent_descriptions().setInitValue(number);
			cell.getCurrent_descriptions().setDescType(CELL_DESCRIPTION.T_NUMERIC);
		}
		//
		// String number = ctx.numericLiteral().getText().substring(2);
		// int decimal=Integer.parseInt(number,16);
		// CELL cell = new CELL(ctx.registerIdentifier().getText(), number,
		// CELL_DESCRIPTION.T_NUMERIC);
		//
		// Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitConst4Instruction(SmaliParser.Const4InstructionContext ctx) {

	}

	@Override
	public void enterConst16Instruction(SmaliParser.Const16InstructionContext ctx) {
		String number = "0";
		if (ctx.numericLiteral().negativeNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 3)
				number = ctx.numericLiteral().getText().substring(3);
		}
		if (ctx.numericLiteral().positiveNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 2)
				number = ctx.numericLiteral().getText().substring(2);
		}
		// int decimal = Integer.parseInt(number, 16);
		String registryid = ctx.registerIdentifier().getText();
		CELL cell = Env.r.getMethod().getRegistry(registryid);
		if (cell == null) {
			cell = new CELL(registryid, number, CELL_DESCRIPTION.T_NUMERIC);
			Env.r.getMethod().setRegistry(registryid, cell);
		} else {
			cell.getCurrent_descriptions().setInitValue(number);
			cell.getCurrent_descriptions().setDescType(CELL_DESCRIPTION.T_NUMERIC);
		}
		// String number = ctx.numericLiteral().getText().substring(2);
		// int decimal=Integer.parseInt(number,16);
		// CELL cell = new CELL(ctx.registerIdentifier().getText(), number,
		// CELL_DESCRIPTION.T_NUMERIC);
		//
		//// //////////System.out.println(number + ":> "+ decimal +" :
		// "+ctx.registerIdentifier().getText());
		//
		// Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitConst16Instruction(SmaliParser.Const16InstructionContext ctx) {

	}

	@Override
	public void enterConstHigh16Instruction(SmaliParser.ConstHigh16InstructionContext ctx) {
		String number = "0";
		if (ctx.numericLiteral().negativeNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 3)
				number = ctx.numericLiteral().getText().substring(3);
		}
		if (ctx.numericLiteral().positiveNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 2)
				number = ctx.numericLiteral().getText().substring(2);
		}
		// int decimal = Integer.parseInt(number, 16);
		String registryid = ctx.registerIdentifier().getText();
		CELL cell = Env.r.getMethod().getRegistry(registryid);
		if (cell == null) {
			Env.log.append("ConstHigh16>> " + registryid + ":>>" + Env.activeSmaliFileName + "\n");
			cell = new CELL(registryid, number, CELL_DESCRIPTION.T_NUMERIC);
			Env.r.getMethod().setRegistry(registryid, cell);
		} else {
			cell.getCurrent_descriptions().setInitValue(number);
			cell.getCurrent_descriptions().setDescType(CELL_DESCRIPTION.T_NUMERIC);
		}
		// String number = ctx.numericLiteral().getText().substring(2);
		// int decimal=Integer.parseInt(number,16);
		// CELL cell = new CELL(ctx.registerIdentifier().getText(), number,
		// CELL_DESCRIPTION.T_NUMERIC);
		//
		//// //////////System.out.println(number + ":High16> "+ decimal +" :
		// "+ctx.registerIdentifier().getText());
		//
		// Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitConstHigh16Instruction(SmaliParser.ConstHigh16InstructionContext ctx) {

	}

	@Override
	public void enterConstWide16Instruction(SmaliParser.ConstWide16InstructionContext ctx) {
		String number = "0";
		if (ctx.numericLiteral().negativeNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 3)
				number = ctx.numericLiteral().getText().substring(3);
		}
		if (ctx.numericLiteral().positiveNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 2)
				number = ctx.numericLiteral().getText().substring(2);
		}
		// int decimal = Integer.parseInt(number, 16);
		String registryid = ctx.registerIdentifier().getText();
		CELL cell = Env.r.getMethod().getRegistry(registryid);
		if (cell == null) {
			cell = new CELL(registryid, number, CELL_DESCRIPTION.T_NUMERIC);
			Env.r.getMethod().setRegistry(registryid, cell);
		} else {
			cell.getCurrent_descriptions().setInitValue(number);
			cell.getCurrent_descriptions().setDescType(CELL_DESCRIPTION.T_NUMERIC);
		}
		// String number = ctx.numericLiteral().getText().substring(2);
		// int decimal=Integer.parseInt(number,16);
		// CELL cell = new CELL(ctx.registerIdentifier().getText(), number,
		// CELL_DESCRIPTION.T_NUMERIC);
		//
		//// //////////System.out.println(number + ":Wide16> "+ decimal +" :
		// "+ctx.registerIdentifier().getText());
		//
		// Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitConstWide16Instruction(SmaliParser.ConstWide16InstructionContext ctx) {

	}

	@Override
	public void enterConstWide32Instruction(SmaliParser.ConstWide32InstructionContext ctx) {
		String number = "0";
		if (ctx.numericLiteral().negativeNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 3)
				number = ctx.numericLiteral().getText().substring(3);
		}
		if (ctx.numericLiteral().positiveNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 2)
				number = ctx.numericLiteral().getText().substring(2);
		}
		// int decimal = Integer.parseInt(number, 16);
		String registryid = ctx.registerIdentifier().getText();
		CELL cell = Env.r.getMethod().getRegistry(registryid);
		if (cell == null) {
			cell = new CELL(registryid, number, CELL_DESCRIPTION.T_NUMERIC);
			Env.r.getMethod().setRegistry(registryid, cell);
		} else {
			cell.getCurrent_descriptions().setInitValue(number);
			cell.getCurrent_descriptions().setDescType(CELL_DESCRIPTION.T_NUMERIC);
		}
		// String number = ctx.numericLiteral().getText().substring(2);
		// int decimal=Integer.parseInt(number,32);
		// CELL cell = new CELL(ctx.registerIdentifier().getText(), number,
		// CELL_DESCRIPTION.T_NUMERIC);
		//
		//// //////////System.out.println(number + ":Wide32> "+ decimal +" :
		// "+ctx.registerIdentifier().getText());
		//
		// Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitConstWide32Instruction(SmaliParser.ConstWide32InstructionContext ctx) {

	}

	@Override
	public void enterConstWideInstruction(SmaliParser.ConstWideInstructionContext ctx) {
		String number = "0";
		if (ctx.numericLiteral().negativeNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 3)
				number = ctx.numericLiteral().getText().substring(3);
		}
		if (ctx.numericLiteral().positiveNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 2)
				number = ctx.numericLiteral().getText().substring(2);
		}
		// int decimal = Integer.parseInt(number, 16);
		String registryid = ctx.registerIdentifier().getText();
		CELL cell = Env.r.getMethod().getRegistry(registryid);
		if (cell == null) {
			cell = new CELL(registryid, number, CELL_DESCRIPTION.T_NUMERIC);
			Env.r.getMethod().setRegistry(registryid, cell);
		} else {
			cell.getCurrent_descriptions().setInitValue(number);
			cell.getCurrent_descriptions().setDescType(CELL_DESCRIPTION.T_NUMERIC);
		}

		// String number = ctx.numericLiteral().getText().substring(2);
		// int decimal=Integer.parseInt(number,16);
		// CELL cell = new CELL(ctx.registerIdentifier().getText(), number,
		// CELL_DESCRIPTION.T_NUMERIC);
		//
		//// //////////System.out.println(number + ":Wide16> "+ decimal +" :
		// "+ctx.registerIdentifier().getText());
		//
		// Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitConstWideInstruction(SmaliParser.ConstWideInstructionContext ctx) {

	}

	@Override
	public void enterConstWideHigh16Instruction(SmaliParser.ConstWideHigh16InstructionContext ctx) {
		String number = "0";
		if (ctx.numericLiteral().negativeNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 3)
				number = ctx.numericLiteral().getText().substring(3);
		}
		if (ctx.numericLiteral().positiveNumericLiteral() != null) {
			if (ctx.numericLiteral().getText().length() >= 2)
				number = ctx.numericLiteral().getText().substring(2);
		}
		// int decimal = Integer.parseInt(number, 16);
		String registryid = ctx.registerIdentifier().getText();
		CELL cell = Env.r.getMethod().getRegistry(registryid);
		if (cell == null) {
			cell = new CELL(registryid, number, CELL_DESCRIPTION.T_NUMERIC);
			Env.r.getMethod().setRegistry(registryid, cell);
		} else {
			cell.getCurrent_descriptions().setInitValue(number);
			cell.getCurrent_descriptions().setDescType(CELL_DESCRIPTION.T_NUMERIC);
		}
		// String number = ctx.numericLiteral().getText().substring(2);
		// int decimal=Integer.parseInt(number,16);
		// CELL cell = new CELL(ctx.registerIdentifier().getText(), number,
		// CELL_DESCRIPTION.T_NUMERIC);
		//
		//// //////////System.out.println(number + ":Wide16> "+ decimal +" :
		// "+ctx.registerIdentifier().getText());
		//
		// Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitConstWideHigh16Instruction(SmaliParser.ConstWideHigh16InstructionContext ctx) {

	}

	boolean isGoogleCDMFound = false;
	boolean isGoogleCDMUnsafe = false;

	@Override
	public void enterConstString(SmaliParser.ConstStringContext ctx) {
		CELL cell = new CELL(ctx.registerIdentifier().getText(), ctx.stringLiteral().getText(),
				CELL_DESCRIPTION.T_STRING);
		// System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// "+ctx.stringLiteral().getText());
		String s = ctx.stringLiteral().getText().replaceAll("\"", "");
		if (s.equals("com.google.android.c2dm.intent.REGISTER")) {
			cell.setGoogleCDM(true);
			isGoogleCDMFound = true;
		}
		Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitConstString(SmaliParser.ConstStringContext ctx) {

	}

	@Override
	public void enterConstStringJumbo(SmaliParser.ConstStringJumboContext ctx) {
		CELL cell = new CELL(ctx.registerIdentifier().getText(), ctx.stringLiteral().getText(),
				CELL_DESCRIPTION.T_STRING);
		Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitConstStringJumbo(SmaliParser.ConstStringJumboContext ctx) {

	}

	@Override
	public void enterConstClass(SmaliParser.ConstClassContext ctx) {
		CELL cell = new CELL(ctx.registerIdentifier().getText(), ctx.referenceOrArrayType().getText(),
				CELL_DESCRIPTION.T_REFERENCE);
		Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitConstClass(SmaliParser.ConstClassContext ctx) {

	}

	@Override
	public void enterSGetInstruction(SmaliParser.SGetInstructionContext ctx) {
		if (ctx.registerIdentifier() != null && ctx.fieldInvocationTarget() != null) {
			CELL cell = new CELL(ctx.registerIdentifier().getText(), ctx.fieldInvocationTarget().getText(),
					CELL_DESCRIPTION.T_ARROWREFERENCE);
			Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
		}
	}

	@Override
	public void exitSGetInstruction(SmaliParser.SGetInstructionContext ctx) {

	}

	@Override
	public void enterSGetWideInstruction(SmaliParser.SGetWideInstructionContext ctx) {
		CELL cell = new CELL(ctx.registerIdentifier().getText(), ctx.fieldInvocationTarget().getText(),
				CELL_DESCRIPTION.T_ARROWREFERENCE);
		Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitSGetWideInstruction(SmaliParser.SGetWideInstructionContext ctx) {

	}

	@Override
	public void enterSGetObjectInstruction(SmaliParser.SGetObjectInstructionContext ctx) {
		CELL cell = new CELL(ctx.registerIdentifier().getText(), ctx.fieldInvocationTarget().getText(),
				CELL_DESCRIPTION.T_ARROWREFERENCE);
		Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
		if (ctx.fieldInvocationTarget() != null) {
			SmaliParser.FieldInvocationTargetContext fic = ctx.fieldInvocationTarget();
			if (fic != null) {
				if (fic.referenceOrArrayType() != null) {
					String reftype = fic.referenceOrArrayType().getText();
					if (reftype.startsWith("Landroid/provider/ContactsContract")) {
						Env.isMethodVulnerable = true;
						Env.r.getMethod().setVulnerable(true);

						String registryOfLastElement = ctx.registerIdentifier().getText();
						CELL sgetcell = Env.r.getMethod().getRegistry(registryOfLastElement);
						if (sgetcell == null)
							sgetcell = checkInGlobalRegistry(registryOfLastElement);
						if (sgetcell != null) {
							sgetcell.setVulnerable(true, VulnerabilityType.pa_apps);
						}
					}
				}
			}
		}
	}

	@Override
	public void exitSGetObjectInstruction(SmaliParser.SGetObjectInstructionContext ctx) {

	}

	@Override
	public void enterSGetBooleanInstruction(SmaliParser.SGetBooleanInstructionContext ctx) {
		CELL cell = new CELL(ctx.registerIdentifier().getText(), ctx.fieldInvocationTarget().getText(),
				CELL_DESCRIPTION.T_ARROWREFERENCE);
		Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitSGetBooleanInstruction(SmaliParser.SGetBooleanInstructionContext ctx) {

	}

	@Override
	public void enterSGetByteInstruction(SmaliParser.SGetByteInstructionContext ctx) {
		CELL cell = new CELL(ctx.registerIdentifier().getText(), ctx.fieldInvocationTarget().getText(),
				CELL_DESCRIPTION.T_ARROWREFERENCE);
		Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitSGetByteInstruction(SmaliParser.SGetByteInstructionContext ctx) {

	}

	@Override
	public void enterSGetCharInstruction(SmaliParser.SGetCharInstructionContext ctx) {
		CELL cell = new CELL(ctx.registerIdentifier().getText(), ctx.fieldInvocationTarget().getText(),
				CELL_DESCRIPTION.T_ARROWREFERENCE);
		Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitSGetCharInstruction(SmaliParser.SGetCharInstructionContext ctx) {

	}

	@Override
	public void enterSGetShortInstruction(SmaliParser.SGetShortInstructionContext ctx) {
		CELL cell = new CELL(ctx.registerIdentifier().getText(), ctx.fieldInvocationTarget().getText(),
				CELL_DESCRIPTION.T_ARROWREFERENCE);
		Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitSGetShortInstruction(SmaliParser.SGetShortInstructionContext ctx) {

	}

	@Override
	public void enterSPutInstruction(SmaliParser.SPutInstructionContext ctx) {

	}

	@Override
	public void exitSPutInstruction(SmaliParser.SPutInstructionContext ctx) {

	}

	@Override
	public void enterSPutWideInstruction(SmaliParser.SPutWideInstructionContext ctx) {

	}

	@Override
	public void exitSPutWideInstruction(SmaliParser.SPutWideInstructionContext ctx) {

	}

	@Override
	public void enterSPutObjectInstruction(SmaliParser.SPutObjectInstructionContext ctx) {

	}

	@Override
	public void exitSPutObjectInstruction(SmaliParser.SPutObjectInstructionContext ctx) {

	}

	@Override
	public void enterSPutBooleanInstruction(SmaliParser.SPutBooleanInstructionContext ctx) {

	}

	@Override
	public void exitSPutBooleanInstruction(SmaliParser.SPutBooleanInstructionContext ctx) {

	}

	@Override
	public void enterSPutByteInstruction(SmaliParser.SPutByteInstructionContext ctx) {

	}

	@Override
	public void exitSPutByteInstruction(SmaliParser.SPutByteInstructionContext ctx) {

	}

	@Override
	public void enterSPutCharInstruction(SmaliParser.SPutCharInstructionContext ctx) {

	}

	@Override
	public void exitSPutCharInstruction(SmaliParser.SPutCharInstructionContext ctx) {

	}

	@Override
	public void enterSPutShortInstruction(SmaliParser.SPutShortInstructionContext ctx) {

	}

	@Override
	public void exitSPutShortInstruction(SmaliParser.SPutShortInstructionContext ctx) {

	}

	CELL_DESCRIPTION invokeResultValue = null;
	List<CELL> invokeParams = null;
	Boolean needToMonitorMoveResult = false;
	String needToMoveAndAssign = "";
	String invokeMethodDetails = "";
	boolean unsafePublicBroadcast = false;
	boolean unsafePITransfer = false;
	boolean isPossiblePAApps = false;
	boolean intentProtectedOnlyWithPackage = false;
	// boolean unsafePIAction = false;
	String notePIFlag = "";
	// boolean isLatLon = false;
	// boolean isSMSandContacts = false;
	// boolean isSMS = false;

	@Override
	public void enterInvokeVirtualInstruction(SmaliParser.InvokeVirtualInstructionContext ctx) {
		recentCellID = "";
		unsafePublicBroadcast = false;
		unsafePITransfer = false;
		int linenos = 0;
		invokeMethodDetails = "InvokeVirtual";
		needToMonitorMoveResult = true;
		invokeResultValue = new CELL_DESCRIPTION();
		List<SmaliParser.RegisterIdentifierContext> registerList = null;
		List<CELL> listOfRegisters0 = new ArrayList<>();
		String keymethodname = null;

		listOfRegisters0 = fetchListOfRegisters(ctx);

		if (listOfRegisters0 != null)
			if (!listOfRegisters0.isEmpty())
				recentCellID = listOfRegisters0.get(0).getCellId();

		if (ctx.methodInvocationTarget() != null) {
			linenos = ctx.start.getLine();
			needToMoveAndAssign = ctx.methodInvocationTarget().getText();
			String clstype = Env.r.getCls().getClassname();
			if (ctx.methodInvocationTarget().referenceOrArrayType() == null) {
				clstype = Env.r.getCls().getClassname();
			} else {
				clstype = ctx.methodInvocationTarget().referenceOrArrayType().getText();
			}
			SmaliParser.MethodSignatureContext ms = ctx.methodInvocationTarget().methodSignature();
			if (ms != null) {
				if (ms.methodIdentifier() != null) {
					String methodName = ms.methodIdentifier().getText();

					keymethodname = clstype + methodName;

					List<String> methodArgs = new ArrayList<>();
					if (ms.methodArguments() != null) {
						if (methodName.equals("putExtra")) {
							if (clstype.endsWith("/Intent;")) {
								if (ms.methodArguments().getText().endsWith("/Parcelable;")) {
									SmaliParser.RegisterListRegistersContext listOfRegisters = ctx.registerList()
											.registerListRegisters();
									if (listOfRegisters != null) {
										List<SmaliParser.RegisterIdentifierContext> list = listOfRegisters
												.registerIdentifier();
										int lastElementIndex = list.size() - 1;
										String registryOfLastElement = list.get(lastElementIndex).IDENTIFIER()
												.getText();
										CELL lastElementCell = Env.r.getMethod().getRegistry(registryOfLastElement);
										if (lastElementCell == null)
											lastElementCell = checkInGlobalRegistry(registryOfLastElement);
										if (lastElementCell != null) {
											if (lastElementCell.getCurrent_descriptions() != null)
												if (lastElementCell.getCurrent_descriptions().getInitValue() != null) {
													if (lastElementCell.getCurrent_descriptions() != null)
														if (lastElementCell.getCurrent_descriptions()
																.getClsType() != null)
															if (lastElementCell.getCurrent_descriptions().getClsType()
																	.equals("Landroid/app/PendingIntent;")) {
																if (lastElementCell.isVulnerable()) {
																	System.out.println("UNSAFE-PITransfer >> "
																			+ Env.activeSmaliFileName);
																	unsafePITransfer = true;
																}
															}
												} else {
													if (lastElementCell.getDeclaredVariableType() != null)
														if (lastElementCell.getDeclaredVariableType()
																.equals("Landroid/app/PendingIntent;")) {
															if (lastElementCell.isVulnerable()) {
																System.out.println("UNSAFE-PITransfer >> "
																		+ Env.activeSmaliFileName);
																unsafePITransfer = true;
															}
														}
												}
										}
									}
								}
							}
						}

						if (methodName.equals("setAction")) {
							if (clstype.contains("/Intent")) {
								if (ms.methodArguments().getText().endsWith("/String;")) {
									CELL targetCell = listOfRegisters0.get(0);
									if (listOfRegisters0.size() > 0) {
										for (int i = 1; i < listOfRegisters0.size(); i++) {
											String key = listOfRegisters0.get(i).getCurrent_descriptions()
													.getInitValue();
											Env.stats.setBroadcast2flagMap(key);
											targetCell.getCurrent_descriptions().setActionTag(key);
											targetCell.setVulnerable(true, VulnerabilityType.intent);
											// //System.out.println(">>>>>>>>OUT>>> " + key);
											if (key != null) {
												if (key.contains("\""))
													key = key.replaceAll("\"", "");
												Env.stats.outBroadcastTags.add(key);
											}
										}
									} else {
										String key = targetCell.getCurrent_descriptions().getInitValue();
										Env.stats.setBroadcast2flagMap(key);
										targetCell.getCurrent_descriptions().setActionTag(key);
										targetCell.setVulnerable(true, VulnerabilityType.intent);
									}
								}
							}
						}
						if (methodName.equals("sendBroadcast")) {
							boolean isUnsafeCounted = false;
							if (ms.methodArguments().getText().endsWith("/Intent;")) {
								int size = listOfRegisters0.size() - 1;
								CELL broadcastintentcell = listOfRegisters0.get(size);
								if (broadcastintentcell.isVulnerable()) {
									Env.stats.unsafeBroadcast++;
									unsafePublicBroadcast = true;
									isUnsafeCounted = true;
								}
							} else if (ms.methodArguments().getText().endsWith("/String;")) {
								int size = listOfRegisters0.size() - 1;
								CELL broadcastintentcell = listOfRegisters0.get(size);

								// broadcastintentcell.setVulnerable(false);
								// it becomes unsafe Protected Broadcast when the broadcast is using
								// permission string and that permission is not protected with Signature
								if (broadcastintentcell.isVulnerable()) {
									if (!isUnsafeCounted)
										Env.stats.unsafeBroadcast++;
									unsafePublicBroadcast = true;
									Env.stats.unsafeProtectedBroadcast++;
								}
								Env.stats.noOfProtectedBroadcast++;
							}
							Env.stats.totBroadcasts++;
						}
						if (methodName.equals("setPackage")) {
							if (clstype.contains("/Intent")) {
								if (ms.methodArguments().getText().endsWith("/String;")) {
									intentProtectedOnlyWithPackage = true;
									// unsafePIAction = false;
									listOfRegisters0.get(0).setVulnerable(false, VulnerabilityType.intent);
								}
							}
						}
						if (methodName.equals("setClass")) {
							if (clstype.contains("/Intent")) {
								if (ms.methodArguments().getText().endsWith("/Class;")) {
									intentProtectedOnlyWithPackage = false;
									// unsafePIAction = false;
									listOfRegisters0.get(0).setVulnerable(false, VulnerabilityType.intent);
								}
							}
						}
						if (methodName.equals("setComponent")) {
							if (clstype.contains("/Intent")) {
								intentProtectedOnlyWithPackage = false;
								// if (ms.methodArguments().getText().endsWith("/String;")) {
								// unsafePIAction = false;
								// //System.out.println("INSIDE SetCOMPONENT>>> " + Env.activeSmaliFileName);
								// //System.out.println("INSIDE SetCOMPONENT>>> " +
								// listOfRegisters0.get(0).toString());
								listOfRegisters0.get(0).setVulnerable(false, VulnerabilityType.intent);
								// }
							}
						}

						if (methodName.equals("writeObject") || methodName.equals("writeObjectOverride")) {
							if (clstype.endsWith("Ljava/io/ObjectOutputStream;")) {
								// if (isLatLon) {
								// isLatLon = false;
								needToMonitorMoveResult = false;
								CELL targetCell = listOfRegisters0.get(0);
								CELL lastCell = listOfRegisters0.get(1);

								if (isPossiblePAApps) {
									// Env.stats.possiblePAApps++;
									// isPossiblePAApps= false;
								}
								if (igetAlias) {
									if (aliasingPair.containsKey(lastCell.getCellId())) {
										String aliasedcellid = aliasingPair.get(lastCell.getCellId());
										CELL aliasedcell = Env.r.getMethod().getRegistry(aliasedcellid);
										if (aliasedcell == null) {
											aliasedcell = checkInGlobalRegistry(aliasedcellid);
										}
										lastCell.setCell(aliasedcell);
										igetAlias = false;
										aliasingPair.remove(lastCell.getCellId());
									}
								}
								if (lastCell.getvulnerabilityType() != null) {
									if (lastCell.getvulnerabilityType() == VulnerabilityType.pa_apps) {
										targetCell.setCurrent_descriptions(lastCell.getCurrent_descriptions());
										if (!targetCell.isVulnerable())
											targetCell.setVulnerable(lastCell.isVulnerable(),
													lastCell.getvulnerabilityType());
										if (targetCell.isVulnerable()) {
											System.out.println("INTO WRITEOBJECT ");
											System.out.println("\t" + Env.activeSmaliFileName);
											System.out.println("\t" + ctx.getText());

											Env.stats.paLocationApps++;
											Env.isMethodVulnerable = true;
											Env.r.getMethod().setVulnerable(true);
										}
									}
									if (lastCell.getvulnerabilityType() == VulnerabilityType.maybe) {
										String keymethodofcell = lastCell.keymethodname;
										if (keymethodofcell != null)
											Env.paInfectedPoints.add(keymethodofcell);
									}
								}
							}
						}

						if (methodName.equals("write")) {
							if (clstype.endsWith("Ljava/io/BufferedWriter;")) {
								// if (isLatLon) {
								// isLatLon = false;
								needToMonitorMoveResult = false;
								CELL targetCell = listOfRegisters0.get(0);
								CELL lastCell = listOfRegisters0.get(1);

								if (isPossiblePAApps) {
									// Env.stats.possiblePAApps++;
									// isPossiblePAApps= false;
								}
								if (igetAlias) {
									if (aliasingPair.containsKey(lastCell.getCellId())) {
										String aliasedcellid = aliasingPair.get(lastCell.getCellId());
										CELL aliasedcell = Env.r.getMethod().getRegistry(aliasedcellid);
										if (aliasedcell == null) {
											aliasedcell = checkInGlobalRegistry(aliasedcellid);
										}
										lastCell.setCell(aliasedcell);
										igetAlias = false;
										aliasingPair.remove(lastCell.getCellId());
									}
								}
								if (lastCell.getvulnerabilityType() != null) {
									if (lastCell.getvulnerabilityType() == VulnerabilityType.pa_apps) {
										targetCell.setCurrent_descriptions(lastCell.getCurrent_descriptions());
										if (!targetCell.isVulnerable())
											targetCell.setVulnerable(lastCell.isVulnerable(),
													lastCell.getvulnerabilityType());
										if (targetCell.isVulnerable()) {
											System.out.println("INTO Write-BufferedWriter ");
											System.out.println("\t" + Env.activeSmaliFileName);
											System.out.println("\t" + ctx.getText());

											Env.stats.paLocationApps++;
											Env.isMethodVulnerable = true;
											Env.r.getMethod().setVulnerable(true);
										}
									}
									if (lastCell.getvulnerabilityType() == VulnerabilityType.maybe) {
										String keymethodofcell = lastCell.keymethodname;
										if (keymethodofcell != null)
											Env.paInfectedPoints.add(keymethodofcell);
									}
								}
							}
						}

						if (methodName.equals("post")) {
							if (clstype != null)
								if (clstype.endsWith("Lcom/loopj/android/http/AsyncHttpClient;")) {
									// if (isLatLon) {
									// isLatLon = false;
									needToMonitorMoveResult = false;
									if (isPossiblePAApps) {
										// Env.stats.possiblePAApps++;
										// isPossiblePAApps= false;
									}

									CELL zerothCell = listOfRegisters0.get(0);
									for (int z = 1; z < listOfRegisters0.size(); z++) {
										CELL c = listOfRegisters0.get(z);
										if (zerothCell != null) {
											if (zerothCell.isVulnerable()) {
												if (zerothCell.getvulnerabilityType() != null) {
													if (zerothCell
															.getvulnerabilityType() == VulnerabilityType.pa_apps) {
														System.out.println("INTO post(AsyncHttpClient) ");
														System.out.println("\t" + Env.activeSmaliFileName);
														System.out.println("\t" + ctx.getText());

														Env.stats.paLocationApps++;
														Env.isMethodVulnerable = true;
														Env.r.getMethod().setVulnerable(true);
														break;
													} else {
														if (c.isVulnerable()) {
															zerothCell.setVulnerable(c.isVulnerable(),
																	c.getvulnerabilityType());
															break;
														}
														zerothCell.setVulnerable(false, VulnerabilityType.maybe);
													}
												} else {
													zerothCell.setVulnerable(false, VulnerabilityType.maybe);
													zerothCell.keymethodname = keymethodname;
												}
											}
											if (c != null) {
												zerothCell.setVulnerable(c.isVulnerable(), c.getvulnerabilityType());
												if (c.isVulnerable()) {
													if (c.getvulnerabilityType() == VulnerabilityType.pa_apps) {
														System.out.println("INTO post(AsyncHttpClient) - 2 ");
														System.out.println("\t" + Env.activeSmaliFileName);
														System.out.println("\t" + ctx.getText());

														Env.stats.paLocationApps++;
														Env.isMethodVulnerable = true;
														Env.r.getMethod().setVulnerable(true);
														break;
													}
												}
											}
										}
									}
									if (zerothCell.getvulnerabilityType() == VulnerabilityType.maybe) {
										String keymethodofcell = zerothCell.keymethodname;
										if (keymethodofcell != null)
											Env.paInfectedPoints.add(keymethodofcell);
									}
								}
						}

						String pointers = clstype + methodName;
						String keymethodnameWholeMethod = Env.r.getCls().getClassname()
								+ Env.r.getMethod().getMethodname();
						// InstructionThatReferesIPC thisInstruction = new
						// InstructionThatReferesIPC(pointers);
						Env.setInstruction2methodReferenceMap(keymethodnameWholeMethod, pointers);

						if (Env.methodreport.containsKey(keymethodnameWholeMethod)) {
							METHOD m = Env.methodreport.get(keymethodnameWholeMethod);
							if (m.isVulnerable()) {
								CELL targetCell = listOfRegisters0.get(0);
								targetCell.setVulnerable(true, VulnerabilityType.pa_apps);
								Env.r.getMethod().setVulnerable(true);
								Env.methodreport.put(keymethodnameWholeMethod, Env.r.getMethod());
							}
						}

						List<SmaliParser.MethodParameterTypeContext> margs = ms.methodArguments().methodParameterType();
						for (SmaliParser.MethodParameterTypeContext mp : margs) {
							methodArgs.add(mp.getText());
						}
					} else {
						// System.out.println("METHOD NAME>>>> " + methodName);
						if (methodName.equals("getLatitude")) {
							if (clstype.endsWith("Landroid/location/Location;")) {
								// isLatLon = true;
								isPossiblePAApps = true;
								needToMonitorMoveResult = false;
								CELL targetCell = listOfRegisters0.get(0);
								String key = targetCell.getCurrent_descriptions().getInitValue();
								targetCell.getCurrent_descriptions().setActionTag(key);
								targetCell.setVulnerable(true, VulnerabilityType.pa_apps);
							}
						}
						if (methodName.equals("getLongitude")) {
							if (clstype.endsWith("Landroid/location/Location;")) {
								// isLatLon = true;
								isPossiblePAApps = true;
								needToMonitorMoveResult = false;
								CELL targetCell = listOfRegisters0.get(0);
								String key = targetCell.getCurrent_descriptions().getInitValue();
								targetCell.getCurrent_descriptions().setActionTag(key);
								targetCell.setVulnerable(true, VulnerabilityType.pa_apps);
							}
						}
						if (methodName.equals("getAltitude")) {
							if (clstype.endsWith("Landroid/location/Location;")) {
								// isLatLon = true;
								isPossiblePAApps = true;
								needToMonitorMoveResult = false;
								CELL targetCell = listOfRegisters0.get(0);
								String key = targetCell.getCurrent_descriptions().getInitValue();
								targetCell.getCurrent_descriptions().setActionTag(key);
								targetCell.setVulnerable(true, VulnerabilityType.pa_apps);
							}
						}
						if (methodName.equals("getBearing")) {
							if (clstype.endsWith("Landroid/location/Location;")) {
								// isLatLon = true;
								isPossiblePAApps = true;
								needToMonitorMoveResult = false;
								CELL targetCell = listOfRegisters0.get(0);
								String key = targetCell.getCurrent_descriptions().getInitValue();
								targetCell.getCurrent_descriptions().setActionTag(key);
								targetCell.setVulnerable(true, VulnerabilityType.pa_apps);
							}
						}
						if (methodName.equals("getAccuracy")) {
							if (clstype.endsWith("Landroid/location/Location;")) {
								// isLatLon = true;
								isPossiblePAApps = true;
								needToMonitorMoveResult = false;
								CELL targetCell = listOfRegisters0.get(0);
								String key = targetCell.getCurrent_descriptions().getInitValue();
								targetCell.getCurrent_descriptions().setActionTag(key);
								targetCell.setVulnerable(true, VulnerabilityType.pa_apps);
							}
						}
						if (methodName.equals("getSpeed")) {
							if (clstype.endsWith("Landroid/location/Location;")) {
								// isLatLon = true;
								isPossiblePAApps = true;
								needToMonitorMoveResult = false;
								CELL targetCell = listOfRegisters0.get(0);
								String key = targetCell.getCurrent_descriptions().getInitValue();
								targetCell.getCurrent_descriptions().setActionTag(key);
								targetCell.setVulnerable(true, VulnerabilityType.pa_apps);
							}
						}
					}
					if (ms.methodReturnType() != null) {
						String methodReturn = ms.methodReturnType().getText();

						invokeResultValue.setCellInvocationType(clstype, methodName, methodArgs, methodReturn);
					}
				}
			}
		}

		if (ctx.registerList() != null) {
			SmaliParser.RegisterListRegistersContext listOfRegisters = ctx.registerList().registerListRegisters();

			if (listOfRegisters != null) {
				List<SmaliParser.RegisterIdentifierContext> list = listOfRegisters.registerIdentifier();

				int i = 0;
				invokeParams = new ArrayList<>();
				if (list.size() > 0) {
					String registryOfZeroElement = list.get(0).IDENTIFIER().getText();
					CELL zeroElementCell = Env.r.getMethod().getRegistry(registryOfZeroElement);
					if (zeroElementCell != null) {
						zeroElementCell.getCurrent_descriptions().setPublicBroadcast(unsafePublicBroadcast);
						// zeroElementCell.setVulnerable(unsafePIAction);
					}

					if (unsafePITransfer) {
						int sizeofcall = ctx.methodInvocationTarget().children.size();
						SmaliParser.MethodInvocationTargetContext methodInvocationTarget = ctx.methodInvocationTarget();
						String thisrefType = null;
						if (methodInvocationTarget.referenceOrArrayType() != null) {
							SmaliParser.ReferenceOrArrayTypeContext thisref = methodInvocationTarget
									.referenceOrArrayType();
							thisrefType = methodInvocationTarget.referenceOrArrayType().getText();
						}
						SmaliParser.MethodSignatureContext signatureContext = methodInvocationTarget.methodSignature();
						String methodname = signatureContext.methodIdentifier().getText();
						SmaliParser.MethodArgumentsContext args = signatureContext.methodArguments();
						if (args != null) {
							List<SmaliParser.MethodParameterTypeContext> params = args.methodParameterType();
							for (int ip = 0; ip < params.size(); ip++) {
								SmaliParser.MethodParameterTypeContext p = params.get(ip);
								if (p.getText().endsWith("/Parcelable;")) {
									int listIndex = ip + 1;
									if (listIndex <= list.size()) {
										SmaliParser.RegisterIdentifierContext identifierContext = list.get(listIndex);
										String parcelabletargetregister = identifierContext.getText();
										CELL parcelabletargetregisterCell = Env.r.getMethod()
												.getRegistry(parcelabletargetregister);
										if (parcelabletargetregisterCell == null) {
											parcelabletargetregisterCell = checkInGlobalRegistry(
													parcelabletargetregister);
										}
										if (parcelabletargetregisterCell != null) {
											if (parcelabletargetregisterCell.getDeclaredVariableType() != null) {
												if (parcelabletargetregisterCell.getDeclaredVariableType()
														.endsWith("/PendingIntent;")) {
													if (parcelabletargetregisterCell.isVulnerable()) {
														Env.activeLineNos.add(linenos);
														Env.infectedSmaliFiles.add(Env.activeSmaliFileName);
														Env.stats.unsafePITransfer++;
														if (isGoogleCDMUnsafe) {
															Env.stats.unsafeGoogleCDMTransfered++;
															isGoogleCDMUnsafe = false;
														}
													} else if (isGoogleCDMUnsafe) {
														if (intentProtectedOnlyWithPackage) {
															intentProtectedOnlyWithPackage = false;
															Env.stats.unsafeGoogleCDMTransfered++;
															isGoogleCDMUnsafe = false;
														}
													}
												}
											} else if (parcelabletargetregisterCell.getCurrent_descriptions() != null) {
												if (parcelabletargetregisterCell.getCurrent_descriptions()
														.getDescType() != null) {
													if (parcelabletargetregisterCell.getCurrent_descriptions()
															.getDescType().endsWith("/PendingIntent;")) {
														if (parcelabletargetregisterCell.isVulnerable()) {
															Env.activeLineNos.add(linenos);
															Env.infectedSmaliFiles.add(Env.activeSmaliFileName);
															Env.stats.unsafePITransfer++;
															if (isGoogleCDMUnsafe) {
																Env.stats.unsafeGoogleCDMTransfered++;
																isGoogleCDMUnsafe = false;
															}
														} else if (isGoogleCDMUnsafe) {
															if (intentProtectedOnlyWithPackage) {
																intentProtectedOnlyWithPackage = false;
																Env.stats.unsafeGoogleCDMTransfered++;
																isGoogleCDMUnsafe = false;
															}
														}
													}
												}
											} else if (parcelabletargetregisterCell.getCurrent_descriptions() != null) {
												if (parcelabletargetregisterCell.getCurrent_descriptions()
														.getObjType() != null) {
													if (parcelabletargetregisterCell.getCurrent_descriptions()
															.getObjType().endsWith("/PendingIntent;")) {
														if (parcelabletargetregisterCell.isVulnerable()) {
															Env.activeLineNos.add(linenos);
															Env.infectedSmaliFiles.add(Env.activeSmaliFileName);
															Env.stats.unsafePITransfer++;
															if (isGoogleCDMUnsafe) {
																Env.stats.unsafeGoogleCDMTransfered++;
																isGoogleCDMUnsafe = false;
															}
														} else if (isGoogleCDMUnsafe) {
															if (intentProtectedOnlyWithPackage) {
																intentProtectedOnlyWithPackage = false;
																Env.stats.unsafeGoogleCDMTransfered++;
																isGoogleCDMUnsafe = false;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
						int lastIndex = list.size() - 1;

						String registryOfLastElement = list.get(lastIndex).IDENTIFIER().getText();
						CELL lastElementCell = Env.r.getMethod().getRegistry(registryOfLastElement);
						if (lastElementCell != null) {
							int firstIndexElement = 0;
							String registryOfFirstIndexElement = list.get(firstIndexElement).IDENTIFIER().getText();
							CELL firstIndexElementCell = Env.r.getMethod().getRegistry(registryOfFirstIndexElement);
							if (firstIndexElementCell != null) {
								// //////////System.out.println("LE_Zero>> " +
								// firstIndexElementCell.getCurrent_descriptions());

								String key = firstIndexElementCell.getCurrent_descriptions().getActionTag();
								if (key != null)
									Env.stats.allBroadcasts.add(key);
								if (lastElementCell.getCurrent_descriptions().getFlagValue() != null) {
									if (key != null) {
										Env.stats.setBroadcast2flagMap(key,
												lastElementCell.getCurrent_descriptions().getFlagValue());
										Env.stats.allFlags
												.add(lastElementCell.getCurrent_descriptions().getFlagValue());
									}
								}
							}

						}
					} else if (isGoogleCDMUnsafe) {
						if (intentProtectedOnlyWithPackage) {
							intentProtectedOnlyWithPackage = false;
							Env.stats.unsafeGoogleCDMTransfered++;
							isGoogleCDMUnsafe = false;
						}
					}
				}

				List<SmaliParser.RegisterIdentifierContext> rlist = ctx.registerList().registerListRegisters()
						.registerIdentifier();
				CELL zerothCell = Env.r.getMethod().getRegistry(rlist.get(0).getText());
				if (zerothCell == null) {
					zerothCell = checkInGlobalRegistry(rlist.get(0).getText());
				}
				for (int z = 1; z < rlist.size(); z++) {
					CELL c = Env.r.getMethod().getRegistry(rlist.get(z).getText());
					if (c == null)
						c = checkInGlobalRegistry(rlist.get(z).getText());
					if (zerothCell != null) {
						if (zerothCell.isVulnerable()) {
							if (zerothCell.getvulnerabilityType() != null) {
								if (zerothCell.getvulnerabilityType() == VulnerabilityType.pa_apps)
									break;
								else {
									if (c.isVulnerable()) {
										zerothCell.setVulnerable(c.isVulnerable(), c.getvulnerabilityType());
										break;
									}
									zerothCell.setVulnerable(false, VulnerabilityType.maybe);
								}
							}
						}
						if (c != null)
							zerothCell.setVulnerable(c.isVulnerable(), c.getvulnerabilityType());
					}

				}
				if (!zerothCell.isVulnerable()) {
					zerothCell.setVulnerable(false, VulnerabilityType.maybe);
					String pointers = keymethodname;
					String keymethodnamewhole = Env.r.getCls().getClassname() + Env.r.getMethod().getMethodname();
					Env.setInstruction2methodReferenceMap(keymethodnamewhole, pointers);
					if (listOfRegisters0.get(0).getvulnerabilityType() != VulnerabilityType.pa_apps) {
						listOfRegisters0.get(0).setVulnerable(false, VulnerabilityType.maybe);
						listOfRegisters0.get(0).keymethodname = pointers;
					}
				}

				for (SmaliParser.RegisterIdentifierContext ri : list) {
					String registryid = ri.IDENTIFIER().getText();
					CELL cell = Env.r.getMethod().getRegistry(registryid);
					if (cell == null) {
						cell = new CELL(registryid);
						Env.r.getMethod().setRegistry(registryid, cell);
					}
					invokeParams.add(cell);
					if (i > 0) {
						////////// ////System.out.println("Zero>> "+list.get(0).IDENTIFIER().getText());
						if (cell.getCurrent_descriptions() != null)
							cell.getCurrent_descriptions().setPointsTo(list.get(0).IDENTIFIER().getText());
					}
					i++;
				}
			}
		}
	}

	private List<CELL> fetchListOfRegisters(SmaliParser.InvokeVirtualInstructionContext ctx) {
		ArrayList<CELL> listOfRegisters0 = null;
		if (ctx.registerList() != null) {
			if (ctx.registerList().registerListRegisters() != null) {
				listOfRegisters0 = new ArrayList<>();
				List<SmaliParser.RegisterIdentifierContext> rlist = ctx.registerList().registerListRegisters()
						.registerIdentifier();
				SmaliParser.RegisterIdentifierContext r = rlist.get(0); // zeroth cell
				CELL c = Env.r.getMethod().getRegistry(r.getText());
				if (c == null) {
					c = checkInGlobalRegistry(r.getText());
					if (c == null) {
						String registryName = r.getText();
						String registryType = "";
						if (ctx.methodInvocationTarget() != null) {
							if (ctx.methodInvocationTarget().referenceOrArrayType() != null) {
								registryType = ctx.methodInvocationTarget().referenceOrArrayType().getText();
							}
						}
						c = new CELL(registryName);
						c.setActualVariableType(registryType);
						c.setPresentVariableType(registryType);
						c.setDeclaredVariableType(registryType);
						Env.r.getMethod().setRegistry(registryName, c);
					}
				}
				listOfRegisters0.add(c);
				for (int i = 1; i < rlist.size(); i++) {
					r = rlist.get(i);
					c = Env.r.getMethod().getRegistry(r.getText());
					if (c == null) {
						c = checkInGlobalRegistry(r.getText());
						if (c == null) {
							String registryName = r.getText();
							String registryType = "";
							if (ctx.methodInvocationTarget() != null) {
								if (ctx.methodInvocationTarget().referenceOrArrayType() != null) {
									registryType = ctx.methodInvocationTarget().referenceOrArrayType().getText();
								}
							}
							c = new CELL(registryName);
							c.setActualVariableType(registryType);
							c.setPresentVariableType(registryType);
							c.setDeclaredVariableType(registryType);
							Env.r.getMethod().setRegistry(registryName, c);
						}
					}
					if (!listOfRegisters0.get(0).isVulnerable())
						listOfRegisters0.get(0).setVulnerable(c.isVulnerable(), c.getvulnerabilityType());
					listOfRegisters0.add(c);
				}
			}
		}
		return listOfRegisters0;
	}

	private CELL checkInGlobalRegistry(String parcelabletargetregister) {
		List<METHOD> methods = Env.r.getCls().getMethods();
		CELL globalregistry = null;
		for (METHOD m : methods) {
			////// ////System.out.println(m.isConstructor());
			if (m.isConstructor()) {
				globalregistry = m.getRegistry(parcelabletargetregister);
				break;
			}
		}
		return globalregistry;
	}

	@Override
	public void exitInvokeVirtualInstruction(SmaliParser.InvokeVirtualInstructionContext ctx) {

	}

	@Override
	public void enterInvokeSuperInstruction(SmaliParser.InvokeSuperInstructionContext ctx) {
		invokeMethodDetails = "InvokeSuper";
		needToMonitorMoveResult = true;
		invokeResultValue = new CELL_DESCRIPTION();
		if (ctx.methodInvocationTarget() != null) {
			needToMoveAndAssign = ctx.methodInvocationTarget().getText();
			String clstype = Env.r.getCls().getClassname();
			if (ctx.methodInvocationTarget().referenceOrArrayType() == null) {
				clstype = Env.r.getCls().getClassname();
			} else {
				clstype = ctx.methodInvocationTarget().referenceOrArrayType().getText();
			}

			SmaliParser.MethodSignatureContext ms = ctx.methodInvocationTarget().methodSignature();
			if (ms != null)
				if (ms.methodIdentifier() != null) {
					String methodName = ms.methodIdentifier().getText();
					List<String> methodArgs = new ArrayList<>();
					if (ms.methodArguments() != null) {
						List<SmaliParser.MethodParameterTypeContext> margs = ms.methodArguments().methodParameterType();
						for (SmaliParser.MethodParameterTypeContext mp : margs) {
							methodArgs.add(mp.getText());
						}
					}
					if (ms.methodReturnType() != null) {
						String methodReturn = ms.methodReturnType().getText();
						invokeResultValue.setCellInvocationType(clstype, methodName, methodArgs, methodReturn);
					}
				}
			// parseValue(ctx.methodInvocationTarget().getText());
		}

		if (ctx.registerList() != null) {
			SmaliParser.RegisterListRegistersContext listOfRegisters = ctx.registerList().registerListRegisters();

			if (listOfRegisters != null) {
				List<SmaliParser.RegisterIdentifierContext> list = listOfRegisters.registerIdentifier();

				int i = 0;
				invokeParams = new ArrayList<>();
				for (SmaliParser.RegisterIdentifierContext ri : list) {
					String registryid = ri.IDENTIFIER().getText();
					CELL cell = Env.r.getMethod().getRegistry(registryid);
					if (cell == null) {
						cell = new CELL(registryid);
						Env.r.getMethod().setRegistry(registryid, cell);
					}
					invokeParams.add(cell);
					if (i > 0) {
						////////// ////System.out.println("Zero>> "+list.get(0).IDENTIFIER().getText());
						cell.getCurrent_descriptions().setPointsTo(list.get(0).IDENTIFIER().getText());
					}
					i++;
				}
			}
		}
	}

	@Override
	public void exitInvokeSuperInstruction(SmaliParser.InvokeSuperInstructionContext ctx) {

	}

	@Override
	public void enterInvokeDirectInstruction(SmaliParser.InvokeDirectInstructionContext ctx) {
		invokeMethodDetails = "InvokeDirect";
		needToMonitorMoveResult = true;
		invokeResultValue = new CELL_DESCRIPTION();
		if (ctx.registerList() != null) {
			SmaliParser.RegisterListRegistersContext rlist = ctx.registerList().registerListRegisters();
			if (rlist != null) {
				List<SmaliParser.RegisterIdentifierContext> rids = rlist.registerIdentifier();
				if (rids.size() > 1) {
					CELL zerothCell = Env.r.getMethod().getRegistry(rids.get(0).getText());
					if (zerothCell != null) {
						for (int i = 1; i < rids.size(); i++) {
							CELL cell = Env.r.getMethod().getRegistry(rids.get(i).getText());
							if (cell == null) {
								cell = new CELL(rids.get(i).getText());
								Env.r.getMethod().setRegistry(rids.get(i).getText(), cell);
								continue;
							}
							if (cell.getCurrent_descriptions() != null)
								zerothCell.setPresentVariableType(cell.getCurrent_descriptions().getDescType());

							if (zerothCell.isVulnerable()) {
								if (zerothCell.getvulnerabilityType() != null) {
									switch (zerothCell.getvulnerabilityType()) {
									case pa_apps:
										break;
									case intent:
									case maybe:
									case pendingintent:
										if (cell.isVulnerable())
											zerothCell.setVulnerable(cell.isVulnerable(), cell.getvulnerabilityType());
									}
								}
							} else {
								zerothCell.setVulnerable(cell.isVulnerable(), cell.getvulnerabilityType());
							}
							if (!zerothCell.isGoogleCDM())
								zerothCell.setGoogleCDM(cell.isGoogleCDM());
						}
					}

					if (zerothCell != null) {
						SmaliParser.MethodSignatureContext ms = ctx.methodInvocationTarget().methodSignature();
						SmaliParser.ReferenceOrArrayTypeContext ra = ctx.methodInvocationTarget()
								.referenceOrArrayType();
						if (ra != null)
							if (ra.getText() != null) {
								if (ra.getText().endsWith("Landroid/content/Intent;")) {
									if(ctx.methodInvocationTarget() != null) {
										if(ctx.methodInvocationTarget().methodSignature() != null) {
											if(ctx.methodInvocationTarget().methodSignature().methodIdentifier() != null) {												
												String methodname = ctx.methodInvocationTarget().methodSignature()
														.methodIdentifier().getText();
												if(ctx.methodInvocationTarget().methodSignature().methodArguments() != null) {
													String methodargs = ctx.methodInvocationTarget().methodSignature().methodArguments()
															.getText();
													if (methodname.equals("<init>")) {
														if (methodargs.equals("Ljava/lang/String;")) {
															zerothCell.getCurrent_descriptions().setObjType(ra.getText());
															zerothCell.getCurrent_descriptions().setClsType(ra.getText());
															zerothCell.setVulnerable(true, VulnerabilityType.intent);
														}
													}
												}																								
											}	
										}
									}
								} else {
									for (int i = 1; i < rids.size(); i++) {
										if (!zerothCell.isVulnerable()) {
											CELL registers = Env.r.getMethod().getRegistry(rids.get(i).getText());
											if (registers != null) {
												zerothCell.setVulnerable(registers.isVulnerable(),
														registers.getvulnerabilityType());
											}
										} else
											break;
									}
								}
							}
					}

				}
				if (rids.size() == 1) {
					CELL zerothCell = Env.r.getMethod().getRegistry(rids.get(0).getText());
					if (zerothCell == null) {
						zerothCell = checkInGlobalRegistry(rids.get(0).getText());
					}
					if (zerothCell != null) {
						if (zerothCell.getvulnerabilityType() != VulnerabilityType.pa_apps)
							zerothCell.setVulnerable(false, VulnerabilityType.maybe);

						SmaliParser.MethodSignatureContext ms = ctx.methodInvocationTarget().methodSignature();
						SmaliParser.ReferenceOrArrayTypeContext ra = ctx.methodInvocationTarget()
								.referenceOrArrayType();
						if (ms == null)
							zerothCell.setVulnerable(true, VulnerabilityType.intent);
						else if (ms.methodArguments() == null) {
							if (ra != null) {
								Intent intent = new Intent();
								if (ra.getText().endsWith("/Intent;")) {
									intent.ownerAppName = Env.activePackageName;
									zerothCell.setVulnerable(true, VulnerabilityType.intent);
									zerothCell.getCurrent_descriptions().setObjType(ra.getText());
									zerothCell.getCurrent_descriptions().setClsType(ra.getText());
									zerothCell.getCurrent_descriptions().iccObjects = intent;
								}
							}
						} else {
							List<SmaliParser.MethodParameterTypeContext> margs = ms.methodArguments()
									.methodParameterType();
							if (margs == null) {
								zerothCell.setVulnerable(true, VulnerabilityType.intent);
							}
						}
						if (Env.methodreport.containsKey(keymethodname)) {
							METHOD m = Env.methodreport.get(keymethodname);
							if (zerothCell.getvulnerabilityType() != VulnerabilityType.pa_apps)
								zerothCell.setVulnerable(false, VulnerabilityType.maybe);

							if (m.isVulnerable()) {
								zerothCell.setVulnerable(true, VulnerabilityType.pa_apps);
								Env.r.getMethod().setVulnerable(true);

								String clstype = Env.r.getCls().getClassname();
								if (ctx.methodInvocationTarget().referenceOrArrayType() == null) {
									clstype = Env.r.getCls().getClassname();
								} else {
									clstype = ctx.methodInvocationTarget().referenceOrArrayType().getText();
								}
								String methodName = "";
								if (ms != null) {
									if (ms.methodIdentifier() != null) {
										methodName = ms.methodIdentifier().getText();
									}
								}
								String keymethodname = clstype + methodName;
								Env.methodreport.put(keymethodname, Env.r.getMethod());
							}
						}

					}
				}
			}
		}
		if (ctx.methodInvocationTarget() != null) {
			needToMoveAndAssign = ctx.methodInvocationTarget().getText();
			String clstype = Env.r.getCls().getClassname();
			if (ctx.methodInvocationTarget().referenceOrArrayType() == null) {
				clstype = Env.r.getCls().getClassname();
			} else {
				clstype = ctx.methodInvocationTarget().referenceOrArrayType().getText();
			}

			SmaliParser.MethodSignatureContext ms = ctx.methodInvocationTarget().methodSignature();
			if (ms != null) {
				if (ms.methodIdentifier() != null) {
					String methodName = ms.methodIdentifier().getText();
					List<String> methodArgs = new ArrayList<>();
					if (ms.methodArguments() != null) {
						List<SmaliParser.MethodParameterTypeContext> margs = ms.methodArguments().methodParameterType();
						for (SmaliParser.MethodParameterTypeContext mp : margs) {
							methodArgs.add(mp.getText());
						}
					}
					if (ms.methodReturnType() != null) {
						String methodReturn = ms.methodReturnType().getText();

						invokeResultValue.setCellInvocationType(clstype, methodName, methodArgs, methodReturn);
					}

					String pointers = clstype + methodName;
					String keymethodnamewhole = Env.r.getCls().getClassname() + Env.r.getMethod().getMethodname();
					// InstructionThatReferesIPC thisInstruction = new
					// InstructionThatReferesIPC(pointers);
					Env.setInstruction2methodReferenceMap(keymethodnamewhole, pointers);

				}
			}
			// parseValue(ctx.methodInvocationTarget().getText());
		}

		if (ctx.registerList() != null) {
			SmaliParser.RegisterListRegistersContext listOfRegisters = ctx.registerList().registerListRegisters();

			if (listOfRegisters != null) {
				List<SmaliParser.RegisterIdentifierContext> list = listOfRegisters.registerIdentifier();

				int i = 0;
				invokeParams = new ArrayList<>();
				for (SmaliParser.RegisterIdentifierContext ri : list) {
					String registryid = ri.IDENTIFIER().getText();
					CELL cell = Env.r.getMethod().getRegistry(registryid);
					if (cell == null) {
						cell = new CELL(registryid);
						Env.r.getMethod().setRegistry(registryid, cell);
					}
					invokeParams.add(cell);
					if (i > 0) {
						////////// ////System.out.println("Zero>> "+list.get(0).IDENTIFIER().getText());
						cell.getCurrent_descriptions().setPointsTo(list.get(0).IDENTIFIER().getText());
					}
					i++;
				}
			}
		}
	}

	@Override
	public void exitInvokeDirectInstruction(SmaliParser.InvokeDirectInstructionContext ctx) {

	}

	String[] piMethods = { "getActivity", "getBroadcast", "getService" };
	boolean needToIncrementPI = false;
	String recentCellID;

	@Override
	public void enterInvokeStaticInstruction(SmaliParser.InvokeStaticInstructionContext ctx) {
		recentCellID = "";
		invokeMethodDetails = "InvokeStatic";
		needToIncrementPI = false;
		needToMonitorMoveResult = true;
		invokeResultValue = new CELL_DESCRIPTION();
		String methodName = "";
		String clstype = Env.r.getCls().getClassname();
		String keymethodname = null;

		List<CELL> listOfRegisters0 = new ArrayList<>();
		if (ctx.registerList() != null) {
			if (ctx.registerList().registerListRegisters() != null) {
				List<SmaliParser.RegisterIdentifierContext> rlist = ctx.registerList().registerListRegisters()
						.registerIdentifier();
				for (SmaliParser.RegisterIdentifierContext r : rlist) {
					CELL c = Env.r.getMethod().getRegistry(r.getText());
					if (c == null) {
						c = checkInGlobalRegistry(r.getText());
						if (c == null) {
							String registryName = r.getText();
							String registryType = "";
							if (ctx.methodInvocationTarget() != null) {
								if (ctx.methodInvocationTarget().referenceOrArrayType() != null) {
									registryType = ctx.methodInvocationTarget().referenceOrArrayType().getText();
								}
							}
							c = new CELL(registryName);
							c.setActualVariableType(registryType);
							c.setPresentVariableType(registryType);
							c.setDeclaredVariableType(registryType);
							Env.r.getMethod().setRegistry(registryName, c);
						}
					}
					listOfRegisters0.add(c);
				}
			}
		}

		// //System.out.println("INTO INVOKE STATIC>>> "+Env.activeSmaliFileName);
		if (listOfRegisters0 != null)
			if (!listOfRegisters0.isEmpty())
				recentCellID = listOfRegisters0.get(0).getCellId();
		// //System.out.println("recentCellID>>>> "+recentCellID);

		if (ctx.methodInvocationTarget() != null) {
			needToMoveAndAssign = ctx.methodInvocationTarget().getText();
			if (ctx.methodInvocationTarget().referenceOrArrayType() == null) {
				clstype = Env.r.getCls().getClassname();
				// //////////System.out.println("INVOKESTATIC>>>>>>>>> "+clstype);
			} else {
				clstype = ctx.methodInvocationTarget().referenceOrArrayType().getText();
			}
			if (!listOfRegisters0.isEmpty()) {
				if (listOfRegisters0.get(0) != null) {
					listOfRegisters0.get(0).setDeclaredVariableType(clstype);
					listOfRegisters0.get(0).setPresentVariableType(clstype);
					listOfRegisters0.get(0).setActualVariableType(clstype);
					if (listOfRegisters0.get(0).getvulnerabilityType() != VulnerabilityType.pa_apps)
						listOfRegisters0.get(0).setVulnerable(false, VulnerabilityType.maybe);

					if (listOfRegisters0.get(0).getCurrent_descriptions() != null) {
						listOfRegisters0.get(0).getCurrent_descriptions().setClsType(clstype);
						listOfRegisters0.get(0).getCurrent_descriptions().setObjType(clstype);
						listOfRegisters0.get(0).getCurrent_descriptions().setInvokeMethodName(methodName);
					}
				}
			}
			SmaliParser.MethodSignatureContext ms = ctx.methodInvocationTarget().methodSignature();
			if (ms != null)
				if (ms.methodIdentifier() != null) {
					methodName = ms.methodIdentifier().getText();
					keymethodname = clstype + methodName;

					List<String> methodArgs = new ArrayList<>();
					String methodReturn = "";
					if (ms.methodReturnType() != null) {
						methodReturn = ms.methodReturnType().getText();
						invokeResultValue.setCellInvocationType(clstype, methodName, methodArgs, methodReturn);
					}

					String pointers = clstype + methodName;
					String keymethodnameWhole = Env.r.getCls().getClassname() + Env.r.getMethod().getMethodname();
					// InstructionThatReferesIPC thisInstruction = new
					// InstructionThatReferesIPC(pointers);
					if (listOfRegisters0 != null)
						if (!listOfRegisters0.isEmpty()) {
							CELL targetCell = listOfRegisters0.get(0);
							if (targetCell != null)
								if (!targetCell.isVulnerable())
									Env.setInstruction2methodReferenceMap(keymethodnameWhole, pointers);
						}
					if (Env.methodreport.containsKey(keymethodnameWhole)) {
						METHOD m = Env.methodreport.get(keymethodnameWhole);
						if (listOfRegisters0 != null) {
							if (!listOfRegisters0.isEmpty()) {
								CELL targetCell = listOfRegisters0.get(0);
								if (targetCell.getvulnerabilityType() != VulnerabilityType.pa_apps)
									targetCell.setVulnerable(false, VulnerabilityType.maybe);

								if (m.isVulnerable()) {
									targetCell.setVulnerable(true, VulnerabilityType.pa_apps);
									Env.r.getMethod().setVulnerable(true);
									Env.methodreport.put(keymethodnameWhole, Env.r.getMethod());
								}
							}
						}
					} else {
						if (listOfRegisters0 != null) {
							if (!listOfRegisters0.isEmpty()) {
								CELL zerothCell = listOfRegisters0.get(0);
								if (zerothCell.getvulnerabilityType() != VulnerabilityType.pa_apps) {
									zerothCell.setVulnerable(false, VulnerabilityType.maybe);
									zerothCell.keymethodname = keymethodname;
								}

							}
						}
					}
					if (ms.methodArguments() != null) {
						List<SmaliParser.MethodParameterTypeContext> margs = ms.methodArguments().methodParameterType();
						for (int ix = 0; ix < margs.size(); ix++) {
							SmaliParser.MethodParameterTypeContext mp = margs.get(ix);
							methodArgs.add(mp.getText());
							int jx = ix + 1;
							if (jx < listOfRegisters0.size()) {
								if (listOfRegisters0.get(jx) == null)
									continue;
								listOfRegisters0.get(jx).setDeclaredVariableType(margs.get(ix).getText());
								listOfRegisters0.get(jx).setPresentVariableType(margs.get(ix).getText());
								listOfRegisters0.get(jx).setActualVariableType(margs.get(ix).getText());
								listOfRegisters0.get(jx).getCurrent_descriptions().setClsType(margs.get(ix).getText());
								listOfRegisters0.get(jx).getCurrent_descriptions().setObjType(margs.get(ix).getText());

								if (methodReturn.endsWith("/PendingIntent;")) {
									needToIncrementPI = true;
								}
								if (margs.get(ix).getText().endsWith("/Intent;")) {
									CELL cellintent = listOfRegisters0.get(jx);
									if (cellintent.isVulnerable()) {
										if (needToIncrementPI) {
											// //System.out.println("UNSAFE-PICreation >> " + Env.activeSmaliFileName);
											Env.stats.unsafePICreation++;
											// System.out.println("isGoogleCDMFound>>>>>>>>>>>>>> "+isGoogleCDMFound);
											if (isGoogleCDMFound) {
												Env.stats.unsafeGoogleCDMCreated++;
												Env.stats.unsafeGoogleCDMFound++;
												isGoogleCDMFound = false;
												isGoogleCDMUnsafe = true;
											}
											CELL picell = listOfRegisters0.get(0);
											// //System.out.println("UNSAFE>>>> " + picell.toString());
											String pointsTo = picell.getCurrent_descriptions().getPointsTo();
											for (CELL cell : listOfRegisters0) {
												if (cell.getCellId().equals(pointsTo)) {
													// //System.out.println("UNSAFE>>>> POINTSTO>>>> " +
													// cell.toString());
												}
											}
											// if(picell == null)
											picell.setVulnerable(true, VulnerabilityType.pendingintent);
										}
									}
								}
							}
						}
						if (needToIncrementPI) {
							needToIncrementPI = false;
							Env.stats.noOfPendingIntents++;
							Env.log.append("PICOUNT >>>>>> methodReturn>> " + Env.stats.noOfPendingIntents + "=:>>"
									+ Env.stats.totalFlagCount() + Env.activeSmaliFileName + "\n");
							// increasing flag
							int flagRegistryIndex = listOfRegisters0.size() - 1;
							CELL flagRegistry = listOfRegisters0.get(flagRegistryIndex);
							CELL piRegistry = listOfRegisters0.get(0);
							if (flagRegistry.getDeclaredVariableType() != null) {
								// if (flagRegistry.getDeclaredVariableType().endsWith("/String;")) {
								// ////System.out.println(ctx.getText());
								// ////System.out.println(Env.activeSmaliFileName);
								if (flagRegistry.getCurrent_descriptions() != null) {
									String flagvalue = flagRegistry.getCurrent_descriptions().getInitValue();
									piRegistry.getCurrent_descriptions().setFlagValue(flagvalue);
								}
								// }
								// }
								// piMonitorForMultipleCreation = true;
							}
						}

						// piMonitorForMultipleCreation = false;
					}
				}
		}
		if (ctx.registerList() != null) {
			SmaliParser.RegisterListRegistersContext listOfRegisters = ctx.registerList().registerListRegisters();

			if (listOfRegisters != null) {
				List<SmaliParser.RegisterIdentifierContext> list = listOfRegisters.registerIdentifier();

				if (list.size() > 0) {
					for (String s : piMethods) {
						if (methodName.equals(s)) {
							// //////System.out.println("---------------------------------------------------------------");
							// //////System.out.println(">>>>>> "+methodName +
							// ":"+Env.stats.noOfPendingIntents);
							int lastIndex = list.size() - 1;
							String registryOfLastElement = list.get(lastIndex).IDENTIFIER().getText();
							CELL lastElementCell = Env.r.getMethod().getRegistry(registryOfLastElement);
							if (lastElementCell != null) {
								String registryOfZeroElement = list.get(0).IDENTIFIER().getText();
								CELL zeroElementCell = Env.r.getMethod().getRegistry(registryOfZeroElement);
								// if (zeroElementCell != null) {
								//// if(clstype.endsWith("/PendingIntent;")){
								//// zeroElementCell.getCurrent_descriptions().newPendingIntent();
								//// }
								// zeroElementCell.getCurrent_descriptions().setFlagValue(lastElementCell.getCurrent_descriptions().getInitValue());
								//// //////System.out.println(">>>>>> "+zeroElementCell +
								// ":"+Env.stats.FLAG_ONE_SHOT+":"+Env.stats.FLAG_IMMUTABLE);
								// }
								invokeResultValue.setFlagValueNoIncrement(
										lastElementCell.getCurrent_descriptions().getInitValue());
							}
							break;
						}
					}
				}

				int i = 0;
				invokeParams = new ArrayList<>();
				for (SmaliParser.RegisterIdentifierContext ri : list) {
					String registryid = ri.IDENTIFIER().getText();
					CELL cell = Env.r.getMethod().getRegistry(registryid);
					if (cell == null) {
						cell = new CELL(registryid);
						Env.r.getMethod().setRegistry(registryid, cell);
					}
					invokeParams.add(cell);
					if (i > 0) {
						////////// ////System.out.println("Zero>> "+list.get(0).IDENTIFIER().getText());
						cell.getCurrent_descriptions().setPointsTo(list.get(0).IDENTIFIER().getText());
					}
					i++;
				}
			}
		}
	}

	@Override
	public void exitInvokeStaticInstruction(SmaliParser.InvokeStaticInstructionContext ctx) {

	}

	@Override
	public void enterInvokeInterfaceInstruction(SmaliParser.InvokeInterfaceInstructionContext ctx) {
		invokeMethodDetails = "InvokeInterface";
		needToMonitorMoveResult = true;
		invokeResultValue = new CELL_DESCRIPTION();
		// ArrayList<CELL> listOfRegisters = fetchListOfRegisters(ctx);

		if (ctx.methodInvocationTarget() != null) {
			needToMoveAndAssign = ctx.methodInvocationTarget().getText();
			String clstype = Env.r.getCls().getClassname();
			if (ctx.methodInvocationTarget().referenceOrArrayType() == null) {
				clstype = Env.r.getCls().getClassname();
			} else {
				clstype = ctx.methodInvocationTarget().referenceOrArrayType().getText();
			}
			SmaliParser.MethodSignatureContext ms = ctx.methodInvocationTarget().methodSignature();
			if (ms != null) {
				if (ms.methodIdentifier() != null) {
					List<SmaliParser.RegisterIdentifierContext> registerList = null;
					List<CELL> listOfRegisters0 = new ArrayList<>();
					if (ctx.registerList() != null) {
						if (ctx.registerList().registerListRegisters() != null) {
							List<SmaliParser.RegisterIdentifierContext> rlist = ctx.registerList()
									.registerListRegisters().registerIdentifier();
							for (SmaliParser.RegisterIdentifierContext r : rlist) {
								CELL c = Env.r.getMethod().getRegistry(r.getText());
								if (c == null) {
									c = checkInGlobalRegistry(r.getText());
									if (c == null) {
										String registryName = r.getText();
										String registryType = "";
										if (ctx.methodInvocationTarget() != null) {
											if (ctx.methodInvocationTarget().referenceOrArrayType() != null) {
												registryType = ctx.methodInvocationTarget().referenceOrArrayType()
														.getText();
											}
										}
										c = new CELL(registryName);
										c.setActualVariableType(registryType);
										c.setPresentVariableType(registryType);
										c.setDeclaredVariableType(registryType);
										Env.r.getMethod().setRegistry(registryName, c);
									}
								}
								listOfRegisters0.add(c);
							}
						}
					}
					String methodName = ms.methodIdentifier().getText();
					List<String> methodArgs = new ArrayList<>();
					if (ms.methodArguments() != null) {
						List<SmaliParser.MethodParameterTypeContext> margs = ms.methodArguments().methodParameterType();
						for (SmaliParser.MethodParameterTypeContext mp : margs) {
							methodArgs.add(mp.getText());
						}
					}
					if (ms.methodReturnType() != null) {
						String methodReturn = ms.methodReturnType().getText();

						invokeResultValue.setCellInvocationType(clstype, methodName, methodArgs, methodReturn);
					}

					String methodname = ms.methodIdentifier().getText();
					if (methodname.equals("execute")) {
						if (clstype.endsWith("Lorg/apache/http/client/HttpClient;")) {
							// isSMSandContacts = true;
							isPossiblePAApps = true;
							needToMonitorMoveResult = false;
							CELL targetCell = listOfRegisters0.get(0);
							CELL secondCell = listOfRegisters0.get(1);
							String key = targetCell.getCurrent_descriptions().getInitValue();
							if (secondCell.isVulnerable()) {
								if (secondCell.getvulnerabilityType() == VulnerabilityType.pa_apps) {
									// Env.stats.possiblePAApps++;
									System.out.println("INTO execute(HttpClient) - 2 ");
									System.out.println("\t" + Env.activeSmaliFileName);
									System.out.println("\t" + ctx.getText());

									Env.stats.paLocationApps++;
									Env.isMethodVulnerable = true;
									Env.r.getMethod().setVulnerable(true);
								}
								targetCell.getCurrent_descriptions().setActionTag(key);
								targetCell.setVulnerable(secondCell.isVulnerable(), secondCell.getvulnerabilityType()); // sms
							}
						} else if (clstype.endsWith("Lokhttp3/Call;")) {
							// isSMSandContacts = true;
							isPossiblePAApps = true;
							needToMonitorMoveResult = false;
							CELL targetCell = listOfRegisters0.get(0);
							// CELL secondCell = listOfRegisters0.get(1);
							String key = targetCell.getCurrent_descriptions().getInitValue();
							if (targetCell.isVulnerable()) {
								if (targetCell.getvulnerabilityType() == VulnerabilityType.pa_apps) {
									// Env.stats.possiblePAApps++;
									System.out.println("INTO execute(Lokhttp3) - 2 ");
									System.out.println("\t" + Env.activeSmaliFileName);
									System.out.println("\t" + ctx.getText());

									Env.stats.paLocationApps++;
									Env.isMethodVulnerable = true;
									Env.r.getMethod().setVulnerable(true);
								}
							}
						}
					}

				}

			}
			// parseValue(ctx.methodInvocationTarget().getText());
		}

		if (ctx.registerList() != null) {
			SmaliParser.RegisterListRegistersContext listOfRegisters = ctx.registerList().registerListRegisters();
			ArrayList<CELL> listOfRegisters0 = new ArrayList<>();

			if (listOfRegisters != null) {
				List<SmaliParser.RegisterIdentifierContext> list = listOfRegisters.registerIdentifier();

				SmaliParser.RegisterIdentifierContext r = list.get(0); // zeroth cell
				CELL c = Env.r.getMethod().getRegistry(r.getText());
				if (c == null) {
					c = checkInGlobalRegistry(r.getText());
					if (c == null) {
						String registryName = r.getText();
						String registryType = "";
						if (ctx.methodInvocationTarget() != null) {
							if (ctx.methodInvocationTarget().referenceOrArrayType() != null) {
								registryType = ctx.methodInvocationTarget().referenceOrArrayType().getText();
							}
						}
						c = new CELL(registryName);
						c.setActualVariableType(registryType);
						c.setPresentVariableType(registryType);
						c.setDeclaredVariableType(registryType);
						Env.r.getMethod().setRegistry(registryName, c);
					}
				}
				listOfRegisters0.add(c);
				for (int i = 1; i < list.size(); i++) {
					r = list.get(i);
					c = Env.r.getMethod().getRegistry(r.getText());
					if (c == null) {
						c = checkInGlobalRegistry(r.getText());
						if (c == null) {
							String registryName = r.getText();
							String registryType = "";
							if (ctx.methodInvocationTarget() != null) {
								if (ctx.methodInvocationTarget().referenceOrArrayType() != null) {
									registryType = ctx.methodInvocationTarget().referenceOrArrayType().getText();
								}
							}
							c = new CELL(registryName);
							c.setActualVariableType(registryType);
							c.setPresentVariableType(registryType);
							c.setDeclaredVariableType(registryType);
							Env.r.getMethod().setRegistry(registryName, c);
						}
					}
					if (!listOfRegisters0.get(0).isVulnerable())
						listOfRegisters0.get(0).setVulnerable(true, c.getvulnerabilityType());
					else {
						if (listOfRegisters0 != null) {
							if (listOfRegisters0.get(0) != null) {
								if (listOfRegisters0.get(0).getvulnerabilityType() != null)
									switch (listOfRegisters0.get(0).getvulnerabilityType()) {
									case pa_apps:
										break;
									default:
										listOfRegisters0.get(0).setVulnerable(true, c.getvulnerabilityType());
									}
							}
						}

					}
					listOfRegisters0.add(c);
				}

				int i = 0;
				invokeParams = new ArrayList<>();
				for (SmaliParser.RegisterIdentifierContext ri : list) {
					String registryid = ri.IDENTIFIER().getText();
					CELL cell = Env.r.getMethod().getRegistry(registryid);
					if (cell == null) {
						cell = new CELL(registryid);
						Env.r.getMethod().setRegistry(registryid, cell);
					}
					invokeParams.add(cell);
					if (i > 0) {
						////////// ////System.out.println("Zero>> "+list.get(0).IDENTIFIER().getText());
						cell.getCurrent_descriptions().setPointsTo(list.get(0).IDENTIFIER().getText());
					}
					i++;
				}
			}
		}
	}

	@Override
	public void exitInvokeInterfaceInstruction(SmaliParser.InvokeInterfaceInstructionContext ctx) {

	}

	@Override
	public void enterInvokeVirtualRangeInstruction(SmaliParser.InvokeVirtualRangeInstructionContext ctx) {
		invokeMethodDetails = "enterInvokeVirtualRangeInstruction";
		SmaliParser.RegisterRangeContext rrange = ctx.registerRange();
		ArrayList<CELL> listOfRegisters0 = new ArrayList<>();
		String keyreferencename = null;

		if (rrange != null) {
			SmaliParser.LeftRegisterContext left = rrange.leftRegister();
			SmaliParser.RightRegisterContext right = rrange.rightRegister();
			String reg = "v";
			int leftindex = Integer.parseInt(left.getText().replaceAll("[^0-9]", ""));
			int rightindex = Integer.parseInt(right.getText().replaceAll("[^0-9]", ""));
			for (int i = leftindex; i <= rightindex; i++) {
				String regID = reg + i;
				CELL regcells = Env.r.getMethod().getRegistry(regID);
				if (regcells == null) {
					regcells = checkInGlobalRegistry(regID);
					if (regcells == null) {
						regcells = new CELL(regID);
						Env.r.getMethod().setRegistry(regID, regcells);
					}
				}
				listOfRegisters0.add(regcells);
			}
		}
		if (listOfRegisters0 != null) {
			if (!listOfRegisters0.isEmpty()) {
				recentCellID = listOfRegisters0.get(0).getCellId();
			}
		}

		SmaliParser.MethodInvocationTargetContext methods = ctx.methodInvocationTarget();
		SmaliParser.ReferenceOrArrayTypeContext referencetype = methods.referenceOrArrayType();
		if (referencetype != null) {
			String clstype = referencetype.getText();
			SmaliParser.MethodSignatureContext methodctx = methods.methodSignature();
			if (methodctx != null) {
				if (methodctx.methodIdentifier() != null) {
					String methodName = methodctx.methodIdentifier().getText();
					keyreferencename = clstype + methodName;

					if (methodName.equals("getLatitude")) {
						if (clstype.endsWith("Landroid/location/Location;")) {
							isPossiblePAApps = true;
							needToMonitorMoveResult = false;
							CELL targetCell = listOfRegisters0.get(0);
							String key = targetCell.getCurrent_descriptions().getInitValue();
							targetCell.getCurrent_descriptions().setActionTag(key);
							targetCell.setVulnerable(true, VulnerabilityType.pa_apps);
						}
					}
					if (methodName.equals("getLongitude")) {
						if (clstype.endsWith("Landroid/location/Location;")) {
							isPossiblePAApps = true;
							needToMonitorMoveResult = false;
							CELL targetCell = listOfRegisters0.get(0);
							String key = targetCell.getCurrent_descriptions().getInitValue();
							targetCell.getCurrent_descriptions().setActionTag(key);
							targetCell.setVulnerable(true, VulnerabilityType.pa_apps);
						}
					}

					String pointers = clstype + methodName;
					String keymethodnamewhole = Env.r.getCls().getClassname() + Env.r.getMethod().getMethodname();
					// InstructionThatReferesIPC thisInstruction = new
					// InstructionThatReferesIPC(pointers);
					Env.setInstruction2methodReferenceMap(keymethodnamewhole, pointers);
					if (listOfRegisters0.get(0).getvulnerabilityType() != VulnerabilityType.pa_apps) {
						listOfRegisters0.get(0).setVulnerable(false, VulnerabilityType.maybe);
						listOfRegisters0.get(0).keymethodname = keyreferencename;
					}

					if (Env.methodreport.containsKey(keymethodname)) {
						METHOD m = Env.methodreport.get(keymethodname);
						if (m.isVulnerable()) {
							CELL targetCell = listOfRegisters0.get(0);
							targetCell.setVulnerable(true, VulnerabilityType.pa_apps);
							Env.r.getMethod().setVulnerable(true);
							Env.methodreport.put(keymethodname, Env.r.getMethod());
						}
					}
				}
			}
		}

		CELL zerothCell = listOfRegisters0.get(0);
		for (int z = 1; z < listOfRegisters0.size(); z++) {
			CELL c = listOfRegisters0.get(z);
			if (zerothCell != null) {
				if (zerothCell.isVulnerable()) {
					if (zerothCell.getvulnerabilityType() != null) {
						if (zerothCell.getvulnerabilityType() == VulnerabilityType.pa_apps) {
							break;
						} else {
							if (c.isVulnerable()) {
								zerothCell.setVulnerable(c.isVulnerable(), c.getvulnerabilityType());
								zerothCell.keymethodname = keyreferencename;
								break;
							}
							zerothCell.setVulnerable(false, VulnerabilityType.maybe);
							zerothCell.keymethodname = keyreferencename;
						}
					} else {
						zerothCell.setVulnerable(false, VulnerabilityType.maybe);
						zerothCell.keymethodname = keyreferencename;
					}
				}
				if (c != null) {
					zerothCell.setVulnerable(c.isVulnerable(), c.getvulnerabilityType());
					if (c.isVulnerable()) {
						if (c.getvulnerabilityType() == VulnerabilityType.pa_apps) {
							zerothCell.setVulnerable(c.isVulnerable(), c.getvulnerabilityType());
							zerothCell.keymethodname = keyreferencename;
							break;
						}
					}
				}
			}
		}
		if (zerothCell.getvulnerabilityType() == VulnerabilityType.maybe) {
			String keymethodofcell = zerothCell.keymethodname;
			if (keymethodofcell != null)
				Env.paInfectedPoints.add(keymethodofcell);
		}
	}

	@Override
	public void exitInvokeVirtualRangeInstruction(SmaliParser.InvokeVirtualRangeInstructionContext ctx) {

	}

	@Override
	public void enterInvokeSuperRangeInstruction(SmaliParser.InvokeSuperRangeInstructionContext ctx) {
		invokeMethodDetails = "enterInvokeSuperRangeInstruction";
	}

	@Override
	public void exitInvokeSuperRangeInstruction(SmaliParser.InvokeSuperRangeInstructionContext ctx) {

	}

	@Override
	public void enterInvokeDirectRangeInstruction(SmaliParser.InvokeDirectRangeInstructionContext ctx) {
		invokeMethodDetails = "enterInvokeDirectRangeInstruction";
	}

	@Override
	public void exitInvokeDirectRangeInstruction(SmaliParser.InvokeDirectRangeInstructionContext ctx) {

	}

	@Override
	public void enterInvokeStaticRangeInstruction(SmaliParser.InvokeStaticRangeInstructionContext ctx) {
		invokeMethodDetails = "enterInvokeStaticRangeInstruction";

		// if(methodName.equals("newPlacesSearchRequest")) {
		// System.out.println("enterInvokeStaticRangeInstruction>>
		// "+Env.activeSmaliFileName);
		// System.out.println("enterInvokeStaticRangeInstruction>> "+ctx.getText());
		// }
	}

	@Override
	public void exitInvokeStaticRangeInstruction(SmaliParser.InvokeStaticRangeInstructionContext ctx) {

	}

	@Override
	public void enterInvokeInterfaceRangeInstruction(SmaliParser.InvokeInterfaceRangeInstructionContext ctx) {
		invokeMethodDetails = "enterInvokeInterfaceRangeInstruction";
	}

	@Override
	public void exitInvokeInterfaceRangeInstruction(SmaliParser.InvokeInterfaceRangeInstructionContext ctx) {

	}

	@Override
	public void enterIntToLongInstruction(SmaliParser.IntToLongInstructionContext ctx) {

	}

	@Override
	public void exitIntToLongInstruction(SmaliParser.IntToLongInstructionContext ctx) {

	}

	@Override
	public void enterIntToFloatInstruction(SmaliParser.IntToFloatInstructionContext ctx) {

	}

	@Override
	public void exitIntToFloatInstruction(SmaliParser.IntToFloatInstructionContext ctx) {

	}

	@Override
	public void enterIntToDoubleInstruction(SmaliParser.IntToDoubleInstructionContext ctx) {

	}

	@Override
	public void exitIntToDoubleInstruction(SmaliParser.IntToDoubleInstructionContext ctx) {

	}

	@Override
	public void enterLongToIntInstruction(SmaliParser.LongToIntInstructionContext ctx) {

	}

	@Override
	public void exitLongToIntInstruction(SmaliParser.LongToIntInstructionContext ctx) {

	}

	@Override
	public void enterLongToFloatInstruction(SmaliParser.LongToFloatInstructionContext ctx) {

	}

	@Override
	public void exitLongToFloatInstruction(SmaliParser.LongToFloatInstructionContext ctx) {

	}

	@Override
	public void enterLongToDoubleInstruction(SmaliParser.LongToDoubleInstructionContext ctx) {

	}

	@Override
	public void exitLongToDoubleInstruction(SmaliParser.LongToDoubleInstructionContext ctx) {

	}

	@Override
	public void enterFloatToIntInstruction(SmaliParser.FloatToIntInstructionContext ctx) {

	}

	@Override
	public void exitFloatToIntInstruction(SmaliParser.FloatToIntInstructionContext ctx) {

	}

	@Override
	public void enterFloatToLongInstruction(SmaliParser.FloatToLongInstructionContext ctx) {

	}

	@Override
	public void exitFloatToLongInstruction(SmaliParser.FloatToLongInstructionContext ctx) {

	}

	@Override
	public void enterFloatToDoubleInstruction(SmaliParser.FloatToDoubleInstructionContext ctx) {

	}

	@Override
	public void exitFloatToDoubleInstruction(SmaliParser.FloatToDoubleInstructionContext ctx) {

	}

	@Override
	public void enterDoubleToIntInstruction(SmaliParser.DoubleToIntInstructionContext ctx) {

	}

	@Override
	public void exitDoubleToIntInstruction(SmaliParser.DoubleToIntInstructionContext ctx) {

	}

	@Override
	public void enterDoubleToLongInstruction(SmaliParser.DoubleToLongInstructionContext ctx) {

	}

	@Override
	public void exitDoubleToLongInstruction(SmaliParser.DoubleToLongInstructionContext ctx) {

	}

	@Override
	public void enterDoubleToFloatInstruction(SmaliParser.DoubleToFloatInstructionContext ctx) {

	}

	@Override
	public void exitDoubleToFloatInstruction(SmaliParser.DoubleToFloatInstructionContext ctx) {

	}

	@Override
	public void enterIntToByteInstruction(SmaliParser.IntToByteInstructionContext ctx) {

	}

	@Override
	public void exitIntToByteInstruction(SmaliParser.IntToByteInstructionContext ctx) {

	}

	@Override
	public void enterIntToCharInstruction(SmaliParser.IntToCharInstructionContext ctx) {

	}

	@Override
	public void exitIntToCharInstruction(SmaliParser.IntToCharInstructionContext ctx) {

	}

	@Override
	public void enterIntToShortInstruction(SmaliParser.IntToShortInstructionContext ctx) {

	}

	@Override
	public void exitIntToShortInstruction(SmaliParser.IntToShortInstructionContext ctx) {

	}

	@Override
	public void enterIfLabel(SmaliParser.IfLabelContext ctx) {

	}

	@Override
	public void exitIfLabel(SmaliParser.IfLabelContext ctx) {

	}

	@Override
	public void enterIfEqzInstruction(SmaliParser.IfEqzInstructionContext ctx) {

	}

	@Override
	public void exitIfEqzInstruction(SmaliParser.IfEqzInstructionContext ctx) {

	}

	@Override
	public void enterIfNezInstruction(SmaliParser.IfNezInstructionContext ctx) {

	}

	@Override
	public void exitIfNezInstruction(SmaliParser.IfNezInstructionContext ctx) {

	}

	@Override
	public void enterIfLtzInstruction(SmaliParser.IfLtzInstructionContext ctx) {

	}

	@Override
	public void exitIfLtzInstruction(SmaliParser.IfLtzInstructionContext ctx) {

	}

	@Override
	public void enterIfGezInstruction(SmaliParser.IfGezInstructionContext ctx) {

	}

	@Override
	public void exitIfGezInstruction(SmaliParser.IfGezInstructionContext ctx) {

	}

	@Override
	public void enterIfGtzInstruction(SmaliParser.IfGtzInstructionContext ctx) {

	}

	@Override
	public void exitIfGtzInstruction(SmaliParser.IfGtzInstructionContext ctx) {

	}

	@Override
	public void enterIfLezInstruction(SmaliParser.IfLezInstructionContext ctx) {

	}

	@Override
	public void exitIfLezInstruction(SmaliParser.IfLezInstructionContext ctx) {

	}

	@Override
	public void enterNegIntInstruction(SmaliParser.NegIntInstructionContext ctx) {

	}

	@Override
	public void exitNegIntInstruction(SmaliParser.NegIntInstructionContext ctx) {

	}

	@Override
	public void enterNotIntInstruction(SmaliParser.NotIntInstructionContext ctx) {

	}

	@Override
	public void exitNotIntInstruction(SmaliParser.NotIntInstructionContext ctx) {

	}

	@Override
	public void enterNegLongInstruction(SmaliParser.NegLongInstructionContext ctx) {

	}

	@Override
	public void exitNegLongInstruction(SmaliParser.NegLongInstructionContext ctx) {

	}

	@Override
	public void enterNotLongInstruction(SmaliParser.NotLongInstructionContext ctx) {

	}

	@Override
	public void exitNotLongInstruction(SmaliParser.NotLongInstructionContext ctx) {

	}

	@Override
	public void enterNegFloatInstruction(SmaliParser.NegFloatInstructionContext ctx) {

	}

	@Override
	public void exitNegFloatInstruction(SmaliParser.NegFloatInstructionContext ctx) {

	}

	@Override
	public void enterNegDoubleInstruction(SmaliParser.NegDoubleInstructionContext ctx) {

	}

	@Override
	public void exitNegDoubleInstruction(SmaliParser.NegDoubleInstructionContext ctx) {

	}

	@Override
	public void enterIfEqInstruction(SmaliParser.IfEqInstructionContext ctx) {

	}

	@Override
	public void exitIfEqInstruction(SmaliParser.IfEqInstructionContext ctx) {

	}

	@Override
	public void enterIfNeInstruction(SmaliParser.IfNeInstructionContext ctx) {

	}

	@Override
	public void exitIfNeInstruction(SmaliParser.IfNeInstructionContext ctx) {

	}

	@Override
	public void enterIfLtInstruction(SmaliParser.IfLtInstructionContext ctx) {

	}

	@Override
	public void exitIfLtInstruction(SmaliParser.IfLtInstructionContext ctx) {

	}

	@Override
	public void enterIfGeInstruction(SmaliParser.IfGeInstructionContext ctx) {

	}

	@Override
	public void exitIfGeInstruction(SmaliParser.IfGeInstructionContext ctx) {

	}

	@Override
	public void enterIfGtInstruction(SmaliParser.IfGtInstructionContext ctx) {

	}

	@Override
	public void exitIfGtInstruction(SmaliParser.IfGtInstructionContext ctx) {

	}

	@Override
	public void enterIfLeInstruction(SmaliParser.IfLeInstructionContext ctx) {

	}

	@Override
	public void exitIfLeInstruction(SmaliParser.IfLeInstructionContext ctx) {

	}

	@Override
	public void enterAddInt2addrInstruction(SmaliParser.AddInt2addrInstructionContext ctx) {

	}

	@Override
	public void exitAddInt2addrInstruction(SmaliParser.AddInt2addrInstructionContext ctx) {

	}

	@Override
	public void enterSubInt2addrInstruction(SmaliParser.SubInt2addrInstructionContext ctx) {

	}

	@Override
	public void exitSubInt2addrInstruction(SmaliParser.SubInt2addrInstructionContext ctx) {

	}

	@Override
	public void enterMulInt2addrInstruction(SmaliParser.MulInt2addrInstructionContext ctx) {

	}

	@Override
	public void exitMulInt2addrInstruction(SmaliParser.MulInt2addrInstructionContext ctx) {

	}

	@Override
	public void enterDivInt2addrInstruction(SmaliParser.DivInt2addrInstructionContext ctx) {

	}

	@Override
	public void exitDivInt2addrInstruction(SmaliParser.DivInt2addrInstructionContext ctx) {

	}

	@Override
	public void enterRemInt2addrInstruction(SmaliParser.RemInt2addrInstructionContext ctx) {

	}

	@Override
	public void exitRemInt2addrInstruction(SmaliParser.RemInt2addrInstructionContext ctx) {

	}

	@Override
	public void enterAndInt2addrInstruction(SmaliParser.AndInt2addrInstructionContext ctx) {

	}

	@Override
	public void exitAndInt2addrInstruction(SmaliParser.AndInt2addrInstructionContext ctx) {

	}

	@Override
	public void enterOrInt2addrInstruction(SmaliParser.OrInt2addrInstructionContext ctx) {

	}

	@Override
	public void exitOrInt2addrInstruction(SmaliParser.OrInt2addrInstructionContext ctx) {

	}

	@Override
	public void enterXorInt2addrInstruction(SmaliParser.XorInt2addrInstructionContext ctx) {

	}

	@Override
	public void exitXorInt2addrInstruction(SmaliParser.XorInt2addrInstructionContext ctx) {

	}

	@Override
	public void enterShlInt2addrInstruction(SmaliParser.ShlInt2addrInstructionContext ctx) {

	}

	@Override
	public void exitShlInt2addrInstruction(SmaliParser.ShlInt2addrInstructionContext ctx) {

	}

	@Override
	public void enterShrInt2addrInstruction(SmaliParser.ShrInt2addrInstructionContext ctx) {

	}

	@Override
	public void exitShrInt2addrInstruction(SmaliParser.ShrInt2addrInstructionContext ctx) {

	}

	@Override
	public void enterUshrInt2addrInstruction(SmaliParser.UshrInt2addrInstructionContext ctx) {

	}

	@Override
	public void exitUshrInt2addrInstruction(SmaliParser.UshrInt2addrInstructionContext ctx) {

	}

	@Override
	public void enterAddLong2addrInstruction(SmaliParser.AddLong2addrInstructionContext ctx) {

	}

	@Override
	public void exitAddLong2addrInstruction(SmaliParser.AddLong2addrInstructionContext ctx) {

	}

	@Override
	public void enterSubLong2addrInstruction(SmaliParser.SubLong2addrInstructionContext ctx) {

	}

	@Override
	public void exitSubLong2addrInstruction(SmaliParser.SubLong2addrInstructionContext ctx) {

	}

	@Override
	public void enterMulLong2addrInstruction(SmaliParser.MulLong2addrInstructionContext ctx) {

	}

	@Override
	public void exitMulLong2addrInstruction(SmaliParser.MulLong2addrInstructionContext ctx) {

	}

	@Override
	public void enterDivLong2addrInstruction(SmaliParser.DivLong2addrInstructionContext ctx) {

	}

	@Override
	public void exitDivLong2addrInstruction(SmaliParser.DivLong2addrInstructionContext ctx) {

	}

	@Override
	public void enterRemLong2addrInstruction(SmaliParser.RemLong2addrInstructionContext ctx) {

	}

	@Override
	public void exitRemLong2addrInstruction(SmaliParser.RemLong2addrInstructionContext ctx) {

	}

	@Override
	public void enterAndLong2addrInstruction(SmaliParser.AndLong2addrInstructionContext ctx) {

	}

	@Override
	public void exitAndLong2addrInstruction(SmaliParser.AndLong2addrInstructionContext ctx) {

	}

	@Override
	public void enterOrLong2addrInstruction(SmaliParser.OrLong2addrInstructionContext ctx) {

	}

	@Override
	public void exitOrLong2addrInstruction(SmaliParser.OrLong2addrInstructionContext ctx) {

	}

	@Override
	public void enterXorLong2addrInstruction(SmaliParser.XorLong2addrInstructionContext ctx) {

	}

	@Override
	public void exitXorLong2addrInstruction(SmaliParser.XorLong2addrInstructionContext ctx) {

	}

	@Override
	public void enterShlLong2addrInstruction(SmaliParser.ShlLong2addrInstructionContext ctx) {

	}

	@Override
	public void exitShlLong2addrInstruction(SmaliParser.ShlLong2addrInstructionContext ctx) {

	}

	@Override
	public void enterShrLong2addrInstruction(SmaliParser.ShrLong2addrInstructionContext ctx) {

	}

	@Override
	public void exitShrLong2addrInstruction(SmaliParser.ShrLong2addrInstructionContext ctx) {

	}

	@Override
	public void enterUshrLong2addrInstruction(SmaliParser.UshrLong2addrInstructionContext ctx) {

	}

	@Override
	public void exitUshrLong2addrInstruction(SmaliParser.UshrLong2addrInstructionContext ctx) {

	}

	@Override
	public void enterAddFloat2addrInstruction(SmaliParser.AddFloat2addrInstructionContext ctx) {

	}

	@Override
	public void exitAddFloat2addrInstruction(SmaliParser.AddFloat2addrInstructionContext ctx) {

	}

	@Override
	public void enterSubFloat2addrInstruction(SmaliParser.SubFloat2addrInstructionContext ctx) {

	}

	@Override
	public void exitSubFloat2addrInstruction(SmaliParser.SubFloat2addrInstructionContext ctx) {

	}

	@Override
	public void enterMulFloat2addrInstruction(SmaliParser.MulFloat2addrInstructionContext ctx) {

	}

	@Override
	public void exitMulFloat2addrInstruction(SmaliParser.MulFloat2addrInstructionContext ctx) {

	}

	@Override
	public void enterDivFloat2addrInstruction(SmaliParser.DivFloat2addrInstructionContext ctx) {

	}

	@Override
	public void exitDivFloat2addrInstruction(SmaliParser.DivFloat2addrInstructionContext ctx) {

	}

	@Override
	public void enterRemFloat2addrInstruction(SmaliParser.RemFloat2addrInstructionContext ctx) {

	}

	@Override
	public void exitRemFloat2addrInstruction(SmaliParser.RemFloat2addrInstructionContext ctx) {

	}

	@Override
	public void enterAddDouble2addrInstruction(SmaliParser.AddDouble2addrInstructionContext ctx) {

	}

	@Override
	public void exitAddDouble2addrInstruction(SmaliParser.AddDouble2addrInstructionContext ctx) {

	}

	@Override
	public void enterSubDouble2addrInstruction(SmaliParser.SubDouble2addrInstructionContext ctx) {

	}

	@Override
	public void exitSubDouble2addrInstruction(SmaliParser.SubDouble2addrInstructionContext ctx) {

	}

	@Override
	public void enterMulDouble2addrInstruction(SmaliParser.MulDouble2addrInstructionContext ctx) {

	}

	@Override
	public void exitMulDouble2addrInstruction(SmaliParser.MulDouble2addrInstructionContext ctx) {

	}

	@Override
	public void enterDivDouble2addrInstruction(SmaliParser.DivDouble2addrInstructionContext ctx) {

	}

	@Override
	public void exitDivDouble2addrInstruction(SmaliParser.DivDouble2addrInstructionContext ctx) {

	}

	@Override
	public void enterRemDouble2addrInstruction(SmaliParser.RemDouble2addrInstructionContext ctx) {

	}

	@Override
	public void exitRemDouble2addrInstruction(SmaliParser.RemDouble2addrInstructionContext ctx) {

	}

	@Override
	public void enterCmplFloatInstruction(SmaliParser.CmplFloatInstructionContext ctx) {

	}

	@Override
	public void exitCmplFloatInstruction(SmaliParser.CmplFloatInstructionContext ctx) {

	}

	@Override
	public void enterCmpgFloatInstruction(SmaliParser.CmpgFloatInstructionContext ctx) {

	}

	@Override
	public void exitCmpgFloatInstruction(SmaliParser.CmpgFloatInstructionContext ctx) {

	}

	@Override
	public void enterCmplDoubleInstruction(SmaliParser.CmplDoubleInstructionContext ctx) {

	}

	@Override
	public void exitCmplDoubleInstruction(SmaliParser.CmplDoubleInstructionContext ctx) {

	}

	@Override
	public void enterCmpgDoubleInstruction(SmaliParser.CmpgDoubleInstructionContext ctx) {

	}

	@Override
	public void exitCmpgDoubleInstruction(SmaliParser.CmpgDoubleInstructionContext ctx) {

	}

	@Override
	public void enterCmpLongInstruction(SmaliParser.CmpLongInstructionContext ctx) {

	}

	@Override
	public void exitCmpLongInstruction(SmaliParser.CmpLongInstructionContext ctx) {

	}

	@Override
	public void enterField(SmaliParser.FieldContext ctx) {

	}

	@Override
	public void exitField(SmaliParser.FieldContext ctx) {

	}

	@Override
	public void enterArrayRegister(SmaliParser.ArrayRegisterContext ctx) {

	}

	@Override
	public void exitArrayRegister(SmaliParser.ArrayRegisterContext ctx) {

	}

	@Override
	public void enterIndexRegister(SmaliParser.IndexRegisterContext ctx) {

	}

	@Override
	public void exitIndexRegister(SmaliParser.IndexRegisterContext ctx) {

	}

	@Override
	public void enterInstanceRegister(SmaliParser.InstanceRegisterContext ctx) {

	}

	@Override
	public void exitInstanceRegister(SmaliParser.InstanceRegisterContext ctx) {

	}

	@Override
	public void enterSourceRegister(SmaliParser.SourceRegisterContext ctx) {

	}

	@Override
	public void exitSourceRegister(SmaliParser.SourceRegisterContext ctx) {

	}

	@Override
	public void enterTargetRegister(SmaliParser.TargetRegisterContext ctx) {

	}

	@Override
	public void exitTargetRegister(SmaliParser.TargetRegisterContext ctx) {

	}

	@Override
	public void enterInstanceField(SmaliParser.InstanceFieldContext ctx) {

	}

	@Override
	public void exitInstanceField(SmaliParser.InstanceFieldContext ctx) {

	}

	@Override
	public void enterAgetInstruction(SmaliParser.AgetInstructionContext ctx) {

	}

	@Override
	public void exitAgetInstruction(SmaliParser.AgetInstructionContext ctx) {

	}

	@Override
	public void enterAgetWideInstruction(SmaliParser.AgetWideInstructionContext ctx) {

	}

	@Override
	public void exitAgetWideInstruction(SmaliParser.AgetWideInstructionContext ctx) {

	}

	@Override
	public void enterAgetObjectInstruction(SmaliParser.AgetObjectInstructionContext ctx) {

	}

	@Override
	public void exitAgetObjectInstruction(SmaliParser.AgetObjectInstructionContext ctx) {

	}

	@Override
	public void enterAgetBooleanInstruction(SmaliParser.AgetBooleanInstructionContext ctx) {

	}

	@Override
	public void exitAgetBooleanInstruction(SmaliParser.AgetBooleanInstructionContext ctx) {

	}

	@Override
	public void enterAgetByteInstruction(SmaliParser.AgetByteInstructionContext ctx) {

	}

	@Override
	public void exitAgetByteInstruction(SmaliParser.AgetByteInstructionContext ctx) {

	}

	@Override
	public void enterAgetCharInstruction(SmaliParser.AgetCharInstructionContext ctx) {

	}

	@Override
	public void exitAgetCharInstruction(SmaliParser.AgetCharInstructionContext ctx) {

	}

	@Override
	public void enterAgetShortInstruction(SmaliParser.AgetShortInstructionContext ctx) {

	}

	@Override
	public void exitAgetShortInstruction(SmaliParser.AgetShortInstructionContext ctx) {

	}

	@Override
	public void enterAputInstruction(SmaliParser.AputInstructionContext ctx) {

	}

	@Override
	public void exitAputInstruction(SmaliParser.AputInstructionContext ctx) {

	}

	@Override
	public void enterAputWideInstruction(SmaliParser.AputWideInstructionContext ctx) {

	}

	@Override
	public void exitAputWideInstruction(SmaliParser.AputWideInstructionContext ctx) {

	}

	@Override
	public void enterAputObjectInstruction(SmaliParser.AputObjectInstructionContext ctx) {

	}

	@Override
	public void exitAputObjectInstruction(SmaliParser.AputObjectInstructionContext ctx) {

	}

	@Override
	public void enterAputBooleanInstruction(SmaliParser.AputBooleanInstructionContext ctx) {

	}

	@Override
	public void exitAputBooleanInstruction(SmaliParser.AputBooleanInstructionContext ctx) {

	}

	@Override
	public void enterAputByteInstruction(SmaliParser.AputByteInstructionContext ctx) {

	}

	@Override
	public void exitAputByteInstruction(SmaliParser.AputByteInstructionContext ctx) {

	}

	@Override
	public void enterAputCharInstruction(SmaliParser.AputCharInstructionContext ctx) {

	}

	@Override
	public void exitAputCharInstruction(SmaliParser.AputCharInstructionContext ctx) {

	}

	@Override
	public void enterAputShortInstruction(SmaliParser.AputShortInstructionContext ctx) {

	}

	@Override
	public void exitAputShortInstruction(SmaliParser.AputShortInstructionContext ctx) {

	}

	@Override
	public void enterIgetInstruction(SmaliParser.IgetInstructionContext ctx) {

	}

	@Override
	public void exitIgetInstruction(SmaliParser.IgetInstructionContext ctx) {

	}

	@Override
	public void enterIgetWideInstruction(SmaliParser.IgetWideInstructionContext ctx) {

	}

	@Override
	public void exitIgetWideInstruction(SmaliParser.IgetWideInstructionContext ctx) {

	}

	private HashMap<String, String> aliasingPair = new HashMap<>();
	boolean igetAlias = false;

	@Override
	public void enterIgetObjectInstruction(SmaliParser.IgetObjectInstructionContext ctx) {
		// aliasing
		// iget-object v8, v7,
		// Lcom/cloudmessage/lavernabenchmark/ContactStruct;->location:Lcom/cloudmessage/lavernabenchmark/ContactStruct$LocationData;
		String targetRegister = ctx.targetRegister().getText();
		String sourceRegister = ctx.instanceRegister().getText();
		CELL targetCell = Env.r.getMethod().getRegistry(targetRegister);
		CELL sourceCell = Env.r.getMethod().getRegistry(sourceRegister);

		if (targetCell == null) {
			targetCell = checkInGlobalRegistry(targetRegister);
		}
		if (targetCell == null) {
			targetCell = new CELL(targetRegister);
			Env.r.getMethod().setRegistry(targetRegister, targetCell);
		}
		if (sourceCell == null)
			sourceCell = checkInGlobalRegistry(sourceRegister);
		if (sourceCell == null) {
			sourceCell = new CELL(sourceRegister);
		}
		targetCell.setCell(sourceCell);

		aliasingPair.put(sourceRegister, targetRegister);
		igetAlias = true;
	}

	@Override
	public void exitIgetObjectInstruction(SmaliParser.IgetObjectInstructionContext ctx) {

	}

	@Override
	public void enterIgetBooleanInstruction(SmaliParser.IgetBooleanInstructionContext ctx) {

	}

	@Override
	public void exitIgetBooleanInstruction(SmaliParser.IgetBooleanInstructionContext ctx) {

	}

	@Override
	public void enterIgetByteInstruction(SmaliParser.IgetByteInstructionContext ctx) {

	}

	@Override
	public void exitIgetByteInstruction(SmaliParser.IgetByteInstructionContext ctx) {

	}

	@Override
	public void enterIgetCharInstruction(SmaliParser.IgetCharInstructionContext ctx) {

	}

	@Override
	public void exitIgetCharInstruction(SmaliParser.IgetCharInstructionContext ctx) {

	}

	@Override
	public void enterIgetShortInstruction(SmaliParser.IgetShortInstructionContext ctx) {

	}

	@Override
	public void exitIgetShortInstruction(SmaliParser.IgetShortInstructionContext ctx) {

	}

	@Override
	public void enterIputInstruction(SmaliParser.IputInstructionContext ctx) {
		if (ctx.instanceField() != null) {
			if (ctx.instanceField().fieldInvocationTarget() != null) {
				if (ctx.instanceField().fieldInvocationTarget().referenceOrArrayType() == null) {
					////// ////System.out.println("REFTYPE>>>>"+ctx.instanceField().fieldInvocationTarget().referenceOrArrayType()
					////// +":>> "+Env.r.getCls().getClassname());
				}
			}
		}
	}

	@Override
	public void exitIputInstruction(SmaliParser.IputInstructionContext ctx) {

	}

	@Override
	public void enterIputWideInstruction(SmaliParser.IputWideInstructionContext ctx) {
		if (ctx.instanceField() != null) {
			if (ctx.instanceField().fieldInvocationTarget() != null) {
				if (ctx.instanceField().fieldInvocationTarget().referenceOrArrayType() == null) {
					////// ////System.out.println("REFTYPE>>>>"+ctx.instanceField().fieldInvocationTarget().referenceOrArrayType()
					////// +":>> "+Env.r.getCls().getClassname());
				}
			}
		}
	}

	@Override
	public void exitIputWideInstruction(SmaliParser.IputWideInstructionContext ctx) {

	}

	@Override
	public void enterIputObjectInstruction(SmaliParser.IputObjectInstructionContext ctx) {
		if (ctx.instanceField() != null) {
			if (ctx.instanceField().fieldInvocationTarget() != null) {
				if (ctx.instanceField().fieldInvocationTarget().referenceOrArrayType() == null) {
					////// ////System.out.println("REFTYPE>>>>"+ctx.instanceField().fieldInvocationTarget().referenceOrArrayType()
					////// +":>> "+Env.r.getCls().getClassname());
				}
			}
		}
	}

	@Override
	public void exitIputObjectInstruction(SmaliParser.IputObjectInstructionContext ctx) {

	}

	@Override
	public void enterIputBooleanInstruction(SmaliParser.IputBooleanInstructionContext ctx) {
		if (ctx.instanceField() != null) {
			if (ctx.instanceField().fieldInvocationTarget() != null) {
				if (ctx.instanceField().fieldInvocationTarget().referenceOrArrayType() == null) {
					////// ////System.out.println("REFTYPE>>>>"+ctx.instanceField().fieldInvocationTarget().referenceOrArrayType()
					////// +":>> "+Env.r.getCls().getClassname());
				}
			}
		}
	}

	@Override
	public void exitIputBooleanInstruction(SmaliParser.IputBooleanInstructionContext ctx) {

	}

	@Override
	public void enterIputByteInstruction(SmaliParser.IputByteInstructionContext ctx) {

	}

	@Override
	public void exitIputByteInstruction(SmaliParser.IputByteInstructionContext ctx) {

	}

	@Override
	public void enterIputCharInstruction(SmaliParser.IputCharInstructionContext ctx) {

	}

	@Override
	public void exitIputCharInstruction(SmaliParser.IputCharInstructionContext ctx) {

	}

	@Override
	public void enterIputShortInstruction(SmaliParser.IputShortInstructionContext ctx) {

	}

	@Override
	public void exitIputShortInstruction(SmaliParser.IputShortInstructionContext ctx) {

	}

	@Override
	public void enterAddIntInstruction(SmaliParser.AddIntInstructionContext ctx) {

	}

	@Override
	public void exitAddIntInstruction(SmaliParser.AddIntInstructionContext ctx) {

	}

	@Override
	public void enterSubIntInstruction(SmaliParser.SubIntInstructionContext ctx) {

	}

	@Override
	public void exitSubIntInstruction(SmaliParser.SubIntInstructionContext ctx) {

	}

	@Override
	public void enterMulIntInstruction(SmaliParser.MulIntInstructionContext ctx) {

	}

	@Override
	public void exitMulIntInstruction(SmaliParser.MulIntInstructionContext ctx) {

	}

	@Override
	public void enterDivIntInstruction(SmaliParser.DivIntInstructionContext ctx) {

	}

	@Override
	public void exitDivIntInstruction(SmaliParser.DivIntInstructionContext ctx) {

	}

	@Override
	public void enterRemIntInstruction(SmaliParser.RemIntInstructionContext ctx) {

	}

	@Override
	public void exitRemIntInstruction(SmaliParser.RemIntInstructionContext ctx) {

	}

	@Override
	public void enterAndIntInstruction(SmaliParser.AndIntInstructionContext ctx) {

	}

	@Override
	public void exitAndIntInstruction(SmaliParser.AndIntInstructionContext ctx) {

	}

	@Override
	public void enterOrIntInstruction(SmaliParser.OrIntInstructionContext ctx) {

	}

	@Override
	public void exitOrIntInstruction(SmaliParser.OrIntInstructionContext ctx) {

	}

	@Override
	public void enterXorIntInstruction(SmaliParser.XorIntInstructionContext ctx) {

	}

	@Override
	public void exitXorIntInstruction(SmaliParser.XorIntInstructionContext ctx) {

	}

	@Override
	public void enterShlIntInstruction(SmaliParser.ShlIntInstructionContext ctx) {

	}

	@Override
	public void exitShlIntInstruction(SmaliParser.ShlIntInstructionContext ctx) {

	}

	@Override
	public void enterShrIntInstruction(SmaliParser.ShrIntInstructionContext ctx) {

	}

	@Override
	public void exitShrIntInstruction(SmaliParser.ShrIntInstructionContext ctx) {

	}

	@Override
	public void enterUshrIntInstruction(SmaliParser.UshrIntInstructionContext ctx) {

	}

	@Override
	public void exitUshrIntInstruction(SmaliParser.UshrIntInstructionContext ctx) {

	}

	@Override
	public void enterRsubIntInstruction(SmaliParser.RsubIntInstructionContext ctx) {

	}

	@Override
	public void exitRsubIntInstruction(SmaliParser.RsubIntInstructionContext ctx) {

	}

	@Override
	public void enterAddLongInstruction(SmaliParser.AddLongInstructionContext ctx) {

	}

	@Override
	public void exitAddLongInstruction(SmaliParser.AddLongInstructionContext ctx) {

	}

	@Override
	public void enterSubLongInstruction(SmaliParser.SubLongInstructionContext ctx) {

	}

	@Override
	public void exitSubLongInstruction(SmaliParser.SubLongInstructionContext ctx) {

	}

	@Override
	public void enterMulLongInstruction(SmaliParser.MulLongInstructionContext ctx) {

	}

	@Override
	public void exitMulLongInstruction(SmaliParser.MulLongInstructionContext ctx) {

	}

	@Override
	public void enterDivLongInstruction(SmaliParser.DivLongInstructionContext ctx) {

	}

	@Override
	public void exitDivLongInstruction(SmaliParser.DivLongInstructionContext ctx) {

	}

	@Override
	public void enterRemLongInstruction(SmaliParser.RemLongInstructionContext ctx) {

	}

	@Override
	public void exitRemLongInstruction(SmaliParser.RemLongInstructionContext ctx) {

	}

	@Override
	public void enterAndLongInstruction(SmaliParser.AndLongInstructionContext ctx) {

	}

	@Override
	public void exitAndLongInstruction(SmaliParser.AndLongInstructionContext ctx) {

	}

	@Override
	public void enterOrLongInstruction(SmaliParser.OrLongInstructionContext ctx) {

	}

	@Override
	public void exitOrLongInstruction(SmaliParser.OrLongInstructionContext ctx) {

	}

	@Override
	public void enterXorLongInstruction(SmaliParser.XorLongInstructionContext ctx) {

	}

	@Override
	public void exitXorLongInstruction(SmaliParser.XorLongInstructionContext ctx) {

	}

	@Override
	public void enterShlLongInstruction(SmaliParser.ShlLongInstructionContext ctx) {

	}

	@Override
	public void exitShlLongInstruction(SmaliParser.ShlLongInstructionContext ctx) {

	}

	@Override
	public void enterShrLongInstruction(SmaliParser.ShrLongInstructionContext ctx) {

	}

	@Override
	public void exitShrLongInstruction(SmaliParser.ShrLongInstructionContext ctx) {

	}

	@Override
	public void enterUshrLongInstruction(SmaliParser.UshrLongInstructionContext ctx) {

	}

	@Override
	public void exitUshrLongInstruction(SmaliParser.UshrLongInstructionContext ctx) {

	}

	@Override
	public void enterAddFloatInstruction(SmaliParser.AddFloatInstructionContext ctx) {

	}

	@Override
	public void exitAddFloatInstruction(SmaliParser.AddFloatInstructionContext ctx) {

	}

	@Override
	public void enterSubFloatInstruction(SmaliParser.SubFloatInstructionContext ctx) {

	}

	@Override
	public void exitSubFloatInstruction(SmaliParser.SubFloatInstructionContext ctx) {

	}

	@Override
	public void enterMulFloatInstruction(SmaliParser.MulFloatInstructionContext ctx) {

	}

	@Override
	public void exitMulFloatInstruction(SmaliParser.MulFloatInstructionContext ctx) {

	}

	@Override
	public void enterDivFloatInstruction(SmaliParser.DivFloatInstructionContext ctx) {

	}

	@Override
	public void exitDivFloatInstruction(SmaliParser.DivFloatInstructionContext ctx) {

	}

	@Override
	public void enterRemFloatInstruction(SmaliParser.RemFloatInstructionContext ctx) {

	}

	@Override
	public void exitRemFloatInstruction(SmaliParser.RemFloatInstructionContext ctx) {

	}

	@Override
	public void enterAddDoubleInstruction(SmaliParser.AddDoubleInstructionContext ctx) {

	}

	@Override
	public void exitAddDoubleInstruction(SmaliParser.AddDoubleInstructionContext ctx) {

	}

	@Override
	public void enterSubDoubleInstruction(SmaliParser.SubDoubleInstructionContext ctx) {

	}

	@Override
	public void exitSubDoubleInstruction(SmaliParser.SubDoubleInstructionContext ctx) {

	}

	@Override
	public void enterMulDoubleInstruction(SmaliParser.MulDoubleInstructionContext ctx) {

	}

	@Override
	public void exitMulDoubleInstruction(SmaliParser.MulDoubleInstructionContext ctx) {

	}

	@Override
	public void enterDivDoubleInstruction(SmaliParser.DivDoubleInstructionContext ctx) {

	}

	@Override
	public void exitDivDoubleInstruction(SmaliParser.DivDoubleInstructionContext ctx) {

	}

	@Override
	public void enterRemDoubleInstruction(SmaliParser.RemDoubleInstructionContext ctx) {

	}

	@Override
	public void exitRemDoubleInstruction(SmaliParser.RemDoubleInstructionContext ctx) {

	}

	@Override
	public void enterAddIntLit16Instruction(SmaliParser.AddIntLit16InstructionContext ctx) {

	}

	@Override
	public void exitAddIntLit16Instruction(SmaliParser.AddIntLit16InstructionContext ctx) {

	}

	@Override
	public void enterMulIntLit16Instruction(SmaliParser.MulIntLit16InstructionContext ctx) {

	}

	@Override
	public void exitMulIntLit16Instruction(SmaliParser.MulIntLit16InstructionContext ctx) {

	}

	@Override
	public void enterDivIntLit16Instruction(SmaliParser.DivIntLit16InstructionContext ctx) {

	}

	@Override
	public void exitDivIntLit16Instruction(SmaliParser.DivIntLit16InstructionContext ctx) {

	}

	@Override
	public void enterRemIntLit16Instruction(SmaliParser.RemIntLit16InstructionContext ctx) {

	}

	@Override
	public void exitRemIntLit16Instruction(SmaliParser.RemIntLit16InstructionContext ctx) {

	}

	@Override
	public void enterAndIntLit16Instruction(SmaliParser.AndIntLit16InstructionContext ctx) {

	}

	@Override
	public void exitAndIntLit16Instruction(SmaliParser.AndIntLit16InstructionContext ctx) {

	}

	@Override
	public void enterOrIntLit16Instruction(SmaliParser.OrIntLit16InstructionContext ctx) {

	}

	@Override
	public void exitOrIntLit16Instruction(SmaliParser.OrIntLit16InstructionContext ctx) {

	}

	@Override
	public void enterXorIntLit16Instruction(SmaliParser.XorIntLit16InstructionContext ctx) {

	}

	@Override
	public void exitXorIntLit16Instruction(SmaliParser.XorIntLit16InstructionContext ctx) {

	}

	@Override
	public void enterAddIntLit8Instruction(SmaliParser.AddIntLit8InstructionContext ctx) {

	}

	@Override
	public void exitAddIntLit8Instruction(SmaliParser.AddIntLit8InstructionContext ctx) {

	}

	@Override
	public void enterRsubIntLit8Instruction(SmaliParser.RsubIntLit8InstructionContext ctx) {

	}

	@Override
	public void exitRsubIntLit8Instruction(SmaliParser.RsubIntLit8InstructionContext ctx) {

	}

	@Override
	public void enterMulIntLit8Instruction(SmaliParser.MulIntLit8InstructionContext ctx) {

	}

	@Override
	public void exitMulIntLit8Instruction(SmaliParser.MulIntLit8InstructionContext ctx) {

	}

	@Override
	public void enterDivIntLit8Instruction(SmaliParser.DivIntLit8InstructionContext ctx) {

	}

	@Override
	public void exitDivIntLit8Instruction(SmaliParser.DivIntLit8InstructionContext ctx) {

	}

	@Override
	public void enterRemIntLit8Instruction(SmaliParser.RemIntLit8InstructionContext ctx) {

	}

	@Override
	public void exitRemIntLit8Instruction(SmaliParser.RemIntLit8InstructionContext ctx) {

	}

	@Override
	public void enterAndIntLit8Instruction(SmaliParser.AndIntLit8InstructionContext ctx) {

	}

	@Override
	public void exitAndIntLit8Instruction(SmaliParser.AndIntLit8InstructionContext ctx) {

	}

	@Override
	public void enterOrIntLit8Instruction(SmaliParser.OrIntLit8InstructionContext ctx) {

	}

	@Override
	public void exitOrIntLit8Instruction(SmaliParser.OrIntLit8InstructionContext ctx) {

	}

	@Override
	public void enterXorIntLit8Instruction(SmaliParser.XorIntLit8InstructionContext ctx) {

	}

	@Override
	public void exitXorIntLit8Instruction(SmaliParser.XorIntLit8InstructionContext ctx) {

	}

	@Override
	public void enterShlIntLit8Instruction(SmaliParser.ShlIntLit8InstructionContext ctx) {

	}

	@Override
	public void exitShlIntLit8Instruction(SmaliParser.ShlIntLit8InstructionContext ctx) {

	}

	@Override
	public void enterShrIntLit8Instruction(SmaliParser.ShrIntLit8InstructionContext ctx) {

	}

	@Override
	public void exitShrIntLit8Instruction(SmaliParser.ShrIntLit8InstructionContext ctx) {

	}

	@Override
	public void enterUshrIntLit8Instruction(SmaliParser.UshrIntLit8InstructionContext ctx) {

	}

	@Override
	public void exitUshrIntLit8Instruction(SmaliParser.UshrIntLit8InstructionContext ctx) {

	}

	@Override
	public void enterNewInstanceType(SmaliParser.NewInstanceTypeContext ctx) {

	}

	@Override
	public void exitNewInstanceType(SmaliParser.NewInstanceTypeContext ctx) {

	}

	@Override
	public void enterNewInstanceInstruction(SmaliParser.NewInstanceInstructionContext ctx) {
		CELL cell = new CELL(ctx.targetRegister().getText(), ctx.newInstanceType().getText(),
				CELL_DESCRIPTION.T_REFERENCE);
		Env.r.getMethod().setRegistry(ctx.targetRegister().getText(), cell);
		if (ctx.newInstanceType().getText().endsWith("/Intent;")) {
			Env.stats.noOfIntents++;
		}
		if (ctx.newInstanceType().getText().endsWith("/PendingIntent;")) {
			Env.stats.noOfPendingIntents++;
		}
		if (ctx.newInstanceType().getText().endsWith("Ljava/io/ObjectOutputStream;")) {
			Env.stats.noOfOutputStreamObject++;
		}
	}

	@Override
	public void exitNewInstanceInstruction(SmaliParser.NewInstanceInstructionContext ctx) {

	}

	@Override
	public void enterCheckCastType(SmaliParser.CheckCastTypeContext ctx) {

	}

	@Override
	public void exitCheckCastType(SmaliParser.CheckCastTypeContext ctx) {

	}

	@Override
	public void enterCheckCastInstruction(SmaliParser.CheckCastInstructionContext ctx) {

	}

	@Override
	public void exitCheckCastInstruction(SmaliParser.CheckCastInstructionContext ctx) {

	}

	@Override
	public void enterArrayLengthInstruction(SmaliParser.ArrayLengthInstructionContext ctx) {

	}

	@Override
	public void exitArrayLengthInstruction(SmaliParser.ArrayLengthInstructionContext ctx) {

	}

	@Override
	public void enterArrayElementType(SmaliParser.ArrayElementTypeContext ctx) {

	}

	@Override
	public void exitArrayElementType(SmaliParser.ArrayElementTypeContext ctx) {

	}

	@Override
	public void enterArrayElementRegisterRange(SmaliParser.ArrayElementRegisterRangeContext ctx) {

	}

	@Override
	public void exitArrayElementRegisterRange(SmaliParser.ArrayElementRegisterRangeContext ctx) {

	}

	@Override
	public void enterArrayElementRegisters(SmaliParser.ArrayElementRegistersContext ctx) {

	}

	@Override
	public void exitArrayElementRegisters(SmaliParser.ArrayElementRegistersContext ctx) {

	}

	@Override
	public void enterFilledNewArrayRangeInstruction(SmaliParser.FilledNewArrayRangeInstructionContext ctx) {

	}

	@Override
	public void exitFilledNewArrayRangeInstruction(SmaliParser.FilledNewArrayRangeInstructionContext ctx) {

	}

	@Override
	public void enterFilledNewArrayInstruction(SmaliParser.FilledNewArrayInstructionContext ctx) {

	}

	@Override
	public void exitFilledNewArrayInstruction(SmaliParser.FilledNewArrayInstructionContext ctx) {

	}

	@Override
	public void enterFilledArrayDataLabel(SmaliParser.FilledArrayDataLabelContext ctx) {

	}

	@Override
	public void exitFilledArrayDataLabel(SmaliParser.FilledArrayDataLabelContext ctx) {

	}

	@Override
	public void enterFillArrayDataInstruction(SmaliParser.FillArrayDataInstructionContext ctx) {

	}

	@Override
	public void exitFillArrayDataInstruction(SmaliParser.FillArrayDataInstructionContext ctx) {

	}

	@Override
	public void enterCheckInstanceType(SmaliParser.CheckInstanceTypeContext ctx) {

	}

	@Override
	public void exitCheckInstanceType(SmaliParser.CheckInstanceTypeContext ctx) {

	}

	@Override
	public void enterInstanceOfInstruction(SmaliParser.InstanceOfInstructionContext ctx) {

	}

	@Override
	public void exitInstanceOfInstruction(SmaliParser.InstanceOfInstructionContext ctx) {

	}

	@Override
	public void enterArraySizeRegister(SmaliParser.ArraySizeRegisterContext ctx) {

	}

	@Override
	public void exitArraySizeRegister(SmaliParser.ArraySizeRegisterContext ctx) {

	}

	@Override
	public void enterNewArrayInstruction(SmaliParser.NewArrayInstructionContext ctx) {

	}

	@Override
	public void exitNewArrayInstruction(SmaliParser.NewArrayInstructionContext ctx) {

	}

	@Override
	public void enterPackedSwitchRegister(SmaliParser.PackedSwitchRegisterContext ctx) {

	}

	@Override
	public void exitPackedSwitchRegister(SmaliParser.PackedSwitchRegisterContext ctx) {

	}

	@Override
	public void enterPackedSwitchLabel(SmaliParser.PackedSwitchLabelContext ctx) {

	}

	@Override
	public void exitPackedSwitchLabel(SmaliParser.PackedSwitchLabelContext ctx) {

	}

	@Override
	public void enterSparseSwitchRegister(SmaliParser.SparseSwitchRegisterContext ctx) {

	}

	@Override
	public void exitSparseSwitchRegister(SmaliParser.SparseSwitchRegisterContext ctx) {

	}

	@Override
	public void enterSparseSwitchLabel(SmaliParser.SparseSwitchLabelContext ctx) {

	}

	@Override
	public void exitSparseSwitchLabel(SmaliParser.SparseSwitchLabelContext ctx) {

	}

	@Override
	public void enterPackedSwitchInstruction(SmaliParser.PackedSwitchInstructionContext ctx) {

	}

	@Override
	public void exitPackedSwitchInstruction(SmaliParser.PackedSwitchInstructionContext ctx) {

	}

	@Override
	public void enterSparseSwitchInstruction(SmaliParser.SparseSwitchInstructionContext ctx) {

	}

	@Override
	public void exitSparseSwitchInstruction(SmaliParser.SparseSwitchInstructionContext ctx) {

	}

	@Override
	public void enterInvokePolymorphicInstruction(SmaliParser.InvokePolymorphicInstructionContext ctx) {

	}

	@Override
	public void exitInvokePolymorphicInstruction(SmaliParser.InvokePolymorphicInstructionContext ctx) {

	}

	@Override
	public void enterInvokePolymorphicRangeInstruction(SmaliParser.InvokePolymorphicRangeInstructionContext ctx) {

	}

	@Override
	public void exitInvokePolymorphicRangeInstruction(SmaliParser.InvokePolymorphicRangeInstructionContext ctx) {

	}

	@Override
	public void enterInvokeCustomInstruction(SmaliParser.InvokeCustomInstructionContext ctx) {

	}

	@Override
	public void exitInvokeCustomInstruction(SmaliParser.InvokeCustomInstructionContext ctx) {

	}

	@Override
	public void enterInvokeCustomRangeInstruction(SmaliParser.InvokeCustomRangeInstructionContext ctx) {

	}

	@Override
	public void exitInvokeCustomRangeInstruction(SmaliParser.InvokeCustomRangeInstructionContext ctx) {

	}

	@Override
	public void enterInvokeConstMethodHandleInstruction(SmaliParser.InvokeConstMethodHandleInstructionContext ctx) {

	}

	@Override
	public void exitInvokeConstMethodHandleInstruction(SmaliParser.InvokeConstMethodHandleInstructionContext ctx) {

	}

	@Override
	public void enterInvokeConstMethodTypeInstruction(SmaliParser.InvokeConstMethodTypeInstructionContext ctx) {

	}

	@Override
	public void exitInvokeConstMethodTypeInstruction(SmaliParser.InvokeConstMethodTypeInstructionContext ctx) {

	}

	@Override
	public void enterBinaryInstruction(SmaliParser.BinaryInstructionContext ctx) {

	}

	@Override
	public void exitBinaryInstruction(SmaliParser.BinaryInstructionContext ctx) {

	}

	@Override
	public void enterTernaryInstruction(SmaliParser.TernaryInstructionContext ctx) {

	}

	@Override
	public void exitTernaryInstruction(SmaliParser.TernaryInstructionContext ctx) {

	}

	@Override
	public void enterInstruction(SmaliParser.InstructionContext ctx) {

	}

	@Override
	public void exitInstruction(SmaliParser.InstructionContext ctx) {

	}

	@Override
	public void enterMethodInvocationTarget(SmaliParser.MethodInvocationTargetContext ctx) {

	}

	@Override
	public void exitMethodInvocationTarget(SmaliParser.MethodInvocationTargetContext ctx) {

	}

	@Override
	public void enterFieldInvocationTarget(SmaliParser.FieldInvocationTargetContext ctx) {

	}

	@Override
	public void exitFieldInvocationTarget(SmaliParser.FieldInvocationTargetContext ctx) {

	}

	@Override
	public void enterFieldName(SmaliParser.FieldNameContext ctx) {

	}

	@Override
	public void exitFieldName(SmaliParser.FieldNameContext ctx) {

	}

	@Override
	public void enterFieldType(SmaliParser.FieldTypeContext ctx) {

	}

	@Override
	public void exitFieldType(SmaliParser.FieldTypeContext ctx) {

	}

	@Override
	public void enterFieldNameAndType(SmaliParser.FieldNameAndTypeContext ctx) {

	}

	@Override
	public void exitFieldNameAndType(SmaliParser.FieldNameAndTypeContext ctx) {

	}

	FIELDS field = null;

	@Override
	public void enterFieldDirective(SmaliParser.FieldDirectiveContext ctx) {
		field = new FIELDS();
		List<SmaliParser.FieldModifierContext> modifiers = ctx.fieldModifier();
		for (SmaliParser.FieldModifierContext m : modifiers) {
			field.fieldModifiers.add(m.getText());
		}
		if (ctx.fieldNameAndType() != null) {
			field.fieldNameAndType = ctx.fieldNameAndType().getText();
		}
		if (ctx.assignableValue() != null) {
			field.assignableValue = ctx.assignableValue().getText();
		}
	}

	@Override
	public void exitFieldDirective(SmaliParser.FieldDirectiveContext ctx) {
		Env.r.getCls().setFields(field);
	}

	@Override
	public void enterClassName(SmaliParser.ClassNameContext ctx) {
		Env.r.getCls().setClassname(ctx.getText());
	}

	@Override
	public void exitClassName(SmaliParser.ClassNameContext ctx) {

	}

	@Override
	public void enterImplementationName(SmaliParser.ImplementationNameContext ctx) {

	}

	@Override
	public void exitImplementationName(SmaliParser.ImplementationNameContext ctx) {

	}

	String className = "";

	@Override
	public void enterClassDirective(SmaliParser.ClassDirectiveContext ctx) {
		Env.r.newClass();
		if (ctx.className() != null) {
			className = ctx.className().getText();
		}
	}

	@Override
	public void exitClassDirective(SmaliParser.ClassDirectiveContext ctx) {

	}

	@Override
	public void enterImplementationDirective(SmaliParser.ImplementationDirectiveContext ctx) {
		Env.r.getCls().setImplementsClasses(ctx.implementationName().getText());
	}

	@Override
	public void exitImplementationDirective(SmaliParser.ImplementationDirectiveContext ctx) {

	}

	@Override
	public void enterSuperName(SmaliParser.SuperNameContext ctx) {
		Env.r.getCls().setSuperclassname(ctx.getText());
	}

	@Override
	public void exitSuperName(SmaliParser.SuperNameContext ctx) {

	}

	@Override
	public void enterSuperDirective(SmaliParser.SuperDirectiveContext ctx) {

	}

	@Override
	public void exitSuperDirective(SmaliParser.SuperDirectiveContext ctx) {

	}

	@Override
	public void enterSourceName(SmaliParser.SourceNameContext ctx) {
		Env.r.getCls().setSourceFileName(ctx.getText());
	}

	@Override
	public void exitSourceName(SmaliParser.SourceNameContext ctx) {

	}

	@Override
	public void enterSourceDirective(SmaliParser.SourceDirectiveContext ctx) {

	}

	@Override
	public void exitSourceDirective(SmaliParser.SourceDirectiveContext ctx) {

	}

	@Override
	public void enterMethodIdentifier(SmaliParser.MethodIdentifierContext ctx) {

	}

	@Override
	public void exitMethodIdentifier(SmaliParser.MethodIdentifierContext ctx) {

	}

	@Override
	public void enterMethodReturnType(SmaliParser.MethodReturnTypeContext ctx) {
		Env.r.getMethod().setReturntype(ctx.getText());
	}

	@Override
	public void exitMethodReturnType(SmaliParser.MethodReturnTypeContext ctx) {

	}

	@Override
	public void enterMethodParameterType(SmaliParser.MethodParameterTypeContext ctx) {

	}

	@Override
	public void exitMethodParameterType(SmaliParser.MethodParameterTypeContext ctx) {

	}

	@Override
	public void enterMethodArguments(SmaliParser.MethodArgumentsContext ctx) {

	}

	@Override
	public void exitMethodArguments(SmaliParser.MethodArgumentsContext ctx) {

	}

	@Override
	public void enterMethodSignature(SmaliParser.MethodSignatureContext ctx) {

	}

	@Override
	public void exitMethodSignature(SmaliParser.MethodSignatureContext ctx) {

	}

	@Override
	public void enterMethodDeclaration(SmaliParser.MethodDeclarationContext ctx) {

	}

	@Override
	public void exitMethodDeclaration(SmaliParser.MethodDeclarationContext ctx) {

	}

	@Override
	public void enterAnnotationScope(SmaliParser.AnnotationScopeContext ctx) {

	}

	@Override
	public void exitAnnotationScope(SmaliParser.AnnotationScopeContext ctx) {

	}

	@Override
	public void enterAnnotationType(SmaliParser.AnnotationTypeContext ctx) {

	}

	@Override
	public void exitAnnotationType(SmaliParser.AnnotationTypeContext ctx) {

	}

	@Override
	public void enterAnnotationFieldValue(SmaliParser.AnnotationFieldValueContext ctx) {

	}

	@Override
	public void exitAnnotationFieldValue(SmaliParser.AnnotationFieldValueContext ctx) {

	}

	@Override
	public void enterAnnotationValueScoped(SmaliParser.AnnotationValueScopedContext ctx) {

	}

	@Override
	public void exitAnnotationValueScoped(SmaliParser.AnnotationValueScopedContext ctx) {

	}

	@Override
	public void enterAnnotationField(SmaliParser.AnnotationFieldContext ctx) {

	}

	@Override
	public void exitAnnotationField(SmaliParser.AnnotationFieldContext ctx) {

	}

	@Override
	public void enterAnnotations(SmaliParser.AnnotationsContext ctx) {

	}

	@Override
	public void exitAnnotations(SmaliParser.AnnotationsContext ctx) {

	}

	@Override
	public void enterAnnotationDirective(SmaliParser.AnnotationDirectiveContext ctx) {
		ANNOTATION annotation = new ANNOTATION();
		annotation.annotationScope = ctx.annotationScope().getText();
		annotation.annotationType = ctx.annotationType().getText();
		HashMap<String, String> values = new HashMap<>();
		List<SmaliParser.AnnotationFieldContext> field = ctx.annotationField();
		if (field != null) {
			for (SmaliParser.AnnotationFieldContext f : field) {
				String key = f.fieldName().getText();
				String value = null;
				SmaliParser.AnnotationFieldValueContext v1 = f.annotationFieldValue();
				SmaliParser.AnnotationValueScopedContext v2 = f.annotationValueScoped();
				if (v1 != null) {
					value = v1.getText();
				}
				if (v2 != null) {
					value = v2.getText();
				}
				values.put(key, value);
			}
		}
		annotation.annotationField = values;
		Env.r.getMethod().setAnnotations(annotation);
	}

	@Override
	public void exitAnnotationDirective(SmaliParser.AnnotationDirectiveContext ctx) {

	}

	@Override
	public void enterAnnotationDirectiveCLS(SmaliParser.AnnotationDirectiveCLSContext ctx) {
		ANNOTATION annotation = new ANNOTATION();
		annotation.annotationScope = ctx.annotationScope().getText();
		annotation.annotationType = ctx.annotationType().getText();
		HashMap<String, String> values = new HashMap<>();
		List<SmaliParser.AnnotationFieldCLSContext> field = ctx.annotationFieldCLS();
		if (field != null) {
			for (SmaliParser.AnnotationFieldCLSContext f : field) {
				String key = f.fieldName().getText();
				String value = null;
				SmaliParser.AnnotationFieldValueCLSContext v1 = f.annotationFieldValueCLS();
				SmaliParser.AnnotationValueScopedContext v2 = f.annotationValueScoped();
				if (v1 != null) {
					value = v1.getText();
				}
				if (v2 != null) {
					value = v2.getText();
				}
				values.put(key, value);
			}
		}
		annotation.annotationField = values;
		Env.r.getCls().setAnnotations(annotation);
	}

	@Override
	public void exitAnnotationDirectiveCLS(SmaliParser.AnnotationDirectiveCLSContext ctx) {

	}

	@Override
	public void enterAnnotationFieldCLS(SmaliParser.AnnotationFieldCLSContext ctx) {

	}

	@Override
	public void exitAnnotationFieldCLS(SmaliParser.AnnotationFieldCLSContext ctx) {

	}

	@Override
	public void enterAnnotationFieldValueCLS(SmaliParser.AnnotationFieldValueCLSContext ctx) {

	}

	@Override
	public void exitAnnotationFieldValueCLS(SmaliParser.AnnotationFieldValueCLSContext ctx) {

	}

	@Override
	public void enterSubAnnotationDirectiveCls(SmaliParser.SubAnnotationDirectiveClsContext ctx) {

	}

	@Override
	public void exitSubAnnotationDirectiveCls(SmaliParser.SubAnnotationDirectiveClsContext ctx) {

	}

	@Override
	public void enterLocaDirectiveVariableName(SmaliParser.LocaDirectiveVariableNameContext ctx) {

	}

	@Override
	public void exitLocaDirectiveVariableName(SmaliParser.LocaDirectiveVariableNameContext ctx) {

	}

	@Override
	public void enterLocalDirectiveType(SmaliParser.LocalDirectiveTypeContext ctx) {

	}

	@Override
	public void exitLocalDirectiveType(SmaliParser.LocalDirectiveTypeContext ctx) {

	}

	@Override
	public void enterLocalDirectiveGenericHint(SmaliParser.LocalDirectiveGenericHintContext ctx) {

	}

	@Override
	public void exitLocalDirectiveGenericHint(SmaliParser.LocalDirectiveGenericHintContext ctx) {

	}

	@Override
	public void enterLocalDirectiveRegister(SmaliParser.LocalDirectiveRegisterContext ctx) {

	}

	@Override
	public void exitLocalDirectiveRegister(SmaliParser.LocalDirectiveRegisterContext ctx) {

	}

	@Override
	public void enterLocalDirective(SmaliParser.LocalDirectiveContext ctx) {
		String registryid = ctx.localDirectiveRegister().registerIdentifier().IDENTIFIER().getText();
		CELL cell = Env.r.getMethod().getRegistry(registryid);
		CELL_DESCRIPTION cell_description = null;
		if (cell == null) {
			cell = new CELL(registryid);
			cell_description = new CELL_DESCRIPTION();
			cell.setCurrent_descriptions(cell_description);
			Env.r.getMethod().setRegistry(registryid, cell);
		}

		cell_description = cell.getCurrent_descriptions();
		SmaliParser.LocaDirectiveVariableNameContext varname = ctx.locaDirectiveVariableName();
		SmaliParser.LocalDirectiveTypeContext directiveType = ctx.localDirectiveType();
		SmaliParser.LocalDirectiveGenericHintContext directiveGenericHint = ctx.localDirectiveGenericHint();
		if (varname != null) {
			cell.setDeclaredVariableName(varname.getText());
			if (directiveType != null) {
				if (directiveType.toString().endsWith("/PendingIntent;")) {
					cell_description.iccObjects = new PendingIntent();
					cell_description.iccObjects.type = directiveType.toString();
					cell_description.iccObjects.ownerAppName = Env.activePackageName;
					cell_description.iccObjects.declaredVariableName = varname.getText();
				}
				if (directiveType.toString().endsWith("Ljava/io/ObjectOutputStream;")) {
					cell_description.iccObjects = new __MuOutputStream();
					cell_description.iccObjects.type = directiveType.toString();
					cell_description.iccObjects.ownerAppName = Env.activePackageName;
					cell_description.iccObjects.declaredVariableName = varname.getText();
				}
			}
		}
		if (directiveType != null) {
			cell.setDeclaredVariableType(directiveType.getText());
			cell.setActualVariableType(directiveType.getText());
			cell_description.setClsType(directiveType.getText());
			cell_description.setObjType(directiveType.getText());
			if (directiveType.getText().endsWith("/PendingIntent;")) {
				// piMonitorForMultipleCreation = true;
				// Env.stats.noOfPendingIntents++;
				// Env.log.append("PICOUNT >>>>>> "+cell
				// +Env.stats.noOfPendingIntents+"=:>>"+Env.stats.totalFlagCount()+"\n");
			}
			if (directiveType.getText().endsWith("/Intent;")) {
				////// ////System.out.println("1>> "+Env.activeSmaliFileName);
				if (cell.getPresentVariableType() != null)
					if (cell.getPresentVariableType().equals("stringType")) {
						cell.setVulnerable(true, VulnerabilityType.intent);
					}
				if (cell.getPresentVariableType() == null)
					cell.setVulnerable(true, VulnerabilityType.intent);
				Env.stats.noOfIntents++;
			}
		}
		if (directiveGenericHint != null) {
			cell.setDirectiveGenericHint(directiveGenericHint.getText());
		}

	}

	@Override
	public void exitLocalDirective(SmaliParser.LocalDirectiveContext ctx) {

	}

	@Override
	public void enterLocalEndDirective(SmaliParser.LocalEndDirectiveContext ctx) {

	}

	@Override
	public void exitLocalEndDirective(SmaliParser.LocalEndDirectiveContext ctx) {

	}

	@Override
	public void enterLocalRestartDirective(SmaliParser.LocalRestartDirectiveContext ctx) {

	}

	@Override
	public void exitLocalRestartDirective(SmaliParser.LocalRestartDirectiveContext ctx) {

	}

	@Override
	public void enterLineLabel(SmaliParser.LineLabelContext ctx) {

	}

	@Override
	public void exitLineLabel(SmaliParser.LineLabelContext ctx) {

	}

	@Override
	public void enterMethodBodyStatement(SmaliParser.MethodBodyStatementContext ctx) {

	}

	@Override
	public void exitMethodBodyStatement(SmaliParser.MethodBodyStatementContext ctx) {

	}

	@Override
	public void enterMethodBody(SmaliParser.MethodBodyContext ctx) {

	}

	@Override
	public void exitMethodBody(SmaliParser.MethodBodyContext ctx) {

	}

	@Override
	public void enterPrologueDirective(SmaliParser.PrologueDirectiveContext ctx) {

	}

	@Override
	public void exitPrologueDirective(SmaliParser.PrologueDirectiveContext ctx) {

	}

	@Override
	public void enterPackedSwitchIdent(SmaliParser.PackedSwitchIdentContext ctx) {

	}

	@Override
	public void exitPackedSwitchIdent(SmaliParser.PackedSwitchIdentContext ctx) {

	}

	@Override
	public void enterPackedSwitchDirectiveLabel(SmaliParser.PackedSwitchDirectiveLabelContext ctx) {

	}

	@Override
	public void exitPackedSwitchDirectiveLabel(SmaliParser.PackedSwitchDirectiveLabelContext ctx) {

	}

	@Override
	public void enterPackedSwitchDirectiveLabels(SmaliParser.PackedSwitchDirectiveLabelsContext ctx) {

	}

	@Override
	public void exitPackedSwitchDirectiveLabels(SmaliParser.PackedSwitchDirectiveLabelsContext ctx) {

	}

	@Override
	public void enterPackedSwitchDirective(SmaliParser.PackedSwitchDirectiveContext ctx) {

	}

	@Override
	public void exitPackedSwitchDirective(SmaliParser.PackedSwitchDirectiveContext ctx) {

	}

	static boolean piMonitorForMultipleCreation = false;
	String keymethodname = "";

	@Override
	public void enterMethodDirective(SmaliParser.MethodDirectiveContext ctx) {
		Env.r.newMethod();
		if (ctx.methodDeclaration() != null) {
			if (ctx.methodDeclaration().methodSignature() != null) {
				String methodName = ctx.methodDeclaration().methodSignature().methodIdentifier().getText();
				keymethodname = Env.r.getCls().getClassname() + methodName;

				if (methodName.equals("<init>")) {
					Env.r.getMethod().setConstructor(true);
				}

				Env.r.getMethod().setMethodname(ctx.methodDeclaration().methodSignature().methodIdentifier().getText());
				SmaliParser.MethodArgumentsContext args = ctx.methodDeclaration().methodSignature().methodArguments();

				if (args != null) {
					List<SmaliParser.MethodParameterTypeContext> mptype = args.methodParameterType();
					if (mptype.size() > 0) {
						Env.r.getMethod().setParamTypes(String.valueOf(mptype.size()));
						Env.r.getMethod().setNoOfParams(mptype.size());

						for (int i = 0; i < mptype.size(); i++) {
							SmaliParser.MethodParameterTypeContext paramtype = mptype.get(i);
							Env.r.getMethod().setParamTypes(paramtype.getText());
						}
					}
				}
				if (ctx.methodDeclaration().methodSignature().methodReturnType() != null) {
					Env.r.getMethod()
							.setReturntype(ctx.methodDeclaration().methodSignature().methodReturnType().getText());
				}
				List<SmaliParser.MethodModifierContext> modifiers = ctx.methodDeclaration().methodModifier();
				for (SmaliParser.MethodModifierContext mc : modifiers) {
					Env.r.getMethod().setModifier(mc.getText());
				}

			} else
				Env.r.getMethod().setMethodname(ctx.methodDeclaration().getText());
		}

	}

	@Override
	public void exitMethodDirective(SmaliParser.MethodDirectiveContext ctx) {
		Env.r.getCls().setMethods(Env.r.getMethod());

		if (Env.isMethodVulnerable) {
			Env.r.getMethod().setVulnerable(true);
		}

		Env.isMethodVulnerable = false;
		Env.methodreport.put(keymethodname, Env.r.getMethod());

		Env.r.finalizeMethod();
		piMonitorForMultipleCreation = false;
	}

	@Override
	public void enterRegistersDirective(SmaliParser.RegistersDirectiveContext ctx) {
		Env.r.getMethod().setNoOfRegisterCells(Integer.parseInt(ctx.numericLiteral().getText()));
		Env.r.getMethod().setNoOfLocals(Integer.parseInt(ctx.numericLiteral().getText()));

	}

	@Override
	public void exitRegistersDirective(SmaliParser.RegistersDirectiveContext ctx) {

	}

	@Override
	public void enterLocalsDirective(SmaliParser.LocalsDirectiveContext ctx) {
		Env.r.getMethod().setNoOfLocals(Integer.parseInt(ctx.numericLiteral().getText()));
	}

	@Override
	public void exitLocalsDirective(SmaliParser.LocalsDirectiveContext ctx) {

	}

	@Override
	public void enterSimpleParamDirective(SmaliParser.SimpleParamDirectiveContext ctx) {

	}

	@Override
	public void exitSimpleParamDirective(SmaliParser.SimpleParamDirectiveContext ctx) {

	}

	@Override
	public void enterExtendedParamDirective(SmaliParser.ExtendedParamDirectiveContext ctx) {

	}

	@Override
	public void exitExtendedParamDirective(SmaliParser.ExtendedParamDirectiveContext ctx) {

	}

	@Override
	public void enterParamDirective(SmaliParser.ParamDirectiveContext ctx) {
		CELL cell = new CELL(ctx.registerIdentifier().getText(), ctx.paramDirectivesOptions().getText(),
				CELL_DESCRIPTION.T_PARAMDIRECTIVES);
		Env.r.getMethod().setRegistry(ctx.registerIdentifier().getText(), cell);
	}

	@Override
	public void exitParamDirective(SmaliParser.ParamDirectiveContext ctx) {

	}

	@Override
	public void enterParamDirectivesOptions(SmaliParser.ParamDirectivesOptionsContext ctx) {

	}

	@Override
	public void exitParamDirectivesOptions(SmaliParser.ParamDirectivesOptionsContext ctx) {

	}

	@Override
	public void enterLineDirective(SmaliParser.LineDirectiveContext ctx) {

	}

	@Override
	public void exitLineDirective(SmaliParser.LineDirectiveContext ctx) {

	}

	@Override
	public void enterCatchFromLabel(SmaliParser.CatchFromLabelContext ctx) {

	}

	@Override
	public void exitCatchFromLabel(SmaliParser.CatchFromLabelContext ctx) {

	}

	@Override
	public void enterCatchToLabel(SmaliParser.CatchToLabelContext ctx) {

	}

	@Override
	public void exitCatchToLabel(SmaliParser.CatchToLabelContext ctx) {

	}

	@Override
	public void enterCatchGotoLabel(SmaliParser.CatchGotoLabelContext ctx) {

	}

	@Override
	public void exitCatchGotoLabel(SmaliParser.CatchGotoLabelContext ctx) {

	}

	@Override
	public void enterCatchExceptionType(SmaliParser.CatchExceptionTypeContext ctx) {

	}

	@Override
	public void exitCatchExceptionType(SmaliParser.CatchExceptionTypeContext ctx) {

	}

	@Override
	public void enterCatchDirective(SmaliParser.CatchDirectiveContext ctx) {

	}

	@Override
	public void exitCatchDirective(SmaliParser.CatchDirectiveContext ctx) {

	}

	@Override
	public void enterCatchAllDirective(SmaliParser.CatchAllDirectiveContext ctx) {

	}

	@Override
	public void exitCatchAllDirective(SmaliParser.CatchAllDirectiveContext ctx) {

	}

	@Override
	public void enterArrayDataDirective(SmaliParser.ArrayDataDirectiveContext ctx) {

	}

	@Override
	public void exitArrayDataDirective(SmaliParser.ArrayDataDirectiveContext ctx) {

	}

	@Override
	public void enterArrayDataEntry(SmaliParser.ArrayDataEntryContext ctx) {

	}

	@Override
	public void exitArrayDataEntry(SmaliParser.ArrayDataEntryContext ctx) {

	}

	@Override
	public void enterSparseSwitchDirectiveValue(SmaliParser.SparseSwitchDirectiveValueContext ctx) {

	}

	@Override
	public void exitSparseSwitchDirectiveValue(SmaliParser.SparseSwitchDirectiveValueContext ctx) {

	}

	@Override
	public void enterSparseSwitchDirective(SmaliParser.SparseSwitchDirectiveContext ctx) {

	}

	@Override
	public void exitSparseSwitchDirective(SmaliParser.SparseSwitchDirectiveContext ctx) {

	}

	@Override
	public void enterStatement(SmaliParser.StatementContext ctx) {

	}

	@Override
	public void exitStatement(SmaliParser.StatementContext ctx) {

	}

	@Override
	public void enterParse(SmaliParser.ParseContext ctx) {

	}

	@Override
	public void exitParse(SmaliParser.ParseContext ctx) {
		String key = Env.r.getCls().getSourceFileName();
		if (Env.activeproject.getActivities().containsKey(key)) {
			List<CLASS> clz = Env.activeproject.getActivities().get(key);
			clz.add(Env.r.getCls());
			Env.activeproject.getActivities().put(key, clz);
		} else {
			List<CLASS> clz = new ArrayList<>();
			clz.add(Env.r.getCls());
			Env.activeproject.getActivities().put(key, clz);
		}
	}

	@Override
	public void visitTerminal(TerminalNode node) {

	}

	@Override
	public void visitErrorNode(ErrorNode node) {

	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// ////////////System.out.println("EVERYRULE>> "+ctx.getText());
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// ////////////System.out.println("exitEveryRule>> "+ctx.getText());
	}
}
