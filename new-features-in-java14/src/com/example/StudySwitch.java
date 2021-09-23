package com.example;

public class StudySwitch {

	public static void main(String[] args) {
		int dayOfWeek = 4;
		String status;
		switch (dayOfWeek) { // byte, short, int, char, enum, String (Java 7)
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			status = "working";
			break;
		case 6:
		case 7:
			status = "resting";
			break;
		default:
			status = "unknown";
		}
		System.err.println(status);
		switch (dayOfWeek) {
		case 1, 2, 3, 4, 5:
			status = "working";
			break;
		case 6, 7:
			status = "resting";
			break;
		default:
			status = "unknown";
		}
		switch (dayOfWeek) {
		case 1, 2, 3, 4, 5 -> {
			status = "working";
		}
		case 6, 7 -> {
			status = "resting";
		}
		default -> {
			status = "unknown";
		}
		}
		var state = switch (dayOfWeek) {
			case 1, 2, 3, 4, 5 -> "working";
			case 6, 7 -> "resting";
			default -> "unknown";
		};
		state = switch (dayOfWeek) {
		case 1, 2, 3, 4, 5 -> { yield "working"; }
		case 6, 7 -> { yield "resting"; }
		default -> { yield "unknown";}
		};
		System.err.println(state);
	}

}
