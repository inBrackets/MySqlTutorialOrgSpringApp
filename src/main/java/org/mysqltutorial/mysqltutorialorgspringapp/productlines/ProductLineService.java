package org.mysqltutorial.mysqltutorialorgspringapp.productlines;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductLineService {

    private ProductLineRepository productLineRepository;

    public void printAllProductLines() {
        for(ProductLineEntity productLineEntity : productLineRepository.findAll()) {
            System.out.println(productLineEntity);
        }
    }
}
