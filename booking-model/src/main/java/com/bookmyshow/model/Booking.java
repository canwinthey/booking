package com.bookmyshow.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity(name = "BOOKING")
public class Booking {

	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "booking_id")
	private Long bookingId;

	@OneToOne(fetch = FetchType.LAZY)
	private Show show;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Movie movie;
	
	@Column(name = "no_of_seats")
	private int noOfSeats;
	
	@Column(name = "booking_status")
	private String bookingStatus;
	
    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

	@Override
	public int hashCode() {
		return Objects.hash(bookingId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return bookingId == other.bookingId;
	}
}
