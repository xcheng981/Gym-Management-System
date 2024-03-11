package edu.northeastern.mygym.course;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ReservationDirectory {
    private final List<Reservation> reservations;

    public ReservationDirectory(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Reservation> viewAllReservations() {
        return reservations;
    }
    public List<Reservation> listReservationsByUserName(String userName) {
        List<Reservation> reservationsForUser = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getUserName().equals(userName)) {
                reservationsForUser.add(reservation);
            }
        }
        return reservationsForUser;
    }

    public Reservation findReservationById(String reservationId) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationId().equals(reservationId)) {
                return reservation;
            }
        }
        return null;
    }


    public String createReservation(String userName, String courseId) {
        String reservationId = UUID.randomUUID().toString();
        Reservation reservation = new Reservation(reservationId, userName, courseId);
        this.addReservation(reservation);
        return reservationId;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void removeReservation(String reservationId) {
        reservations.remove(findReservationById(reservationId));
    }

}
