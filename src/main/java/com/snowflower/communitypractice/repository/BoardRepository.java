package com.snowflower.communitypractice.repository;

import com.snowflower.communitypractice.domain.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
