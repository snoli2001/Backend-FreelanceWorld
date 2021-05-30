package com.ezlabor.hiring.domain.repository;

import com.ezlabor.hiring.domain.model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
    List<Meeting> findAllByOfferId(Long offerId);
    Optional<Meeting> findMeetingByIdAndOfferId(Long offerId, Long id);
}
