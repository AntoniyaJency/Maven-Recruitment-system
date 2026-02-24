// Display Jobs
const jobTableBody = document.querySelector("#jobTable tbody");

fetch("http://localhost:8080/api/jobs")
    .then(res => res.json())
    .then(jobs => {
        jobs.forEach(job => {
            const row = document.createElement("tr");
            row.innerHTML = `
                <td>${job.id}</td>
                <td>${job.title}</td>
                <td>${job.description}</td>
            `;
            jobTableBody.appendChild(row);
        });
    });

// Apply Form
const applyForm = document.querySelector("#applyForm");
applyForm.addEventListener("submit", e => {
    e.preventDefault();
    const candidate = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        jobId: parseInt(document.getElementById("jobId").value)
    };
    fetch("http://localhost:8080/api/candidates", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(candidate)
    })
    .then(() => alert("Application submitted!"))
    .catch(err => console.error(err));
});
