package br.edu.ifpb.padroes.realstatev2.repository;

import br.edu.ifpb.padroes.realstatev2.domain.Apartment;
import br.edu.ifpb.padroes.realstatev2.domain.Tenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenementRepository extends JpaRepository<Tenement, Long> {
}
