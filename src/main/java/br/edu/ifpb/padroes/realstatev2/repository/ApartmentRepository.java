package br.edu.ifpb.padroes.realstatev2.repository;

import br.edu.ifpb.padroes.realstatev2.domain.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository  extends JpaRepository<Apartment, Long> {
}
