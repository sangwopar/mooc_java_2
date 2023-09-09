package FlightControl.ui;

import java.util.Scanner;

import FlightControl.domain.Airplane;
import FlightControl.logic.FlightControl;

public class TextUI {

	private FlightControl flightControl;
	private Scanner scanner;

	public TextUI(FlightControl flightControl, Scanner scanner) {
		this.flightControl = flightControl;
		this.scanner = scanner;
	}

	public void start() {
		startAssetControl();
		System.out.println();
		startFlightControl();
		System.out.println();
	}

	private void startAssetControl() {
		System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

		while (true) {
			System.out.println("Choose an action:");
			System.out.println("[1] Add an airplane");
			System.out.println("[2] Add a flight");
			System.out.println("[x] Exit Airport Asset Control");
			System.out.print("> ");
			String input = scanner.nextLine();
			if (input.equals("x")) {
				break;
			} else {
				if (input.equals("1")) {
					addAirplane();
				} else if (input.equals("2")) {
					addFlight();
				}
			}
		}
	}

	private void addAirplane() {
		System.out.print("Give the airplane id: ");
		String id = scanner.nextLine();
		System.out.print("Give the airplane capacity: ");
		int capacity = Integer.valueOf(scanner.nextLine());
		flightControl.addAirplane(id, capacity);
	}

	private void addFlight() {
		System.out.print("Give the airplane id: ");
		Airplane id = askForAirplane();
		System.out.print("Give the departure airport id: ");
		String departureId = scanner.nextLine();
		System.out.print("Give the target airport id: ");
		String targetId = scanner.nextLine();
		flightControl.addFlight(id, departureId, targetId);
	}

	private void startFlightControl() {
		System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

		while (true) {
			System.out.println("Choose an action:");
			System.out.println("[1] Print airplanes");
			System.out.println("[2] Print flights");
			System.out.println("[3] Print airplane details");
			System.out.println("[x] Quit");
			System.out.print("> ");
			String input = scanner.nextLine();
			if (input.equals("x")) {
				break;
			} else {
				if (input.equals("1")) {
					printAirplanes();
				} else if (input.equals("2")) {
					printFlights();
				} else if (input.equals("3")) {
					printAirplane();
				}
			}

		}
	}

	private void printAirplanes() {
		flightControl.getAirplanes().stream().forEach(s -> System.out.println(s));
		System.out.println();
	}

	private void printAirplane() {
		System.out.print("Give the airplane id: ");
		Airplane plane = askForAirplane();
		System.out.println(plane);
		System.out.println();
	}
	
	private void printFlights() {
		flightControl.getFlights().stream().forEach(s -> System.out.println(s));
	}

	private Airplane askForAirplane() {
		Airplane airplane = null;
		while (airplane == null) {
			String id = scanner.nextLine();
			airplane = flightControl.getAirplane(id);
			if (airplane == null) {
				System.out.println("No airplane with the id " + id + ".");
			}
		}
		return airplane;
	}



}
