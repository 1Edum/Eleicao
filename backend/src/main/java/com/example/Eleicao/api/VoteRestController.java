package com.example.Eleicao.api;

import com.example.Eleicao.model.Vote;
import com.example.Eleicao.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/votes")
public class VoteRestController {
    @Autowired
    private VoteService voteService;

    @GetMapping
    public List<Vote> getAllVotes() {
        return voteService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vote> getVoteById(@PathVariable Long id) {
        Optional<Vote> vote = voteService.findById(id);
        return vote.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vote createVote(@RequestBody Vote vote) {
        return voteService.save(vote);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vote> updateVote(@PathVariable Long id, @RequestBody Vote voteDetails) {
        Optional<Vote> vote = voteService.findById(id);
        if (vote.isPresent()) {
            Vote existingVote = vote.get();
            existingVote.setVoter(voteDetails.getVoter());
            existingVote.setCandidate(voteDetails.getCandidate());
            existingVote.setClassroom(voteDetails.getClassroom());
            Vote updatedVote = voteService.save(existingVote);
            return ResponseEntity.ok(updatedVote);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVote(@PathVariable Long id) {
        Optional<Vote> vote = voteService.findById(id);
        if (vote.isPresent()) {
            voteService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
