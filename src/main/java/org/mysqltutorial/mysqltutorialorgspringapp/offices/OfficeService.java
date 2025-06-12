package org.mysqltutorial.mysqltutorialorgspringapp.offices;

import lombok.AllArgsConstructor;
import org.mysqltutorial.mysqltutorialorgspringapp.offices.OfficeDto;
import org.mysqltutorial.mysqltutorialorgspringapp.offices.OfficeMapper;
import org.mysqltutorial.mysqltutorialorgspringapp.offices.OfficeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OfficeService {

    private OfficeRepository officeRepository;
    private OfficeMapper officeMapper;

    public List<OfficeDto> getAllOffices() {
        return officeRepository.findAll().stream()
                .map(officeMapper::toOfficeDto)
                .collect(Collectors.toList());
    }

    public void printAllOffices() {
        for (OfficeDto officeDto : getAllOffices()) {
            System.out.println(officeDto.toString());
        }
    }
}
