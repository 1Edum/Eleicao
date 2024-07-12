package com.example.Eleicao.service;

import com.example.Eleicao.model.Vote;
import com.example.Eleicao.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public List<Vote> findAll() {
        return voteRepository.findAll();
    }

    public Optional<Vote> findById(Long id) {
        return voteRepository.findById(id);
    }

    public Vote save(Vote vote) {
        return voteRepository.save(vote);
    }

    public void deleteById(Long id) {
        voteRepository.deleteById(id);
    }
}
