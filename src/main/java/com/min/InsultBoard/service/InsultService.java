package com.min.InsultBoard.service;

import com.min.InsultBoard.dto.CreateInsultRequest;
import com.min.InsultBoard.entity.Insult;
import com.min.InsultBoard.repository.InsultRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InsultService {
    private InsultRepository insultRepository;

    @Transactional
    public Insult createInsult(CreateInsultRequest request){
        return insultRepository.save(new Insult(request.getContent()));
    }
}
