package br.edu.ifpb.padroes.realstatev2.repository;

import br.edu.ifpb.padroes.realstatev2.domain.Apartment;
import br.edu.ifpb.padroes.realstatev2.domain.Bungalow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BungalowRepository extends JpaRepository<Bungalow, Long> {
}
